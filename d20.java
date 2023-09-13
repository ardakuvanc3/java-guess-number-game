package d20;

import java.util.Scanner;
import java.util.Random;

public class d20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter minimum value: ");
        int minValue = scanner.nextInt();
        
        System.out.print("Enter maximum value: ");
        int maxValue = scanner.nextInt();
        
        Random rand = new Random();
        int randomNum = rand.nextInt((maxValue - minValue) + 1) + minValue;
        
        System.out.println("I've chosen a number! Try to guess it.");

        int numberOfGuesses = 10; 
        while (numberOfGuesses > 0){
            System.out.println("Guess: ");

            int userGuess = scanner.nextInt();

            if (userGuess == randomNum){
                System.out.println("YOU WIN!!");
                break;
            }
            else{
                System.out.println("Try Again: ");
                System.out.println("--------");
                numberOfGuesses--;
                System.out.println("Guesses left: " + numberOfGuesses);
                System.out.println("--------");


                if(userGuess > randomNum){
                    System.out.println("Go lower!");
                    System.out.println("--------");
                }
                else if (randomNum > userGuess){
                    System.out.println("Go higher!");
                    System.err.println("--------");
                }

                if(numberOfGuesses == 0){
                    System.out.println("You lose :(");
                    break;
                }
            }
        }
    }
}
