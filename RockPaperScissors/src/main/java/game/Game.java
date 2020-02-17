package game;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class Game {
	
	
	@RequestMapping(method = RequestMethod.POST, path = "/game")
	public static String played(String p1choice, String p2choice) {
		
		return CheckWinner.checkInput(p1choice,p2choice)
		 +"<br><br>" + "Player1 Score: " 
		+ Scores.p1win + " <br>" + "Player2 Score: " + Scores.p2win + "<br>" + "Drawn: " + Scores.draw;// + AddThis.htmlPage();
	}
	
	
	@RequestMapping(method = RequestMethod.GET, path = "/score")
	public String helloWorld() {
		
		return "Player 1 wins" + Scores.p1win + " <br>" + "Player 2 wins" +  Scores.p2win + "<br>" + "Ties" + Scores.draw;
	}
}
