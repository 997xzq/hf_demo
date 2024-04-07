public class StringProcessorTwo {
    public static void main(String[] args) {
        //Instead of removing the consecutively identical characters, replace them with a
        //single character that comes before it alphabetically.
        String input = "abcccbad";
        String output = replaceConsecutiveDuplicates(input);
        System.out.println(output);  // Output: d
    }

    public static String replaceConsecutiveDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        int length = input.length();
        for (int i = 0; i < length; ) {
            char currentChar = input.charAt(i);
            result.append(currentChar);
            int j = i + 1;
            while (j < length && input.charAt(j) == currentChar) {
                j++;
            }
            if (j - i >= 3) {
                result.setCharAt(result.length() - 1, (char)(currentChar - 1));
            }
            i = j;
        }
        return result.toString();
    }
}
