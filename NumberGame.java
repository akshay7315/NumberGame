import java.util.Random;
import java.util.Scanner;

public class NumberGame{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerRange = 1;
        int upperRange = 100;
        int numberToGuess = random.nextInt(upperRange - lowerRange + 1) + lowerRange;
        
        int attempts = 0;
        boolean correctGuess = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've selected a random number between " + lowerRange + " and " + upperRange + ". Try to guess it!");
        
        while (!correctGuess) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess < lowerRange || userGuess > upperRange) {
                System.out.println("Please enter a number within the specified range.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + numberToGuess + " in " + attempts + " attempts!");
                correctGuess = true;
            }
        }
        
        scanner.close();
    }
}
