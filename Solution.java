
public class Solution {

    public String makeSmallestPalindrome(String s) {
        char[] lexicographicallySmallestPalindrome = s.toCharArray();
        int left = 0;
        int right = lexicographicallySmallestPalindrome.length - 1;

        while (left < right) {
            if (lexicographicallySmallestPalindrome[left] < lexicographicallySmallestPalindrome[right]) {
                lexicographicallySmallestPalindrome[right] = lexicographicallySmallestPalindrome[left];
            } else {
                lexicographicallySmallestPalindrome[left] = lexicographicallySmallestPalindrome[right];
            }
            ++left;
            --right;
        }
        return String.valueOf(lexicographicallySmallestPalindrome);
    }
}
