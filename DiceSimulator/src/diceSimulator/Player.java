package diceSimulator;

/**
 *  Player refers to each player in a game. Used in games after Task 4.
 *  
 *  @author 1761799
 */
public class Player {
	/**
	 * The name of the player
	 */
	private String name;
	
	/**
	 * The players score
	 */
	private Float score;
	
	/**
	 * <p></p>
	 * 
	 * @param playerName
	 * @param startingScore
	 */
	public Player(String playerName, Float startingScore) {
		name = playerName;
		score = startingScore;
	}
	
	/**
	 * <p>Gets the name of the player for use in games</p>
	 * @return the name of the player as a String
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * <p>Gets the players score.</p>
	 * @return the players score as a float
	 */
	public Float getScore() {
		return score;
	}
	
	/**
	 * <p>Sets the name of the player</p>
	 * 
	 * @param newName The new name for the player
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * <p>Sets the score of the player</p>
	 * 
	 * @param newScore The new score of the player
	 */
	public void setScore(Float newScore) {
		score = newScore;
	}
	
	/**
	 * <p>Increments the players score by 1</p>
	 */
	public void incrementScore() {
		score++;
	}
	
	/**
	 * <p>Increments the players score by the value provided</p>
	 * 
	 * @param byValue
	 */
	public void incrementScore(Float byValue) {
		score += byValue;
	}
	
	public String toString() {
		String classDescription = "Player class. Contains a name and score";
		
		return classDescription;
	}
}
