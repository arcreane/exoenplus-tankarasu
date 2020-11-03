package com.company;

import java.util.Scanner;

public class mineSweeper {

    /**
     * difficulties sorted by row * column * mines
     */
    int[][] difficulties = {{10, 10, 10}, {13, 15, 30}, {16, 30, 99}};

    // variables globales
    enum menu {EASY, MEDIUM, HARD, QUIT}

    // conditions de sorties
    boolean won = false, endGame = false, allMinesFlagged = false, fail = false;

    Scanner userInput = new Scanner(System.in);

    /**
     * fonction wich return the difficulties, size and number of mines on the board
     * or give the possibility to return on the main Menu
     */
    public static void mineSweeperMenu() {
        System.out.println("Hello Menu");
    }

    /**
     * Action principale du jeu
     */
    public static void refreshBoard() {

    }

    public static void drawBoard() {

    }

    public static void isEndGame() {

    }

    public static void fillTheBoard() {
    }

    // conditions of win & loses
    // menu to choose difficulties
    // 2 dimensionnal board
    // dimensions from difficulties
    // number of mine from difficulties
    // fonction random qui place les mines

    // état de la cellule : open, close ,flagged

}
