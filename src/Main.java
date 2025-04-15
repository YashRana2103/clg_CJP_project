import java.util.Scanner;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose input method:");
        System.out.println("1. Enter text manually");
        System.out.println("2. Read from a file");
        System.out.print("Enter choice (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        String text = "";

        if (choice == 1) {
            System.out.println("Enter a paragraph:");
            text = scanner.nextLine();
        } else if (choice == 2) {
            System.out.print("Enter file name (e.g., input.txt): ");
            String fileName = scanner.nextLine();
            text = FileHandler.readFile(fileName);
        } else {
            System.out.println("Invalid choice. Exiting...");
            scanner.close();
            return;
        }

        WordCounter wordCounter = new WordCounter();
        Map<String, Integer> wordFrequencies = wordCounter.countWords(text);
        System.out.println("\n----- Word Frequency Count -----");
        wordCounter.displayWordFrequencies(wordFrequencies);

        scanner.close();
    }
}
