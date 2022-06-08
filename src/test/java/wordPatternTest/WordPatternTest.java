package wordPatternTest;

import org.junit.Test;
import wordPattern.WordPattern;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class WordPatternTest {

    WordPattern wordPattern = new WordPattern();

    String patternOne = "abba";
    String patternTwo = "aaaa";
    String wordOne = "dog cat cat dog";
    String wordTwo = "dog cat cat fish";
    String wordThree = "dog cat cat dog";

    @Test
    public void wordPattern1() {
        assertTrue(wordPattern.wordPattern(patternOne, wordOne));
        assertFalse(wordPattern.wordPattern(patternOne, wordTwo));
        assertFalse(wordPattern.wordPattern(patternTwo, wordThree));
    }
}
