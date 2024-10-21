package com.challenge.easy.string;

/**

    # Check if the Sentence Is Pangram

     A pangram is a sentence where every letter of the English alphabet appears at least once.

     Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

     Example 1:
         Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
         Output: true
         Explanation: sentence contains at least one of every letter of the English alphabet.

     Example 2:
         Input: sentence = "leetcode"
         Output: false

     Constraints:

         * 1 <= sentence.length <= 1000
         * sentence consists of lowercase English letters.
 */
public class CheckSentenceIsPangram {

    public static boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
        int uniqueCount = 0;

        for(char c : sentence.toCharArray()) {
            int index = c - 'a';
            if(!seen[index]) {
                seen[index] = true;
                uniqueCount++;
                // Early termination if all letters are found
                if(uniqueCount == 26) {
                    return true;
                }
            }
        }

        return uniqueCount == 26;
        
    }

    public static void main(String[] args) {

    }
}
