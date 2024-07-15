
class Solution {
  
    fun makeSmallestPalindrome(s: String): String {
        val lexicographicallySmallestPalindrome = s.toCharArray()
        var left = 0
        var right = lexicographicallySmallestPalindrome.size - 1

        while (left < right) {
            if (lexicographicallySmallestPalindrome[left] < lexicographicallySmallestPalindrome[right]) {
                lexicographicallySmallestPalindrome[right] = lexicographicallySmallestPalindrome[left]
            } else {
                lexicographicallySmallestPalindrome[left] = lexicographicallySmallestPalindrome[right]
            }
            ++left
            --right
        }
        return String(lexicographicallySmallestPalindrome)
    }
}
