import java.util.*;


//Work on project. Stage 5/5:Manage stats and make your app error-prone
public class Cinema3 {
    int ticketsBought = 0;
	double Percentage = 0.00;
    int numberOfRows ;
    int numOfSeatsPerRow;
    int value;
	int totalSeats =0; 
	int totalCost = 0;
	int ticketPrice = 0;
    String [][] floor ;
    int TotalticketPrice =0;
    public Cinema3(int numberOfRows, int numOfSeatsPerRow){
		this.floor = new String [numberOfRows+1][1+numOfSeatsPerRow];
        this.numberOfRows = numberOfRows;
        this.numOfSeatsPerRow = numOfSeatsPerRow;
		this.totalSeats = numOfSeatsPerRow * numberOfRows;
    }
    
    public  void TotalInc(int Seats,int Rows, int numOfRows, int numOfSeatsPerRow ){
        int frontHalfRow = numOfRows/2;
        int backHalfRow = numOfRows - frontHalfRow;

        if (totalSeats<=60){
            ticketPrice =  10;
			totalCost = totalSeats * ticketPrice;
        }else{
            if (Rows<= frontHalfRow){
                ticketPrice = 10 ;
            }else{
                ticketPrice = 8 ;
            }
			totalCost = (frontHalfRow * numOfSeatsPerRow * 10) + (backHalfRow * numOfSeatsPerRow * 8);

        }
        
        if (Seats != 0 && Rows != 0){
            System.out.println("Ticket price: $"+ ticketPrice);
        }else{
            ticketPrice = 0;
        }

    }
    public  String [][] cinemaFloor(String [][] floor, int numOfSeatsPerRow,int numOfRows){
        int nRow = 1;
        int nCol = 1;
        // System.out.println("Cinema:");
        for(int row=0;row<numOfRows;row++){
            for(int col=0; col<numOfSeatsPerRow;col++){
                if (row==0){
                    if (col ==0){
                        floor[0][0]=" ";
                    }else{
                        floor[row][col] = String.valueOf(nCol);
                        nCol++;
                    }
                }else if (col==0){
                    floor[row][col] = String.valueOf(nRow);
                    nRow++;
                }else{
                    floor[row][col] = "S";
                }
                //System.out.print(floor[row][col]+" ");
            }
//System.out.println();
        }
        //printFloor(floor);
        return floor;
    }
    public  void printFloor(String [][]floor){
        System.out.println("Cinema:");
        for(String row[]: floor){
            for(String seats: row){
                System.out.print(seats+" ");
            }
            System.out.println();
        }
    }

    public  int  choices(Scanner sc, String [][]floor, int numOfSeatsPerRow,int numOfRows){
        System.out.println("1. Show the seats\n2. Buy a ticket\n3. Statistics\n0. Exit");
        int chose = sc.nextInt();
        switch(chose){
            case 0:
                // System.exit();
                break;
            case 1:
                printFloor(floor);
                break;
            case 2:
                int [] rowSeat = new int[2];
                int row =0;
                int seat = row;
                boolean Avail ;
                do{
                    do{
                        rowSeat = questions(sc, rowSeat);
                        row = rowSeat[0];
                        seat= rowSeat[1];
                        if ((row > numOfRows && row >0 )||(seat >numOfSeatsPerRow &&  seat > 0 )){
                            System.out.println("Wrong input!");
                        }

                    }while(row > numOfRows && row >0 ||seat >numOfSeatsPerRow &&  seat > 0 );


                    Avail = isSeatAvail(floor,row,seat);
                    if (!Avail) {
                        System.out.println("That ticket has already been purchased!");
                    }
                }while(!Avail);

                TotalInc(seat, row, numOfRows, numOfSeatsPerRow);
                floor[row][seat] = "B";
				this.ticketsBought++;
                TotalticketPrice += ticketPrice;
                //statsInfo = new {ticketsBought, percentage,currentMonies, TotalMonies};

                break;
            case 3:
                printStats();
                break;
        }
        return chose;
    }

    public  void  printStats(){
       
        System.out.printf("Number of purchased tickets: %d \n", getTicketsBought());
        System.out.printf("Percentage: %.2f",getPercentage());System.out.println("%");
        System.out.printf("Current income: $%d \n", getCurrentIncome());
        System.out.printf("Total income: $%d \n", getTotalIncome());
    
    }
    public int getTicketsBought() {
        return ticketsBought;
    }
	

    public double getPercentage(){
		Percentage = (ticketsBought /(double)totalSeats)*100;
        return Percentage;
    }
	
	 public int getCurrentIncome() {
        return TotalticketPrice;
    }
    public int getTotalIncome(){
		return totalCost;
    }

    public boolean  isSeatAvail(String [][]floor, int Row, int Seat){
        return floor[Row][Seat].equals("S");
    }
    public int[]  questions(Scanner sc, int [] rowSeat){
        System.out.println("Enter a row number:");
        int Row = sc.nextInt();
        System.out.println("Enter a seat number in that row:");
        int Seat = sc.nextInt();
        rowSeat[0] = Row;
        rowSeat[1] = Seat;
        return rowSeat;
    }
    public void start(Scanner sc){
        this.floor = cinemaFloor(floor, numOfSeatsPerRow+1, numberOfRows+1);
        System.out.println();
        int value = -1;
        do {
            value = choices(sc, floor, numOfSeatsPerRow, numberOfRows);
        }
        while(value != 0);
    }
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int numOfRows = sc.nextInt();
        
        System.out.println("Enter the number of seats in each row:");
        int numOfSeatsPerRow = sc.nextInt();
        System.out.println();
        
        Cinema3 cinema = new Cinema3(numOfRows ,numOfSeatsPerRow);
        cinema.TotalInc(0,0,numOfRows, numOfSeatsPerRow);
        cinema.start(sc);
    }
}