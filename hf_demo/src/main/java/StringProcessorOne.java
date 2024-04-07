import java.util.Stack;

public class StringProcessorOne {
    // For a given string that only contains alphabet characters a-z, if 3 or more consecutive
    //characters are identical, remove them from the string. Repeat this process until
    //there is no more than 3 identical characters sitting besides each other.
    public static void main(String[] args) {
        String input = "aabcccbbad";
        String output = removeConsecutiveDuplicates(input);
        System.out.println(output);  // Output: d
    }


    public static String removeConsecutiveDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        int length = input.length();
        for (int i = 0; i < length; ) {
            char currentChar = input.charAt(i);
            result.append(currentChar);
            int j = i + 1;
            while (j < length && input.charAt(j) == currentChar) {
                j++;
            }
            i = j;
        }
        return result.toString();
    }
}
