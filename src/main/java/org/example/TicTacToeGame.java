package org.example;

import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {

        GameLogic gameLogic = new GameLogic();

        gameLogic.initialiseGame();

        Scanner TicTacToeScanner = new Scanner(System.in);
        System.out.println("Player 1, please enter your name:");
        String player1Name = TicTacToeScanner.nextLine();
        Player player1 = new Player();
        player1.setName(player1Name);
        player1.setGamePiece("X");
        System.out.println("Player 2, please enter your name:");
        String player2Name = TicTacToeScanner.nextLine();
        Player player2 = new Player();
        player2.setName(player2Name);
        player2.setGamePiece("O");
        System.out.println("Welcome " + player1.getName() + " & " + player2.getName() + ". Let's play Tic Tac Toe!");
        System.out.println(player1.getName() + ", you are " + player1.getGamePiece() + "'s & " + player2.getName() + ", you are " + player2.getGamePiece() + "'s. Please see below for a handy reference for choosing columns and rows.");

        Board board = new Board();
        board.printBlankBoard();

        boolean correct = false;

        while (!correct) {

            int rows = 3;
            int columns = 3;

            String[][] gameBoard = new String[rows][columns];

            board.populateBoard(gameBoard, rows, columns);

            boolean gameOver = false;
            while (!gameOver) {

                boolean winner = gameLogic.checkWinner(gameBoard);
                boolean boardFull = gameLogic.checkBoardFull(gameBoard);
                boolean playerOne = false;
                if(winner){
                    String winnerName = gameLogic.nameOfWinner(gameBoard);
                    System.out.println("Congratulations! " + winnerName + " wins!");
                    gameOver = true;
                    break;
                }
                else if(boardFull){
                    System.out.println("It's a draw!");
                    gameOver = true;
                    break;
                }
                else{
                    playerOne = true;
                    }
                while(playerOne) {
                    int player = 1;

                    boolean legal = false;
                    int rowNumberSelected = 0;
                    int colNumberSelected = 0;
                    while (!legal) {
                        System.out.println(player1.getName() + " please place your " + player1.getGamePiece() + ". To make a move, please first select the row number:");
                        rowNumberSelected = TicTacToeScanner.nextInt();
                        TicTacToeScanner.nextLine();
                        System.out.println("Now enter the column number:");
                        colNumberSelected = TicTacToeScanner.nextInt();
                        TicTacToeScanner.nextLine();

                        legal = gameLogic.checkLegalMove(rowNumberSelected, colNumberSelected, gameBoard);
                    }

                    board.updateBoard(rowNumberSelected, colNumberSelected, player, gameBoard);

                    board.printBoard(gameBoard);


                    playerOne = false;

                }

                winner = gameLogic.checkWinner(gameBoard);
                boardFull = gameLogic.checkBoardFull(gameBoard);
                boolean playerTwo = false;
                if(winner){
                    String winnerName = gameLogic.nameOfWinner(gameBoard);
                    System.out.println("Congratulations! " + winnerName + " wins!");
                    gameOver = true;
                    break;
                }
                else if(boardFull){
                    System.out.println("It's a draw!");
                    gameOver = true;
                    break;
                }
                else{
                    playerTwo = true;
                }
                while(playerTwo) {
                    int player = 2;

                    boolean legal = false;
                    int rowNumberSelected = 0;
                    int colNumberSelected = 0;
                    while (!legal) {
                        System.out.println(player2.getName() + " please place your " + player2.getGamePiece() + ". To make a move, please first select the row number:");
                        rowNumberSelected = TicTacToeScanner.nextInt();
                        TicTacToeScanner.nextLine();
                        System.out.println("Now enter the column number:");
                        colNumberSelected = TicTacToeScanner.nextInt();
                        TicTacToeScanner.nextLine();

                        legal = gameLogic.checkLegalMove(rowNumberSelected, colNumberSelected, gameBoard);
                    }

                    board.updateBoard(rowNumberSelected, colNumberSelected, player, gameBoard);

                    board.printBoard(gameBoard);

                    playerTwo = false;

                }
            }

            correct = gameLogic.playAgain();
        }
    }
}
