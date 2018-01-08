package com.robxrocks.misc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {

    Palindrome sut;

    @Before
    public void setUp() {
        sut = new Palindrome();
    }

    @Test
    public void testIsPalindromeNoErrors() {
        assertTrue(sut.isPalindrome("noon"));
        assertTrue(sut.isPalindrome("racecar"));
    }

    @Test
    public void testIsPalindromeError() {
        assertFalse(sut.isPalindrome("abcde"));
    }
}
