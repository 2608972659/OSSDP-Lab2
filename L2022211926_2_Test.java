import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution2Test {

    @Test
    public void testRemoveDuplicateLettersExample1() {
        Solution2 solution = new Solution2();
        String input = "bcabc";
        String expected = "abc";
        String actual = solution.removeDuplicateLetters(input);
        Assertions.assertEquals(expected, actual, "The output should be 'abc' for input 'bcabc'.");
    }

    @Test
    public void testRemoveDuplicateLettersExample2() {
        Solution2 solution = new Solution2();
        String input = "cbacdcbc";
        String expected = "acdb";
        String actual = solution.removeDuplicateLetters(input);
        Assertions.assertEquals(expected, actual, "The output should be 'acdb' for input 'cbacdcbc'.");
    }

    @Test
    public void testRemoveDuplicateLettersWithEmptyString() {
        Solution2 solution = new Solution2();
        String input = "";
        String expected = "";
        String actual = solution.removeDuplicateLetters(input);
        Assertions.assertEquals(expected, actual, "The output should be an empty string for an empty input.");
    }

    @Test
    public void testRemoveDuplicateLettersWithNoDuplicates() {
        Solution2 solution = new Solution2();
        String input = "abcdefg";
        String expected = "abcdefg";
        String actual = solution.removeDuplicateLetters(input);
        Assertions.assertEquals(expected, actual, "The output should be the same as the input if there are no duplicates.");
    }

    // Add more test cases if needed to cover different scenarios
}