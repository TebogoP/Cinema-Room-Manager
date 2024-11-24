import java.util.*;


//Work on project. Stage 4/5:Add menu to your application
public class Cinema2 {
    public static void TotalInc(int Seats,int Rows, int numOfRows, int numOfSeatsPerRow ){

        int totalSeats = --numOfSeatsPerRow * --numOfRows;
        int frontHalfRow = numOfRows/2;
        int backHalfRow = numOfRows - frontHalfRow;
        int totalCost = 0;
        //int price = 0;

        if (totalSeats<=60){
            totalCost =  10;
        }else{
            if (Rows<= frontHalfRow){
                totalCost = 10 ;
            }else{
                totalCost = 8 ;
            }

        }
        System.out.println("Ticket price: $"+ totalCost);

    }
    public static String [][] cinemaFloor(String [][] floor, int numOfSeatsPerRow,int numOfRows){
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
    public static void printFloor(String [][]floor){
        System.out.println("Cinema:");
        for(String row[]: floor){
            for(String seats: row){
                System.out.print(seats+" ");
            }
            System.out.println();
        }
    }

    public static int  choices(Scanner sc, String [][]floor, int numOfSeatsPerRow,int numOfRows){
        System.out.println("1. Show the seats\n2. Buy a ticket\n0. Exit");
        int chose = sc.nextInt();
        switch(chose){
            case 0:
                // System.exit();
                break;
            case 1:
                printFloor(floor);
                break;
            case 2:
                System.out.println("Enter a row number:");
                int Row = sc.nextInt();

                System.out.println("Enter a seat number in that row:");
                int Seat = sc.nextInt();
                TotalInc(Seat,Row, numOfRows, numOfSeatsPerRow);
                floor[Row][Seat] ="B";
                break;

        }
        return chose;
    }

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int numOfRows = sc.nextInt();
        System.out.println();

        System.out.println("Enter the number of seats in each row:");
        int numOfSeatsPerRow = sc.nextInt();
        System.out.println();

        String [][] floor = new String [++numOfRows][++numOfSeatsPerRow];

        floor = cinemaFloor(floor, numOfSeatsPerRow,numOfRows);
        System.out.println();
        int value = -1;
        do {
            value = choices(sc, floor, numOfSeatsPerRow, numOfRows);
        }
            while(value != 0);
        }
    }