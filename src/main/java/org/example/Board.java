package org.example;


public class Board {

    public Board() {}

    public void populateBoard(String[][] array, int rows, int columns){
        String value = " ";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = value;

            }
        }
    }


    public void updateBoard(int rowNumber, int columnNumber, int player, String[][] array){
        if(player == 1){
            array[rowNumber][columnNumber] = "X";
        }
        else if(player == 2){
            array[rowNumber][columnNumber] = "O";
        }

    }
    public void printBoard(String[][] array) {
        System.out.println("xo Tic Tac Toe xo");
        System.out.println("    |   |    ");
        System.out.println("  " + array[0][0] + " | " + array[0][1] + " | " + array[0][2] + "  ");
        System.out.println("-------------");
        System.out.println("  " + array[1][0] + " | " + array[1][1] + " | " + array[1][2] + "  ");
        System.out.println("-------------");
        System.out.println("  " + array[2][0] + " | " + array[2][1] + " | " + array[2][2] + "  ");
        System.out.println("    |   |    ");
    }

    public void printBlankBoard() {
        System.out.println();
        System.out.println("  0    1    2 ");
        System.out.println("     |   |    ");
        System.out.println("0    |   |    ");
        System.out.println(" -------------");
        System.out.println("1    |   |    ");
        System.out.println(" -------------");
        System.out.println("2    |   |    ");
        System.out.println("     |   |    ");
        System.out.println();
    }


    }


