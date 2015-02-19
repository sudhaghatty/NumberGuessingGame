package collegeboard;

import java.util.Scanner;

/**
 * @author Sudha
 *
 */
public class NumberGuessingGame {

	private Integer guessEnteredNumber = null;

	private int guessLower, guessUpper;

	public NumberGuessingGame() {
		this(1, 100);
	}

	public NumberGuessingGame(int lower, int higher) {
		this.guessLower = lower;
		this.guessUpper = higher;
	}

	public static void main(String[] args) {

		NumberGuessingGame object = new NumberGuessingGame();
		object.displayUserInstructions();

	}

	/**
     *
     * This method displays initial prompt instructions for the Game.
     * 
     */
	public void displayUserInstructions() {

		System.out.println("Choose a number between " + guessLower + "  and "
				+ guessUpper + "!");

		System.out
				.println("Enter higher if the number is Higher\nEnter lower if the number is Lower\nEnter yes/end if its the right number\n");
		System.out.println("Click Enter when you are ready:");
		guessUserNumber();
	}

	public void guessUserNumber() {

		String userInput = "Y";

		Scanner scanner = new Scanner(System.in);
		if (guessEnteredNumber == null) {
			guessEnteredNumber = guessUpper;
		}
		System.out.println("Is the number: " + guessEnteredNumber + "?");

		userInput = scanner.nextLine();
		if ("yes".equalsIgnoreCase(userInput)
				|| "end".equalsIgnoreCase(userInput)) {
			System.out.println("your number is :" + guessEnteredNumber);
			scanner.close();
		} else {
			guessEnteredNumber = findGuessedValue(userInput, guessEnteredNumber);
			guessUserNumber();
		}
	}

	/**
	 * This method returns the guessed Number based on the user input. 
	 *
	 * @param userInput
	 *            user Input on the guessed number.
	 * @param guessEnteredNumber
	 *            guessed number.
	 * @return it returns the next guess number based on the userInput.
	 */
	public int findGuessedValue(String userInput, int guessEnteredNumber) {
		if ("higher".equalsIgnoreCase(userInput)) {
			guessLower = guessEnteredNumber;
			guessEnteredNumber = (guessUpper + guessEnteredNumber) / 2;
		} else if ("lower".equalsIgnoreCase(userInput)) {
			guessUpper = guessEnteredNumber;
			guessEnteredNumber = (guessLower + guessEnteredNumber) / 2;
		}
		return guessEnteredNumber;
	}

}
