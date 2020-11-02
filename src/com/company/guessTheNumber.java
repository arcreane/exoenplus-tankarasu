package com.company;

import com.sun.source.tree.DoWhileLoopTree;

import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {
    public static void launchTheGame() {
        Scanner userGuess = new Scanner(System.in);
        System.out.println("I think u Can guess tHe nuMbeR :) be concentrate ...\n\nI will help U dont be Afraid");
        Random number = new Random();

        int TheNumberToFind = (number.nextInt(100)) + 1;
        int attempt = 10;
        boolean won = false;
        boolean endGame = false;

        do {
            attempt--;
            //récupère UserInput
            System.out.println("Guess a number his/her Majesty:");
            int userInput = userGuess.nextInt();

            if (userInput > TheNumberToFind) {
                System.out.println("Your guess is too HIGH Majesty.");
            } else if (userInput < TheNumberToFind) {
                System.out.println("Your guess is too LOW Majesty.");
            } else {
                System.out.println("you are a great Player MAJESTY. \nLong life to his/her Majesty.");
                won = true;
                exoSuppAlgo.launchGame();
            }

            //Conditions de sortie du jeu
            if (attempt == 0 & !won) {
                System.out.println("You loose my majesty");
                endGame = true;
                exoSuppAlgo.launchGame();
            }

        } while (!won & !endGame);
    }
}
