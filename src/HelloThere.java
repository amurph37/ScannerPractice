import java.util.Scanner;

public class HelloThere {

    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // First part of the conversation
        System.out.println("Hello there! How are you doing today?");
        String firstResponse = scanner.nextLine();

        // Second part of the conversation
        System.out.println("Wow - Interesting! Tell me more!");
        String secondResponse = scanner.nextLine();

        // Goodbye message
        System.out.println("It was great talking to you. Goodbye!");
    }
}
