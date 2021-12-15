package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to 20 questions. ");
        System.out.println("You have 20 guesses to guess the number I am thinking of between 1 and 1000! ");
        System.out.println("I'll give you hints as you guess.");

        int number = 1 + (int) (1000 * Math.random());

        int limit = 20;

        int g, guess;

        for (g = 0; g <= limit; g++) {
            System.out.println("Give a guess: ");


            guess = scan.nextInt();

            if (number == guess) {
                System.out.println("Nice guess, that was the number, but it did take you " + (g + 1) + " guesses.");
                break;
            } else if (number > guess && g != limit - 1) {
                System.out.println("The number is higher than your guess of " + guess);
            } else if (number < guess && g != limit - 1) {
                System.out.println("The number is less than your guess of " + guess);
            }

            if (g == limit) {
                System.out.println("You are out of guesses. You suck at this game!");
                System.out.println("The number you couldn't get was " + number);
            }
        }
    }
}
