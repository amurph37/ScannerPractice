import java.util.Scanner;

public class VariableInputs {

    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Ask for a string of text
        System.out.println("Enter a string of text: ");
        String textInput = scanner.nextLine();

        // Ask for an integer
        System.out.println("Enter an integer: ");
        int intInput = Integer.valueOf(scanner.nextLine());

        // Ask for a double
        System.out.println("Enter a double: ");
        double doubleInput = Double.valueOf(scanner.nextLine());

        // Ask for a boolean
        System.out.println("Enter a boolean value: ");
        boolean boolInput = Boolean.valueOf(scanner.nextLine());

        // Print the inputs
        System.out.println("Your string is " + textInput);
        System.out.println("Your integer is " + intInput);
        System.out.println("Your double is " + doubleInput);
        System.out.println("Your boolean is " + boolInput);
    }
}
