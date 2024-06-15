package com.example.elvisgame.model;



import java.util.List;
import java.util.Random;

public class Dictionary {
    public List<Word> dictionary;

    public Word getRandomWord() {
        Random r = new Random();
        int nextInt = r.nextInt(dictionary.size());
        return dictionary.get(nextInt);
    }

    public Word getRandomWordExceptTheWord(Word word) {
        Random r = new Random();
        int nextInt = r.nextInt(dictionary.size());
        if (dictionary.get(nextInt).equals(word)) {
            if (nextInt > 1) {
                nextInt--;
            } else {
                nextInt++;
            }
        }
        return dictionary.get(nextInt);
    }

    public boolean correctOrIncorrectDecision() {
        Random r = new Random();
        int nextInt = r.nextInt(2);
        if (nextInt == 0) {
            return true;
        } else {
            return false;
        }
    }
}
