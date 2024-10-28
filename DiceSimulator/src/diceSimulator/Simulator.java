package diceSimulator;

import java.util.Scanner;

public class Simulator {
	static private Dice myDice;
	
	public Simulator() {
		
	}
	
	public void Run(Scanner input) {
		myDice = new Dice();
		String username = "";
		
		System.out.print("Please enter your username: ");
		
		username = input.next();
		
		for (int i = 0; i < 19; i++) {
			System.out.println(myDice.Roll());
		}
		
		System.out.println("Thank you for using the Dice Simulator, " + username);
	}
}
