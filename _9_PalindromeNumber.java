/*
9. Palindrome Number
Easy

        Given an integer x, return true if x is palindrome integer.
        
        An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
        
        
        
        Example 1:
        
        Input: x = 121
        Output: true
        
        Example 2:
        
        Input: x = -121
        Output: false
        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
        
        Example 3:
        
        Input: x = 10
        Output: false
        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
        
        Example 4:
        
        Input: x = -101
        Output: false
        
        
        
        Constraints:
        
            -231 <= x <= 231 - 1

*/

public class _9_PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        String numLength = Integer.toString(x);
        int org = x, rev = 0;
        for(int i=0; i<numLength.length(); i++) {
            int temp = x%10;
            rev = rev*10 + temp;
            x = x/10;
        }
        return (org == rev) ? true: false;    
}
