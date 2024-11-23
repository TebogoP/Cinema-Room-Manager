package cinema;
import java.util.*;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here
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
        //System.out.println(floor.length);
    }
}
