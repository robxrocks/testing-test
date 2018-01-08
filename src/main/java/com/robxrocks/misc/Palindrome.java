package com.robxrocks.misc;

public class Palindrome {

    public boolean isPalindrome(String word) {
        return word.equals(new StringBuilder(word).reverse().toString());
    }
}
