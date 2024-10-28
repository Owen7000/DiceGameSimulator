package diceSimulator;

public class ThrowASix {
	private int score;
	private static Dice myDice;
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLINK = "\u001B[5m"; 
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[40m";
	public static final String ANSI_LIGHT_GREEN_BACKGROUND = "\u001B[102m"; 
	
	
	public ThrowASix() {
		this.score = 5;
		
		myDice = new Dice();
	}
	
	public void Run() {
		 
		 do {
			 int diceRoll = myDice.Roll();
			 
			 if (diceRoll == 1 | diceRoll == 2 | diceRoll == 3) {
				 System.out.println("   ________     ");
				 System.out.println("  /\\       \\   ");
				 System.out.println(" /()\\   ()  \\  ");
				 System.out.println("/    \\_______\\ ");
				 System.out.println("\\    /()     /  ");
				 System.out.println(" \\()/   ()  /   ");
				 System.out.println("  \\/_____()/    ");
				 System.out.println("");
			 } else if (diceRoll == 4 | diceRoll == 5 | diceRoll == 6) {
				 System.out.println("   ________      ");
				 System.out.println("  /\\ ()  ()\\    ");
				 System.out.println(" /()\\ ()  ()\\   ");
				 System.out.println("/  ()\\_()_()_\\  ");
				 System.out.println("\\()  /()  () /   ");
				 System.out.println(" \\()/   ()  /    ");
				 System.out.println("  \\/_()__()/     ");
				 System.out.println();
			 }
			 
			 System.out.printf("Dice Roll:%d Your Score:%d\n", diceRoll, score);
			 

			 if (diceRoll == 6) {
//				 System.out.printf(ANSI_GREEN + "You Win! Your score is %d\n" + ANSI_RESET, score);
				 showWinMessage();
				 break;
			 } else {
				 score--;
			 }
			 
			 if (score == 0) {
				 System.out.printf(ANSI_RED + "You lose!\n" + ANSI_RESET);
			 }
			 
		 }while(score > 0);
		 
	}
	
	private void showWinMessage() {
		System.out.println(ANSI_GREEN_BACKGROUND + ANSI_GREEN + ANSI_BLINK);
		System.out.println("   ___    ___ ________  ___  ___          ___       __   ___  ________   ___        ");
		System.out.println("  |\\  \\  /  /|\\   __  \\|\\  \\|\\  \\        |\\  \\     |\\  \\|\\  \\|\\   ___  \\|\\  \\       ");
		System.out.println("  \\ \\  \\/  / | \\  \\|\\  \\ \\  \\\\\\  \\       \\ \\  \\    \\ \\  \\ \\  \\ \\  \\\\ \\  \\ \\  \\      ");
		System.out.println("   \\ \\    / / \\ \\  \\\\\\  \\ \\  \\\\\\  \\       \\ \\  \\  __\\ \\  \\ \\  \\ \\  \\\\ \\  \\ \\  \\     ");
		System.out.println("    \\/  /  /   \\ \\  \\\\\\  \\ \\  \\\\\\  \\       \\ \\  \\|\\__\\_\\  \\ \\  \\ \\  \\\\ \\  \\ \\__\\    ");
		System.out.println("  __/  / /      \\ \\_______\\ \\_______\\       \\ \\____________\\ \\__\\ \\__\\\\ \\__\\|__|    ");
		System.out.println(" |\\___/ /        \\|_______|\\|_______|        \\|____________|\\|__|\\|__| \\|__|   ___  ");
		System.out.println(" \\|___|/                                                                      |\\__\\ ");
		System.out.println("                                                                              \\|__| ");
		System.out.println("                                                                                    ");
		System.out.println(""+ ANSI_RESET);
		System.out.println(ANSI_LIGHT_GREEN_BACKGROUND);
		System.out.println("+——————————————————————————————————————————————————————————————————————————————————+");
		System.out.println("|                                                                                  |");
		System.out.printf("| Your score was: %d   Well Done!                                                   |\n", score);
		System.out.println("|                                                                                  |");
		System.out.println("+——————————————————————————————————————————————————————————————————————————————————+");
		System.out.println(ANSI_RESET);
	}
}
