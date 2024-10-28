package diceSimulator;

import java.util.Scanner;

public class TwoPlayerGame {
	private static Dice dice1;
	private static Dice dice2;
	private static Player player1;
	private static Player player2;
	
	private int dice1Roll;
	private int dice2Roll;
	
	public TwoPlayerGame() {
		dice1 = new Dice();
		dice2 = new Dice();
	}
	
	public void Run(Scanner inputMaster) {
		System.out.println("Welcome Player one. Please enter your name: ");
		player1 = new Player(inputMaster.next(), 0.0f);  
		
		System.out.println("Welcome Player two. Please enter your name: ");
		player2 = new Player(inputMaster.next(), 0.0f);
		
		System.out.println("Dice1 		Dice2");
		System.out.println("***** 		*****");
		
		for (int i = 0; i < 3; i++) {
			dice1Roll = dice1.Roll();
			dice2Roll = dice2.Roll();
			
			if (dice1Roll == dice2Roll) {
				player1.incrementScore();
			}
			System.out.printf("%d   		%d   \n", dice1Roll, dice2Roll);
		}
		
		System.out.printf("%s's score = %.1f\n", player1.getName(), player1.getScore());
		
		System.out.println("Dice1 		Dice2");
		System.out.println("***** 		*****");
		
		for (int i = 0; i < 3; i++) {
			dice1Roll = dice1.Roll();
			dice2Roll = dice2.Roll();
			
			if (dice1Roll == dice2Roll) {
				player2.incrementScore();
			}
			System.out.printf("%d   		%d   \n", dice1Roll, dice2Roll);
		}
		
		System.out.printf("%s's score = %.1f\n", player2.getName(), player2.getScore());
		
		if (player1.getScore() > player2.getScore()) {
			System.out.printf("%s Wins!\n", player1.getName());
		} else if (player1.getScore() < player2.getScore()) {
			System.out.printf("%s Wins!\n", player2.getName());
		} else {
			System.out.printf("It's a draw!\n");
		}
	}

}
