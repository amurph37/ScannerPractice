import java.util.Scanner;

public class Superhero {

    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the hero's name
        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");
        String heroName = scanner.nextLine();

        // Ask for the hero's superpower
        System.out.println("What is their superpower?");
        String superpower = scanner.nextLine();

        // Print the superhero story
        System.out.println("Here is the story:");
        System.out.println("There once was a superhero named " + heroName + ", who had the power of " + superpower + ".");
        System.out.println("As they grew older, " + heroName + " saw that the world needed them.");
        System.out.println(heroName + " used their ability to " + superpower + " to save the world.");
    }
}
