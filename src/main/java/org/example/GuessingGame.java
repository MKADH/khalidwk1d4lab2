package org.example;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        //        Prompt user to input their guess for the secret number
        System.out.println("Guess what double digit number i'm thinking of:)");

//      Collect user input
//      Creates a scanner object
        Scanner scanner = new Scanner(System.in);
//      Reads user input
        Integer randomNumber = scanner.nextInt();


//        If number is 40, print 'Correct detective, well done!'
//        If lower than 40, print 'Too low a guess, champ'
//        If higher than 40, print 'Come back down that's a high guess'
        if (randomNumber == 40){
            System.out.println("Correct detective, well done!");
        } else if (randomNumber > 40){
            System.out.println("Come back down that's a high guess");
        } else {
            System.out.println("Too low a guess, champ");
        }
    }
}
