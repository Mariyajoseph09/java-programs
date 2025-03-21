import java.util.Arrays;
import java.util.Scanner;

class StringSorter {
    private String[] strings;

    // Method to take input from the user
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        strings = new String[n]; // Initialize the array

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
        scanner.close();
    }

    // Method to sort the array of strings
    public void sortStrings() {
        Arrays.sort(strings); // Sorts strings in lexicographical (dictionary) order
    }

    // Method to display sorted strings
    public void displaySortedStrings() {
        System.out.println("\nSorted Strings:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        StringSorter sorter = new StringSorter(); // Create an object of StringSorter
        sorter.getInput(); // Get user input
        sorter.sortStrings(); // Sort the strings
        sorter.displaySortedStrings(); // Display sorted strings
    }
}

