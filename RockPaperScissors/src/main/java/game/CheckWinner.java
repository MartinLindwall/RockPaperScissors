package game;

import java.util.Random;

public class CheckWinner {
	
	static String randomChoice(String p1choice, String p2choice) {

		if(p1choice.equals("random")) {
			String[] computerChoice = {"rock", "paper", "scissors"};
			Random generator = new Random();
			int randomIndex = generator.nextInt(computerChoice.length);
			p1choice = computerChoice[randomIndex];
			
		}
		
		if(p2choice.equals("random")) {
			String[] computerChoice = {"rock", "paper", "scissors"};
			Random generator = new Random();
			int randomIndex = generator.nextInt(computerChoice.length);
			p2choice = computerChoice[randomIndex];
			
		}
			
		return winner(p1choice, p2choice);
			
	}
	
	static String winner(String p1choice, String p2choice) {
			
		if(p1choice.equals(p2choice)){
			Scores.draw++;
			return "Player1 chose: " + p1choice + "<br>" + "Player2 chose: " + p2choice + "<br>Draw";
		}
		
		else if (p1choice.equals("rock") && p2choice.equals("scissors") || (p1choice.equals("scissors") && p2choice.equals("paper"))
				|| (p1choice.equals("paper") && p2choice.equals("rock"))){
			Scores.p1win ++;
			return "Player1 chose: " + p1choice + "<br>" + "Player2 chose: " + p2choice + "<br>Player one won";	
		}
		
		else {
			Scores.p2win ++;
			return "Player1 chose: " + p1choice + "<br>" + "Player2 chose: " + p2choice + "<br>Player two won";
		}
	}
	
	public static String checkInput(String p1choice, String p2choice){
		
		if(p1choice != null && p2choice != null) {		
			return randomChoice(p1choice, p2choice);
		}
		return "You gotta chose something man";
	}

}