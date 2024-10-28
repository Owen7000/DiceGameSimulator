package diceSimulator;

/**
 * <p>Dice class. Can roll.</p>
 * 
 * @author 1761799
 */
public class Dice {
	public Dice() {
	}
	
	/**
	 * <p>Roll the dice and return the result as an Integer</p>
	 * @return randomNum + 1 The number rolled on the dice +1   
	 */
	public int Roll() {
		int randomNum = (int)(Math.random() * 6);
		
		return randomNum += 1;
	}
}
