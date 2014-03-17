package rpslsv2;

import java.util.*;


public class Game {

	enum Weapon {Rock, Paper, Scissors, Lizard, Spock}
	
	public static void LetsPlay(){
		System.out.println("Welcome to RPSLS."); //core of the game, could be used as a main method if so declared
		Scanner keyboard = new Scanner(System.in); //Scanner object to read keyboard inputs
		System.out.println("Let's get started.");
						
		Weapon userSelection = UserGuess(keyboard); //calls UserGuess method and passes in the Scanner object
		Weapon computerGuess = RNG(); //calls the random method to generate computer guesses
			
		Compare(userSelection, computerGuess); //passes both the user and computer guesses into compare method for results
		Again(keyboard); // after compare prints out results the program comes back here to ask if user wants to play again
	}
	
	private static Weapon RNG(){
		Random die = new Random(); //creates Random object
		Weapon computer = null;
		int roll = die.nextInt(5)+1; //computers roll between 1 and 5
		
		if (roll == 1)
			computer = Weapon.Rock;
		else if (roll == 2)
			computer = Weapon.Paper;
		else if (roll == 3)
			computer = Weapon.Scissors;
		else if (roll == 4)
			computer = Weapon.Lizard;
		else
			computer = Weapon.Spock;
		return computer;
	}
			
	private static Weapon UserGuess(Scanner keyboard){
		Weapon userSelection = null; //initialized variable to hold an Weapon enum for the user selection

		System.out.print("Please enter your selection of Rock, Paper, Scissors, Lizard, or Spock: ");
		String answer = keyboard.nextLine();
				
		if (answer.equalsIgnoreCase("rock"))
			userSelection = Weapon.Rock;
		else if (answer.equalsIgnoreCase("paper"))
			userSelection = Weapon.Paper;
		else if (answer.equalsIgnoreCase("scissors"))
			userSelection = Weapon.Scissors;
		else if (answer.equalsIgnoreCase("lizard"))
			userSelection = Weapon.Lizard;
		else if (answer.equalsIgnoreCase("spock"))
			userSelection = Weapon.Spock;
		else
		{
			System.out.println("You entered an invalid selection");
			Again(keyboard); //if answer isn't one of the above it starts the play again method
		}	
		return userSelection; //sends Weapon enum for the user's choice back to calling method
	}
			
			
	private static void Compare(Weapon user, Weapon computer){
		if (user == computer)//This if statement takes care of 5 separate statements in one line!
			System.out.println("DRAW! You both selected the same weapon!");//the rest just compare the results and whenever it finds a match
		else if (user == Weapon.Rock && computer == Weapon.Lizard)//the program prints a result and then jumps back to the LetsPlay method to ask for another game
			System.out.println("Your rock smashes the lizard!");
		else if (user == Weapon.Rock && computer == Weapon.Scissors)
			System.out.println("Your rock smashes the scissors!");
		else if (user == Weapon.Rock && computer == Weapon.Paper)
			System.out.println("Your rock is covered by paper");
		else if (user == Weapon.Rock && computer == Weapon.Spock)
			System.out.println("Your rock has been vaporized by Spock");
		else if (user == Weapon.Paper && computer == Weapon.Rock)
			System.out.println("Your paper covers the rock!");
		else if (user == Weapon.Paper && computer == Weapon.Scissors)
			System.out.println("Your paper is cut by the scissors!");
		else if (user == Weapon.Paper && computer == Weapon.Lizard)
			System.out.println("Your paper has been eaten by the Lizard!");
		else if (user == Weapon.Paper && computer == Weapon.Spock)
			System.out.println("Your paper has disproved Spock!");
		else if (user == Weapon.Scissors && computer == Weapon.Rock)
			System.out.println("Your scissors have been smashed by the rock!");
		else if (user == Weapon.Scissors && computer == Weapon.Paper)
			System.out.println("Your scissors have cut through the paper!");
		else if (user == Weapon.Scissors && computer == Weapon.Lizard)
			System.out.println("Your scissors have cutt off the lizards head!");
		else if (user == Weapon.Scissors && computer == Weapon.Spock)
			System.out.println("Your scissors have been smashed by Spock!");
		else if (user == Weapon.Lizard && computer == Weapon.Rock)
			System.out.println("Your lizard has been smashed by the rock!");
		else if (user == Weapon.Lizard && computer == Weapon.Paper )
			System.out.println("Your lizard has eaten the paper!");
		else if (user == Weapon.Lizard && computer == Weapon.Scissors)
			System.out.println("Your lizard has been decapitated by the scissors!");
		else if (user == Weapon.Lizard && computer == Weapon.Spock)
			System.out.println("Your lizard has poisoned Spock!");
		else if (user == Weapon.Spock && computer == Weapon.Rock)
			System.out.println("Spock has smashed the rock!");
		else if (user == Weapon.Spock && computer == Weapon.Paper )
			System.out.println("Spock has been dissproved by the paper!");
		else if (user == Weapon.Spock && computer == Weapon.Scissors)
			System.out.println("Spock has smashed the scissors!");
		else if (user == Weapon.Spock && computer == Weapon.Lizard )
			System.out.println("Spock has been poisoned by the lizard!");
	}
			
	private static void Again(Scanner keyboard){
		System.out.println("Do you wish to play again? ");//asks if the user wants to play again
		System.out.print("Enter Yes or No: "); //calls LetsPlay method if yes, if not exits.
		String again = keyboard.nextLine();
		if (again.equalsIgnoreCase("Yes"))
			{
			LetsPlay();
			}
		else
			System.exit(0);
	}

}
