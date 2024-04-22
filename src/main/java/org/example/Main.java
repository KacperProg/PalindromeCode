package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String word = "kayakkayak";
        String word1 = "oaaojsei";
        String word3 = "kayakkoyak";
        boolean isWordAPalindrome = isPalindrome(word3);
        System.out.println("It is : " + isWordAPalindrome);
    }

    private static boolean isPalindrome(String word){
        List<String> splitWord = Arrays.asList(word.split(""));
        for (int i=0;i<(splitWord.size()+1)/2;i++){
            if(splitWord.get(i).equals(splitWord.get(splitWord.size()-(i+1)))){
                return true;
            }else{
                return false;
            }

        }
        return false;
    }
}