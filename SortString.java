import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking string input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        // Convert string to character array and sort
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);

        // Convert sorted character array back to string
        String sortedString = new String(charArray);

        // Display the result
        System.out.println("Sorted String: " + sortedString);
    }
}

