package com.haveri.palindrome;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 *
 * Example 1:
 *
 * Input: 121
 * Output: true
 * Example 2:
 *
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * Follow up:
 *
 * Could you solve it without converting the integer to a string?
 */
public class PalindromeNumbers {

    public boolean isPalindrome(int number){

        if(number < 0) return false;

        int hf = getHighestDecimalFactor(number);
        int lf = 1;

        /** Derive by example
         * 123321/100000 = 1 = 123321 % 10
         * (123321 % 10000 * 10) / 10000 = 2 = (123321 % 10 * 10) / 10
         * (123321 % 1000 * 10) / 1000 = 3 = (123321 % 100 * 10) / 100
         */
        while (hf > lf){

            int left = (number % (hf * 10)) / hf;
            int right = (number % (lf * 10)) / lf;
            if(left != right){
                return false;
            }

            hf /= 10;
            lf *= 10;
        }

        return true;

    }

    private int getHighestDecimalFactor(int number) {
        int i=1;
        while (number >= 10){
            number = number /10;
            i=i * 10;
        }
        return i;
    }

}
