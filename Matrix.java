/*
Author: Peter Lewis
Date: 2018-02-05
Purpose: Make, and manipulate arrays
Future Updates: Transition to pure GUI
 */
package matrix;
import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        matrixDec matrixMain; //initalizes matrixMain which is just the matrix we use in here the main class
        int rows = 0; //variable that stores number of rows for the matrix
        int col = 0; //stores the number of collums for the matrix
        double matrixAll;
        String userInput;
        Boolean loopCheck = false;
        
        System.out.println("Welcome to the Matrix program!");
        System.out.print("Input number of rows of your matrix: ");
        rows = in.nextInt();
        System.out.print("Input number of columns of your matrix: ");
        col = in.nextInt();
        
        matrixMain = new matrixDec(rows, col);
        
        do{
            System.out.println();
            System.out.println("What would you like to do? (choose by the number of the option)");
            System.out.println("1. Show matrix");
            System.out.println("2. Make the matrix all one value");
            System.out.println("3. Add to a specific index in the matrix");
            System.out.println("4. Exit program");
            userInput = in.next();
        
            if (userInput.equals("1")){
                matrixMain.outputMatrix();
            } else if (userInput.equals("2")){
                System.out.print("Input a numerical value for the entrie matrix to be: ");
                matrixAll = in.nextDouble();
                matrixMain.giveValueToMatrix(matrixAll);
            } else if (userInput.equals("3")){
                int indexCol;
                int indexRow;
                double indexVal;
            
                System.out.print("Input the row you want to change: ");
                indexRow = in.nextInt();
                System.out.print("Inut the column you want to change: ");
                indexCol = in.nextInt();
                System.out.println("What would you like to change the index value too: ");
                indexVal = in.nextDouble();
            
                matrixMain.changeIndexValue(indexRow-1, indexCol-1, Double.toString(indexVal));
            } else if(userInput.equals("4")){
                System.out.println("Thank you.");
                loopCheck = true;
            }else{
                System.out.println("Input error. Please select one of the options.");
                loopCheck = false;
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
            }
        
        } while(loopCheck == false);
    }
    
    public void matrixMult(){
        
       
        
    }
    
}
