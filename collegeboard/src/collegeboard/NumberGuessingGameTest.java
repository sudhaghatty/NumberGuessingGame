package collegeboard;

import junit.framework.TestCase;

import org.junit.Assert;

public class NumberGuessingGameTest extends TestCase{

	public void testGame() {
		NumberGuessingGame objNumberGuessingGame = new NumberGuessingGame();
		int result = objNumberGuessingGame.findGuessedValue("higher",25);
		Assert.assertEquals(25,result);
	}
	
}	