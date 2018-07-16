/*
Author: Peter Lewis
Date: 2018-02-05
Puprose: class that intilaizes a matrix of a given range of sizes and modifes that matrix 
 */
package matrix;

public class matrixDec {
    private int row;
    private int col;    
    private String matrix[][];
    
    //constructor for calss matricDec
    public matrixDec(int row, int col){
        this.row = row;
        this.col = col;
        
        matrix  = new String[row][col];
    }
    
    public void giveValueToMatrix(double value){
        for(int i =0;i<=row-1;i++){
            for(int j = 0; j<=col-1;j++){
                matrix[i][j] = Double.toString(value);
            }
        }
    }
    
    public void outputMatrix(){
        for(int i =0;i<=row-1;i++){
            for(int j =0; j<=col-1;j++){
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }
    }
    
    public void changeIndexValue(int indexRow, int indexCol, String changedIndexVal){
        matrix[indexRow][indexCol] = changedIndexVal;
    }
   
    
    
}
