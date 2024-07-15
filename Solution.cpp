
#include <string>
using namespace std;

class Solution {
public:
    string makeSmallestPalindrome(string s) const {
        string lexicographicallySmallestPalindrome = move(s);
        size_t left = 0;
        size_t right = lexicographicallySmallestPalindrome.size() - 1;

        while (left < right) {
            if (lexicographicallySmallestPalindrome[left] < lexicographicallySmallestPalindrome[right]) {
                lexicographicallySmallestPalindrome[right] = lexicographicallySmallestPalindrome[left];
            }
            else {
                lexicographicallySmallestPalindrome[left] = lexicographicallySmallestPalindrome[right];
            }
            ++left;
            --right;
        }
        return lexicographicallySmallestPalindrome;
    }
};
