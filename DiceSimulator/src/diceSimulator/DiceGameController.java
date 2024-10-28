package diceSimulator;

import java.util.Scanner;

/**
 *  DiceGameController. Main controller class for the program.
 *  
 *  @author 1761799
 */
public class DiceGameController {
	private static Simulator diceSim;
	private static ThrowASix throwSix;
	private static TwoDice twoDice;
	private static TwoPlayerGame twoPlayerGame;
	
	public static final String ANSI_RESET = "\u001B[0m"; 
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
	public static void main(String[] args) {
		Scanner menuInput = new Scanner(System.in);
		int menuChoice;
		
		
		do {
			System.out.println("Please Choose one of the options below:\n1: Run the Simulator\n2:Throw a Six\n3: Two Dice Game\n4: Two Player Game\n5: Exit");
			menuChoice = menuInput.nextInt();
			
		    System.out.print("\033[H\033[2J");  
		    System.out.flush();  
			
			
			switch(menuChoice) {
			case 1:
				System.out.println("You have chosen menu option 1");
				diceSim = new Simulator();
				diceSim.Run(menuInput);
				break;
				
			case 2:
				System.out.println("You have chosen menu option 2");
				throwSix = new ThrowASix();
				throwSix.Run();
				break;
						
			case 3:
				System.out.println("You have chosen menu option 3");
				twoDice = new TwoDice();
				twoDice.Run();
				break;
			
			case 4:
				twoPlayerGame = new TwoPlayerGame();
				twoPlayerGame.Run(menuInput);
				break;
				
			case 5:
				break;
			
			default:
				System.out.printf(ANSI_RED_BACKGROUND + ANSI_WHITE + "INVALID MENU OPTION" + ANSI_RESET + "\n");
				System.out.println("Please enter the number of the menu option that you wish to play");
				menuChoice = 0;
			}
		} while (menuChoice < 5);
		
		menuInput.close();
		System.out.println("GoodBye!");
	}
	

}
