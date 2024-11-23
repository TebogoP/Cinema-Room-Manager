package cinema;
import java.util.*;

public class Cinema {
    // Work on project. Stage 2/5:Calculate the profit
    public static void TotalInc(int numOfSeatsPerRow,int numOfRows ){
        
        int totalSeats = numOfSeatsPerRow * numOfRows;
        int frontHalfRow = numOfRows/2;
        int backHalfRow =numOfRows - frontHalfRow;
        int totalCost=0;
        
        if (totalSeats<=60){
            totalCost = totalSeats * 10;
        }else{
            totalCost = ((frontHalfRow * numOfSeatsPerRow) *10) + ((backHalfRow * numOfSeatsPerRow) *8);
        }
        System.out.print("Total income:\n$"+ totalCost);
        
    }

    public static void main(String[] args) {
        // Write your code here

        //Work on project. Stage 1/5:Print seats
        String [][] floor = new String [9][9];
        int nRow = 1;
        int nCol = 1;
       System.out.println("Cinema:");
       
        for(int row=0;row<8;row++){
            for(int col=0; col<9;col++){
                
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
                System.out.print(floor[row][col]+" ");
            }
            System.out.println();
        }

        // Work on project. Stage 2/5:Calculate the profit
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int numOfRows = sc.nextInt();
        
        System.out.println("Enter the number of seats in each row:");
        int numOfSeatsPerRow = sc.nextInt();
        
        TotalInc(numOfSeatsPerRow,numOfRows );    
    }
}
