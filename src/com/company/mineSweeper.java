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
        String[][] theBoard = new String[row][column];
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
                oneRow += theBoard[i][j] + "  ";
            }
            oneRow += "| " + i;
            System.out.println(oneRow);
        }
        System.out.println(separateBars);
        System.out.println(lastRow);

    }

    public static void fillTheBoard(String board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = "O";
            }
        }
        placeMine(difficulties[userChoice], board);
        // board[5][10]= "M"; 5 = ordonnée , 10 = abscisse;
    }

    public static void isEndGame() {

    }

    public static void placeMine(int level[], String aBoard[][]) {
        int mineX = numberRandom.nextInt(level[0]);
        int mineY = numberRandom.nextInt(level[1]);
        aBoard[mineY][mineX] = "M";
    }

    // conditions of win & loses
    // menu to choose difficulties
    // 2 dimensionnal board
    // dimensions from difficulties
    // number of mine from difficulties
    // fonction random qui place les mines

    // état de la cellule : open, close ,flagged

}
