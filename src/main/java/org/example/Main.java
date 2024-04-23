package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String word = "kayakkayak";
        String word1 = "oaaojsei";
        String word3 = "kayakkayak";
        boolean isWordAPalindrome = isPalindrome(word3);
        System.out.println("It is : " + isWordAPalindrome);
    }

    private static boolean isPalindrome(String word) {
        List<String> splitWord = Arrays.asList(word.split(""));
        int halfLength = splitWord.size() / 2;
        for (int i = 0; i < halfLength; i++) {
            if (!splitWord.get(i).equals(splitWord.get(splitWord.size() - 1 - i))) {
                return false;
            }
        }
        return true;
    }

}