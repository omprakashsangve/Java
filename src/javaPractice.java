public class javaPractice {
    public static void main(String[] args) {
        // Define the input string as an example
        String str = "h\n1\ne\n2\nl\nl";
        System.out.println(str.length());
        System.out.println("=============");

        // StringBuilder to store filtered letters
        StringBuilder result = new StringBuilder();

        // Loop through each character in the input string (line-by-line simulated)
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Convert character to uppercase before appending it to the result
                result.append(Character.toUpperCase(ch));
            }
        }

        // Output the result as one continuous string
        System.out.println(str);
        System.out.println(result.toString());
    }
}
