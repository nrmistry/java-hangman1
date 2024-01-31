package main.java.hangman;

import java.util.ArrayList;
import java.util.List;

public class Words {

    private static final List<String> words = new ArrayList<>();

    static {
        words.add("lemon");
        words.add("orange");
        words.add("elephant");
        words.add("cruise");
        words.add("short");
        words.add("password");
        words.add("heavy");
        words.add("nothing");
        words.add("light");
        words.add("fancy");
        words.add("irregular");
        words.add("dinner");
        words.add("friday");
        words.add("table");
        words.add("sausage");
        words.add("packet");
        words.add("paper");
        words.add("bottle");
        words.add("water");
        words.add("asked");
        words.add("future");
        words.add("present");
        words.add("wrapping");
        words.add("clips");
        words.add("heading");
        words.add("flower");
        words.add("crying");
        words.add("liars");
        words.add("tofu");
    }

    public static String getRandomWord(){
        int index = (int)(Math.random() * words.size());
        return words.get(index);
    }
}