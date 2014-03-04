package rpsls;
import java.util.*;

public class RPSLS {
//Built so that a main just calls LetsPlay() and game starts.
	private static int RNG(){
		Random die = new Random(); //creates Random object
		int roll = die.nextInt(5)+1; //computers roll between 1 and 5
		return roll; //sends the roll result back to calling method
	}
	
	private static int UserGuess(Scanner keyboard){
		int userSelection = 0; //initialized variable to hold an int for the user selection

		System.out.print("Please enter your selection of Rock, Paper, Scissors, Lizard, or Spock: ");
		String answer = keyboard.nextLine();
		
		if (answer.equalsIgnoreCase("rock"))
			userSelection = 1;
		else if (answer.equalsIgnoreCase("paper"))
			userSelection = 2;
		else if (answer.equalsIgnoreCase("scissors"))
			userSelection = 3;
		else if (answer.equalsIgnoreCase("lizard"))
			userSelection = 4;
		else if (answer.equalsIgnoreCase("spock"))
			userSelection = 5;
		else
		{
			System.out.println("You entered an invalid selection");
			RPSLS.Again(keyboard); //if answer isn't one of the above it starts the play again method
		}	
		return userSelection; //sends int for the user's choice back to calling method
	}
	
	public static void LetsPlay(){
		System.out.println("Welcome to RPSLS."); //core of the game, could be used as a main method if so declared
		Scanner keyboard = new Scanner(System.in); //Scanner object to read keyboard inputs
		System.out.println("Let's get started.");
			
		
		int userSelection = UserGuess(keyboard); //calls UserGuess method and passes in the Scanner object
		int computerGuess = RPSLS.RNG(); //calls the random method to generate computer guesses
		
		Compare(userSelection, computerGuess, keyboard); //passes both the user and computer guesses into compare method for results
		RPSLS.Again(keyboard); // after compare prints out results the program comes back here to ask if user wants to play again
	}
	
	private static void Compare(int user, int computer, Scanner keyboard){
		if (user == computer)//This if statement takes care of 5 seperate statements in one line!
			System.out.println("Draw! You both selected the same item!");//the rest just compare the results and whenever it finds a match
		else if (user == 1 && computer == 4)//the program prints a result and then jumps back to the LetsPlay method to ask for another game
			System.out.println("Your rock smashes the lizard!");
		else if (user == 1 && computer == 3)
			System.out.println("Your rock smashes the scissors!");
		else if (user == 1 && computer == 2)
			System.out.println("Your rock is covered by paper");
		else if (user == 1 && computer == 5)
			System.out.println("Your rock has been vaporized by Spock");
		else if (user == 2 && computer == 1)
			System.out.println("Your paper covers the rock!");
		else if (user == 2 && computer == 3)
			System.out.println("Your paper is cut by the scissors!");
		else if (user == 2 && computer == 4)
			System.out.println("Your paper has been eaten by the Lizard!");
		else if (user == 2 && computer == 5)
			System.out.println("Your paper has disproved Spock!");
		else if (user == 3 && computer == 1)
			System.out.println("Your scissors have been smashed by the rock!");
		else if (user == 3 && computer == 2)
			System.out.println("Your scissors have cut through the paper!");
		else if (user == 3 && computer == 4)
			System.out.println("Your scissors have cutt off the lizards head!");
		else if (user == 3 && computer == 5)
			System.out.println("Your scissors have been smashed by Spock!");
		else if (user == 4 && computer == 1)
			System.out.println("Your lizard has been smashed by the rock!");
		else if (user == 4 && computer == 2 )
			System.out.println("Your lizard has eaten the paper!");
		else if (user == 4 && computer == 3)
			System.out.println("your lizard has been decapitated by the scissors!");
		else if (user == 4 && computer == 5)
			System.out.println("Your lizard has poisoned Spock!");
		else if (user == 5 && computer == 1)
			System.out.println("Spock has smashed the rock!");
		else if (user == 5 && computer == 2 )
			System.out.println("Spock has been dissproved by the paper!");
		else if (user == 5 && computer == 3)
			System.out.println("Spock has smashed the scissors!");
		else if (user == 5 && computer == 4 )
			System.out.println("Spock has been poisoned by the lizard!");
	}
	
	private static void Again(Scanner keyboard){
		System.out.println("Do you wish to play again? ");//asks if the user wants to play again
		System.out.print("Enter Yes or No: "); //calls LetsPlay method if yes, if not exits.
		String again = keyboard.nextLine();
		if (again.equalsIgnoreCase("Yes"))
		{
			RPSLS.LetsPlay();
		}
		else
		System.exit(0);
	}

}
