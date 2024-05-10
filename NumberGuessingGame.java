import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private int secretNumber;
    private int attempts;

    public NumberGuessingGame() {
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;
        attempts = 0;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it!");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number (" + secretNumber + ") correctly in " + attempts + " attempts!");
            } else if (guess < secretNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        NumberGuessingGame game = new NumberGuessingGame();
        game.play();
    }

}
