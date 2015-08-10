import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The Game class implements an application which is a simple card Game
 *
 * @author Zarif Jawad
 * @version 1.0
 */
public class Game {
	// Instance variable for the Game
	private static Scanner console;

	/**
	 * This is where the user starts Playing with the and the different
	 * operations are performed according to the User input
	 */
	public static void startPlaying(int totalDecks) {
		Boolean continuePlaying = true;
		Deck deck = new Deck(totalDecks);
		while (continuePlaying) {
			try {
				System.out
						.println("Press enter 1 to shuffle, 2 to sort, 3 to pick Card,4 to print the list of cards, 5 to restart, 6 to exit");
				int choice = console.nextInt();
				switch (choice) {
				case 1:
					deck.shuffleCards();
					break;
				case 2:
					deck.sortCards();
					break;
				case 3:
					Card card = deck.pickCard();
					if (card == null) {
						System.out
								.println("Press enter 5 to restart, 6 to exit");
						continuePlaying = false;
						if (console.nextInt() == 5) {
							startGame();
						} else {
							System.exit(0);
						}
						break;
					}
					break;
				case 4:
					deck.printList();
					break;
				case 5:
					continuePlaying = false;
					startGame();
				case 6:
					continuePlaying = false;
					System.exit(0);
				default:
					System.out
							.println("Input Mismatch! Please enter Numbers between 1 - 6");
					break;

				}
			} catch (InputMismatchException e) {
				System.out.println("Input Mismatch! Please enter Numbers");
			}
			console.nextLine();
		}
	}

	/**
	 * The Game is started here with the user inputing the number of decks
	 * involved in the Game
	 */
	public static void startGame() {
		System.out.println("Welcome to the Card Game!!!!");

		System.out
				.println("Please enter how many decks should be involved in and hit enter (Enter 0 to end.) !!!!");

		Boolean continueGame = true;
		while (continueGame) {
			try {
				int totalDecks = console.nextInt();
				startPlaying(totalDecks);
			} catch (InputMismatchException e) {
				System.out.println("Input Mismatch! Please enter Numbers");
			}
			console.nextLine();
		}

		System.exit(0);
	}

	public static void main(String[] args) {
		console = new Scanner(System.in);
		startGame();
	}
}