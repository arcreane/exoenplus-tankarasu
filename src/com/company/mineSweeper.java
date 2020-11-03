package com.company;

import java.util.Random;
import java.util.Scanner;

public class mineSweeper {

    /**
     * difficulties sorted by row * column * mines
     */
    static int[][] difficulties = {{10, 10, 10}, {13, 15, 30}, {16, 30, 99}};
    static int userChoice = 0;

    // variables globales
    enum menu {EASY, MEDIUM, HARD, QUIT}

    // conditions de sorties
    boolean won = false, endGame = false, allMinesFlagged = false, fail = false;

    static Scanner userInput = new Scanner(System.in);
    static Random numberRandom = new Random();

    /**
     * fonction wich return the difficulties, size and number of mines on the board
     * or give the possibility to return on the main Menu
     */
    public static void mineSweeperMenu() {
        System.out.println("Hello Menu\n\nMake a Choice:");
        for (menu level : menu.values()) {
            System.out.println((level.ordinal() + 1) + " - " + level);
        }
        userChoice = userInput.nextInt() - 1;

        //Switch case en projet
        drawBoard(difficulties[userChoice]);
    }

    /**
     * Action principale du jeu
     */
    public static void refreshBoard() {

    }

    /**
     * first initialization of the board
     *
     * @param level - set the size of the board and the number of mine
     */
    public static void drawBoard(int level[]) {
        int row = level[0], column = level[1], numberOfMine = level[2];
        String[][][] theBoard = new String[row][column][2];
        String separateBars = "";
        String lastRow = "| ";
        int lengthForBars = theBoard[0].length * 3 + 5;

        // intialisation des barres séparatrices
        for (int i = 0; i < lengthForBars; i++) {
            separateBars += "-";
        }
        // initialisation de la barre des abscisses
        for (int i = 0; i < theBoard[0].length; i++) {
            if (i < 10) {
                lastRow += i + "  ";
            } else {
                lastRow += i + " ";
            }
        }

        fillTheBoard(theBoard);
        ;
        System.out.println(separateBars);

        for (int i = 0; i < theBoard.length; i++) {
            String oneRow = "| ";
            for (int j = 0; j < theBoard[i].length; j++) {
                oneRow += theBoard[i][j][1] + "  ";
            }
            oneRow += "| " + i;
            System.out.println(oneRow);
        }
        System.out.println(separateBars);
        System.out.println(lastRow);

    }

    public static void fillTheBoard(String[][][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j][1] = "\u2580";
            }
        }

        placeMine(difficulties[userChoice], board);
        // board[5][10]= "M"; 5 = ordonnée , 10 = abscisse;

    }

    public static void isEndGame() {

    }

    /**
     * This fonction place mines on the board
     *
     * @param level  - determines number of mine and size of the board
     * @param aBoard - the board to fill with mines
     */
    public static void placeMine(int[] level, String[][][] aBoard) {

        int numberOfMine = level[2];
        while (numberOfMine > 0) {
            int mineX = numberRandom.nextInt(level[0]);
            int mineY = numberRandom.nextInt(level[1]);
            if (aBoard[mineX][mineY][0] != "M") {
                aBoard[mineX][mineY][0] = "M";
                numberOfMine--;
                // System.out.println(mineX +" "+mineY);
                // System.out.print(aBoard[mineX][mineY][0] +" ");
                // System.out.println(aBoard[mineX][mineY][1]);
            }
        }

    }

    // conditions of win & loses

    // état de la cellule : open, close ,flagged

}
