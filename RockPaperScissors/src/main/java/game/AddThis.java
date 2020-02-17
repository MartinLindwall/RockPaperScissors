package game;

public class AddThis {
	public static String htmlPage() {
		
		return "<html> <body> <form action = http://localhost:8080/game method = post>\r\n" + 
				"<h2>Player 1:</h2>\r\n" + 
				"Rock:<input type=\"radio\" id=\"rock\" name=\"p1choice\" value=\"rock\"><br>\r\n" + 
				"Paper:<input type=\"radio\" id=\"paper\" name=\"p1choice\" value=\"paper\"><br>\r\n" + 
				"Scissors:<input type=\"radio\" id=\"scissors\" name=\"p1choice\" value=\"scissors\"><br>\r\n" + 
				"Random:<input type=\"radio\" id=\"random\" name=\"p1choice\" value=\"random\"><br>\r\n" + 
				
				"\r\n" + 
				"<h2>Player 2:</h2>\r\n" + 
				"Rock:<input type=\"radio\" id=\"rock\" name=\"p2choice\" value=\"rock\"><br>\r\n" + 
				"Paper:<input type=\"radio\" id=\"paper\" name=\"p2choice\" value=\"paper\"><br>\r\n" + 
				"Scissors:<input type=\"radio\" id=\"scissors\" name=\"p2choice\" value=\"scissors\"><br>\r\n" + 
				"Random:<input type=\"radio\" id=\"random\" name=\"p2choice\" value=\"random\"><br>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"  <input type=\"submit\" value=\"Submit\">\r\n" + 
				"</form>\r\n" + 
				"<form action= http://localhost:8080/score method = get>\r\n" + 
				"\r\n" + 
				"</form>"+
				"</body></html>";
	}

}
