package main.java.hangman;

public class HangmanDrawing {
    private static final String[] HangmanDrawing = {
            // Starting
            "  -----\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========\n",

            // 1
            "  -----\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========\n",

            // 2
            "  -----\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========\n",

            // 3
            "  -----\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========\n",

            // 4
            "  -----\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========\n",

            // 5
            "  -----\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========\n",

            // 6
            "  -----\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "=========\n"
    };

    public static void displayHangman(int incorrectTries) {
        if (incorrectTries >= 0 && incorrectTries < HangmanDrawing.length) {
            System.out.println(HangmanDrawing[incorrectTries]);
        } else {
            System.out.println("Hangman image not available for " + incorrectTries + " incorrect tries.");
        }
    }
}

