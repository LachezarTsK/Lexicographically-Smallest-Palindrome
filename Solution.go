
package main

import "fmt"

func makeSmallestPalindrome(s string) string {
    lexicographicallySmallestPalindrome := []byte(s)
    left := 0
    right := len(lexicographicallySmallestPalindrome) - 1

    for left < right {
        if lexicographicallySmallestPalindrome[left] < lexicographicallySmallestPalindrome[right] {
            lexicographicallySmallestPalindrome[right] = lexicographicallySmallestPalindrome[left]
        } else {
            lexicographicallySmallestPalindrome[left] = lexicographicallySmallestPalindrome[right]
        }
        left++
        right--
    }
    return string(lexicographicallySmallestPalindrome)
}
