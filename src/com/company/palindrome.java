package com.company;

import java.util.Scanner;

public class palindrome {

    public static void testTheString() {
        System.out.println("\nPalindrome Game");
        Scanner userInputString = new Scanner(System.in);
        System.out.println("\nEnter Something ...\n");

        String userInput = userInputString.next();
        String reverseInput = inPlaceReverse(userInput.toLowerCase());

        if (userInput.toLowerCase().equals(reverseInput)) {
            System.out.println("Cette chaine de caractère est un palindrome");
        } else {
            System.out.println("Cette chaine de caractère N EST PAS un palindrome");
        }
        exoSuppAlgo.launchGame();

    }

    public static String inPlaceReverse(String input) {
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString();
    }

}
