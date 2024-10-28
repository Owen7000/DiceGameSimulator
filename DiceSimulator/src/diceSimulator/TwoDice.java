package diceSimulator;

public class TwoDice {
	private static Dice dice1;
	private static Dice dice2;
	private int score = 0;
	private int dice1Roll;
	private int dice2Roll;

	public TwoDice() {
		dice1 = new Dice();
		dice2 = new Dice();
		
		dice1Roll = 0;
		dice2Roll = 0;
	}
	
	public void Run() {
		System.out.println("Dice1 		Dice2");
		System.out.println("***** 		*****");
		
		for (int i = 0; i < 3; i++) {
			dice1Roll = dice1.Roll();
			dice2Roll = dice2.Roll();
			
			if (dice1Roll == dice2Roll) {
				score++;
			}
			System.out.printf("%d   		%d   \n", dice1Roll, dice2Roll);
		}
		
		System.out.printf("Your score = %d\n", score);
	}
}
