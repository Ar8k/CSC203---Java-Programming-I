//importing the scanner so we can get inputs from users
import java.util.Scanner;

//defining the class name
public class StarBase13 {
    //this is where the program starts running
    public static void main(String[] args) {

        //adding the scanner so we can get inputs
        Scanner input = new Scanner(System.in);

        //computer greeting and asking for input
        System.out.println("I am HAL, What is your name, traveler?");

        //storing the input as userName (the persons name)
        String userName = input.nextLine();

        //using the inputted name in a welcome message
        System.out.println("Hi " + userName + ", welcome to Starbase 13!");
        System.out.println(); //blank line

        // a discription of starbase 13
        System.out.println("As your shuttle approaches Starbase 13, the massive structure glimmers against the backdrop of distant stars.");
        System.out.println("Giant solar arrays unfold like metallic wings, harvesting light from a nearby binary sun system.");
        System.out.println("Dozens of docking bays line the lower rings, each illuminated with soft blue guidance lights.");
        System.out.println("Observation domes shimmer along the top deck, revealing bustling corridors filled with travelers from across the galaxy.");
        System.out.println("From this distance, the space station looks alive — a floating city of light, order, and endless adventure.");

        input.close();
    }
}