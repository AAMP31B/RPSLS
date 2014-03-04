package hodges;
import java.util.*;

public class RPSLS {

	private static int RNG(){
		Random die = new Random();
		int roll = die.nextInt(5)+1; //computers roll between 1 and 5
		return roll;
	}
	
	private static int UserGuess(Scanner keyboard){
		int userSelection = 0;

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
			RPSLS.Again(keyboard);
		}	
		return userSelection;
	}
	
	public static void LetsPlay(){
		System.out.println("Welcome to RPSLS.");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Let's get started.");
			
		
		int userSelection = UserGuess(keyboard);
		int computerGuess = RPSLS.RNG();
		
		Compare(userSelection, computerGuess, keyboard);
		RPSLS.Again(keyboard);
	}
	
	private static void Compare(int user, int computer, Scanner keyboard){
		if (user == computer)
			System.out.println("Draw! You both selected the same item!");
		else if (user == 1 && computer == 4)
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
		System.out.println("Do you wish to play again? ");
		System.out.print("Enter Yes or No: ");
		String again = keyboard.nextLine();
		if (again.equalsIgnoreCase("Yes"))
		{
			RPSLS.LetsPlay();
		}
		else
		System.exit(0);
	}

}
