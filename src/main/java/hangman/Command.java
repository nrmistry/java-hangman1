package main.java.hangman;
import java.util.Scanner;

public class Command {

    private final Scanner scanner = new Scanner(System.in);

    public char getUserInput() {
        System.out.print("Enter a letter: ");
        return scanner.next().charAt(0);
    }

    public void closeScanner() {
        scanner.close();
    }

    public void displayResult(boolean isWordGuessed, String targetWord) {
        System.out.println("Game Over!");
        if (isWordGuessed) {
            System.out.println("WOOOHOOOO! You guessed the word: " + targetWord);
        } else {
            System.out.println("Sorry, you ran out of tries:(( The correct word was: " + targetWord);
        }
    }
}
