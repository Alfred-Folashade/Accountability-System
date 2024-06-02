
public abstract class Quest {
	boolean isCompleted;
	int durationOfQuest;
	String questName;
	String questInfo;
	String difficultyLevel;
	String reward;
	
	
	public String toString() {
		
		return  "Quest: " + questName +
				"\nStatus: " + isCompleted+ 
				"\nDifficulty Level: " + difficultyLevel +
				"GOALS\n" +
				"CAUTION: If the quest remains incompleted penalties will be given accordingly. \n";
		
		
	}
	
	
	
	
}
