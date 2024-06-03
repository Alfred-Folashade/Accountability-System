//Player class
public class Player {
	private int level=0;
	private String rank = "E";
	private String name ;
	private int experiencePoints = 0;
	private int strength = 0;
	private int intelligence = 0;
	private int agility = 0;
	
	Player(String name){
		this.name = name;
	}	
	 
	public void upgradeRank() {
		String previousRank = rank;
		
		if(experiencePoints>200) rank="D";
		if(experiencePoints>400) rank="C";
		if(experiencePoints>600) rank="B";
		if(experiencePoints>800) rank="A";
		if(experiencePoints>1000) rank="S";
		
		if(previousRank!=rank) {
			System.out.println("Congratulations! Your new rank is now: "+ rank);
		}
		else {
			System.out.println("Unfortunately you do not have enough xp to upgrade your rank.");
		}
		
	}
	
	public void upgradeLevel() {
		int previousLevel = level;
		
		level = experiencePoints / 10;
		
		if(previousLevel != level) {
			System.out.println("Congratulations! Your new level is now: "+ level);
		}
		else {
			System.out.println("Unfortunately you do not have enough xp to upgrade your level.");
		}
		
	}
	public String toString() {
		return "STATUS:\n" +"\nNAME: "+name
				+"\nLEVEL: "+level+
				"\nRank: " + rank
				+"\n------------\n"+
				"STRENGTH: "+ strength+
				"INTELLIGENCE: "+ intelligence+
				"AGILITY: "+agility
				+"\n------------\n"+
				"XP: "+experiencePoints;
		
	}
}
