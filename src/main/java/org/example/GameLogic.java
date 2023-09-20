
package org.example;

import java.util.Scanner;

public class GameLogic {

    public GameLogic(){}

    public void initialiseGame(){
        System.out.println("xoxoxoxoxoxoxoxoxoxo");
        System.out.println("This is Tic Tac Toe!");
        System.out.println("xoxoxoxoxoxoxoxoxoxo");
        System.out.println();
    }

    public boolean playAgain(){
        System.out.println("Would you like to play again (y/n)?");
        Scanner playAgainScanner = new Scanner(System.in);
        String continueGame = playAgainScanner.nextLine();
        boolean correct = false;
        if (continueGame.equalsIgnoreCase("y")||continueGame.equalsIgnoreCase("yes")){
            System.out.println("Let's go again!");
        }
        else{
            System.out.println("Thanks for playing Tic Tac Toe!");
            correct = true;
        }
        return correct;
    }

    public boolean checkLegalMove(int row, int col, String[][] array) {
        boolean legal = false;
        if (array[row][col].equals(" ")){
            legal = true;
        }
        else{
            System.out.println("This square is already occupied, pick another!");
        }
        return legal;
    }

    public boolean checkBoardFull(String[][] array) {
        boolean isBoardFull = true;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                if(array[i][j].equals(" ")){
                    isBoardFull=false;
                    break;
                }
            }
        }
        return isBoardFull;
    }


    //check if there's a winner
    public boolean checkWinner(String[][] array) {
        boolean isThereAWinner = false;
        if((array[0][0] + array[0][1] + array[0][2]).equals("XXX") || (array[0][0] + array[0][1] + array[0][2]).equals("OOO")){
            isThereAWinner = true;
        }
        else if((array[1][0] + array[1][1] + array[1][2]).equals("XXX") || (array[1][0] + array[1][1] + array[1][2]).equals("OOO")){
            isThereAWinner = true;
        }
        else if((array[2][0] + array[2][1] + array[2][2]).equals("XXX") || (array[2][0] + array[2][1] + array[2][2]).equals("OOO")){
            isThereAWinner = true;
        }
        else if((array[0][0] + array[1][0] + array[2][0]).equals("XXX") || (array[0][0] + array[1][0] + array[2][0]).equals("OOO")){
            isThereAWinner = true;
        }
        else if((array[0][1] + array[1][1] + array[2][1]).equals("XXX") || (array[0][1] + array[1][1] + array[2][1]).equals("OOO")){
            isThereAWinner = true;
        }
        else if((array[0][2] + array[1][2] + array[2][2]).equals("XXX") || (array[0][2] + array[1][2] + array[2][2]).equals("OOO")){
            isThereAWinner = true;
        }
        else if((array[0][0] + array[1][1] + array[2][2]).equals("XXX") || (array[0][0] + array[1][1] + array[2][2]).equals("OOO")){
            isThereAWinner = true;
        }
        else if((array[0][2] + array[1][1] + array[2][0]).equals("XXX") || (array[0][2] + array[1][1] + array[2][0]).equals("OOO")){
            isThereAWinner = true;
        }
        else{

        }

        return isThereAWinner;
    }

    //check who the winner is
   public String nameOfWinner(String[][] array) {
        String winnerName = "no-one";
        if( (array[0][0] + array[0][1] + array[0][2]).equals("XXX")
                || (array[1][0] + array[1][1] + array[1][2]).equals("XXX")
                || (array[2][0] + array[2][1] + array[2][2]).equals("XXX")
                || (array[0][0] + array[1][0] + array[2][0]).equals("XXX")
                || (array[0][1] + array[1][1] + array[2][1]).equals("XXX")
                || (array[0][2] + array[1][2] + array[2][2]).equals("XXX")
                || (array[0][0] + array[1][1] + array[2][2]).equals("XXX")
                || (array[0][2] + array[1][1] + array[2][0]).equals("XXX")){
            winnerName = "X";

        }
       else if( (array[0][0] + array[0][1] + array[0][2]).equals("OOO")
               || (array[1][0] + array[1][1] + array[1][2]).equals("OOO")
               || (array[2][0] + array[2][1] + array[2][2]).equals("OOO")
               || (array[0][0] + array[1][0] + array[2][0]).equals("OOO")
               || (array[0][1] + array[1][1] + array[2][1]).equals("OOO")
               || (array[0][2] + array[1][2] + array[2][2]).equals("OOO")
               || (array[0][0] + array[1][1] + array[2][2]).equals("OOO")
               || (array[0][2] + array[1][1] + array[2][0]).equals("OOO")){
           winnerName = "O";
       }

       return winnerName;
   }

}


