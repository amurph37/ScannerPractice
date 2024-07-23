import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        // Print the greeting message
        System.out.println("Hello, " + name + "!");
    }
}
