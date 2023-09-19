
package org.example;

//import static org.example.Board.array;

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
        boolean isGameOver = true;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                if(array[i][j].equals(" ")){
                    isGameOver=false;
                    break;
                }
            }
        }
        return isGameOver;
    }



   /* public String checkWinner(String[][] array) {
        for (int a = 0; a < 8; a++) {
            String line = switch (a) {
                case 0 -> array[0][0] + array[0][1] + array[0][2];
                case 1 -> array[1][0] + array[1][1] + array[1][2];
                case 2 -> array[2][0] + array[2][1] + array[2][2];
                case 3 -> array[0][0] + array[1][0] + array[2][0];
                case 4 -> array[0][1] + array[1][1] + array[2][1];
                case 5 -> array[0][2] + array[1][2] + array[2][2];
                case 6 -> array[0][0] + array[1][1] + array[2][2];
                case 7 -> array[0][2] + array[1][1] + array[2][0];
                default -> null;
            };

            //For X winner
            if (line.equals("XXX")) {
                return "X";
                break;
            }

            // For O winner
            else if (line.equals("OOO")) {
                return "O";
                break;
            }

        }
    }*/
}


