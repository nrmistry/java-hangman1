package main.java.hangman;

import java.util.ArrayList;
import java.util.List;

import static main.java.hangman.Words.getRandomWord;

public class GameLogic {
    private static final int maxTries = 6;

    private final String targetWord;
    private final List<Character> guessedLetters;
    private int incorrectTries;

    public GameLogic(String word) {
        this.targetWord = word.toLowerCase();
        this.guessedLetters = new ArrayList<>();
        this.incorrectTries = 0;
    }

    public boolean isGameOver() {
        return incorrectTries >= maxTries || isWordGuessed();
    }

    public boolean isWordGuessed() {
        return guessedLetters.containsAll(uniqueLettersInWord());
    }

    public void displayWordProgress() {
        for (char letter : targetWord.toCharArray()) {
            if (guessedLetters.contains(letter)) {
                System.out.print(letter + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }

    public void displayHangman() {
        System.out.println("Incorrect Tries: " + incorrectTries);
        HangmanDrawing.displayHangman(incorrectTries);
    }

    public void makeGuess(char letter) {
        if (Character.isLetter(letter)) {
            letter = Character.toLowerCase(letter);
            if (!guessedLetters.contains(letter)) {
                guessedLetters.add(letter);
                if (!targetWord.contains(String.valueOf(letter))) {
                    incorrectTries++;
                }
            }
        } else {
            System.out.println("Please enter a valid letter.");
        }
    }

    public String getTargetWord() {
        return targetWord;
    }

    private List<Character> uniqueLettersInWord() {
        List<Character> uniqueLetters = new ArrayList<>();
        for (char letter : targetWord.toCharArray()) {
            if (!uniqueLetters.contains(letter)) {
                uniqueLetters.add(letter);
            }
        }
        return uniqueLetters;
    }
}