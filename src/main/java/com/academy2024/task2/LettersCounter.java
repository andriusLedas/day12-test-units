package com.academy2024.task2;

import java.util.List;

public class LettersCounter {
    public static long countLettersInString(char letter, String str) {
        long letterCount =0L;
        char[] strLetters = str.toCharArray();

        for (char strLetter : strLetters) {
            if (strLetter == letter) {
                letterCount++;
            }
        }
        return letterCount;
    }

    public static long countLettersInStrings(char letter, List<String> list) {
        long letterCount = 0L;

        String listToString = list.toString();
        char[] strLetters = listToString.toCharArray();

        for (char strLetter : strLetters) {
            if (strLetter == letter) {
                letterCount++;
            }
        }
        return letterCount;
    }
}
