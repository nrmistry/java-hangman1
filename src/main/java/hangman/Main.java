package main.java.hangman;

import main.java.hangman.Command;
import main.java.hangman.GameLogic;
import main.java.hangman.Words;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean playAgain = true;

        while (playAgain) {
            String randomWord = Words.getRandomWord();

            GameLogic gameLogic = new GameLogic(randomWord);
            Command command = new Command();

            System.out.println("Welcome to hangman! Enter a letter to start the game, you have 6 lives!");

            // Game loop
            while (!gameLogic.isGameOver()) {
                System.out.println("Current Progress:");
                gameLogic.displayWordProgress();
                gameLogic.displayHangman();

                char guess = command.getUserInput();
                gameLogic.makeGuess(guess);
            }

            // Display the final result
            command.displayResult(gameLogic.isWordGuessed(), gameLogic.getTargetWord());

            // Play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        scanner.close();
    }
}
