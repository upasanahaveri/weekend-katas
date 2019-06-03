package com.haveri.palindrome;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumbersTest {

    private PalindromeNumbers sut = new PalindromeNumbers();

    @Test
    public void shouldReturnFalseForNegativeNumbers() {
        assertFalse(sut.isPalindrome(-121));
    }

    @Test
    public void shouldReturnFalseForNonPalindromeNumbers() {
        assertFalse(sut.isPalindrome(124));
    }

    @Test
    public void shouldReturnTrueForPalindromeNumbers() {
        assertTrue(sut.isPalindrome(1));
        assertTrue(sut.isPalindrome(11));
        assertTrue(sut.isPalindrome(121));
        assertTrue(sut.isPalindrome(123321));
    }
}