import java.util.Scanner;

import java.lang.Math;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 10) + 1;
        int userGuess = 0;
        boolean validInput = false;

        System.out.println("Welcome! Let's play a game. \nTry to guess my number!");
        do {
            System.out.println("Enter a number [1-10]:");
            if (scan.hasNextInt()) {
                userGuess = scan.nextInt();
                if (userGuess >= 1 && 10 >= userGuess) {
                    validInput = true;
                } else {
                    System.out.println("Sorry, you're guess is invalid. Please try again.");
                    scan.nextLine();
                }
            } else {
                System.out.println("Sorry, you're guess is invalid. Please try again.");
                scan.nextLine();
            }
        } while (!validInput);

        if (userGuess > randomNum) {
            System.out.println("My number was " + randomNum + ". \nYour guess was too high.");
        } else if (userGuess < randomNum) {
                System.out.println("My number was " + randomNum + ". \nYour guess was too low.");
        } else {
                System.out.println("My number was " + randomNum + ". \nYou got it right!");
            }
        }
    }
