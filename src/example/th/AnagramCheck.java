package example.th;


import java.util.Scanner;

public class AnagramCheck {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] frequency = new int[26]; // Assuming only lowercase English letters

        // Increase frequency count for str1, decrease for str2
        for (int i = 0; i < str1.length(); i++) {
            frequency[str1.charAt(i) - 'a']++;
            frequency[str2.charAt(i) - 'a']--;
        }

        // If all values in the frequency array are 0, strings are anagrams
        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine().toLowerCase(); // Convert to lowercase for case insensitivity

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine().toLowerCase();

        // Check if they are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        scanner.close();
    }
}
