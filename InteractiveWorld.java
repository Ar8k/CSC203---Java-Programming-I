
import java.util.Scanner;

// Main class 
public class InteractiveWorld {
    public static void main(String[] args) {

        // this scanner scans the inputs
        Scanner input = new Scanner(System.in);

        //getting the name
        System.out.print("Welcome! What is your name? ");
        String name = input.nextLine(); //storing the name inputted

        //getting the fav movie
        System.out.print("Hi " + name + "! What is your favorite movie? ");
        String movie = input.nextLine(); //storing the movie inputted

        //getting the persons fav char
        System.out.print("Who is your favorite character from " + movie + "? ");
        String character = input.nextLine(); //storing the char

        //making a message using all the information we gathered
        System.out.println("\nNice to meet you, " + name + "!");
        System.out.println("Wow, " + movie + " is a great choice.");
        System.out.println(character + " is such an amazing character!");
        System.out.println("Thanks for sharing your favorites with me!");

        input.close();
    }
}