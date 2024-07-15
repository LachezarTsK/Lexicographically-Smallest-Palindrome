
/**
 * @param {string} s
 * @return {string}
 */
var makeSmallestPalindrome = function (s) {
    const lexicographicallySmallestPalindrome = s.split('');
    let left = 0;
    let right = lexicographicallySmallestPalindrome.length - 1;

    while (left < right) {
        if (lexicographicallySmallestPalindrome[left] < lexicographicallySmallestPalindrome[right]) {
            lexicographicallySmallestPalindrome[right] = lexicographicallySmallestPalindrome[left];
        } else {
            lexicographicallySmallestPalindrome[left] = lexicographicallySmallestPalindrome[right];
        }
        ++left;
        --right;
    }
    return lexicographicallySmallestPalindrome.join('');
};
