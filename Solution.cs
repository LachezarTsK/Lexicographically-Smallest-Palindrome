
using System;

public class Solution
{
    public string MakeSmallestPalindrome(string s)
    {
        char[] lexicographicallySmallestPalindrome = s.ToCharArray();
        int left = 0;
        int right = lexicographicallySmallestPalindrome.Length - 1;

        while (left < right)
        {
            if (lexicographicallySmallestPalindrome[left] < lexicographicallySmallestPalindrome[right])
            {
                lexicographicallySmallestPalindrome[right] = lexicographicallySmallestPalindrome[left];
            }
            else
            {
                lexicographicallySmallestPalindrome[left] = lexicographicallySmallestPalindrome[right];
            }
            ++left;
            --right;
        }
        return String.Join("", lexicographicallySmallestPalindrome);
    }
}
