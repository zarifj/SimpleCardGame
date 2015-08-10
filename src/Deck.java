import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representation of a set consisting of one or multiple deck of playing cards.
 *
 * @author Zarif Jawad
 * @version 1.0
 */
public class Deck {

	// Arraylist holding all the cards
	private ArrayList<Card> cards;

	// List of Constants of Suits
	public static enum Suits {
		Hearts, Spades, Diamonds, Clubs
	};

	// List of Constants of Ranks
	public static enum Ranks {
		Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
	};

	/**
	 * Constructor for creating a new set of playing cards consisting of one or
	 * multiple decks.
	 * 
	 * @param no
	 *            of Decks to be involved in the creation of the cards
	 */
	public Deck(int totalDecks) {
		cards = new ArrayList<Card>();
		for (int k = 0; k < totalDecks; k++) {
			for (Suits suit : Suits.values())
				for (Ranks rank : Ranks.values())
					cards.add(new Card(suit.ordinal(), rank.ordinal(), k));
		}
	}

	/**
	 * @return An Arraylist containing all the set of cards in hand
	 */
	public ArrayList<Card> getCards() {
		return cards;
	}

	/**
	 * Prints the whole set of cards in the hand
	 */
	public void printList() {
		for (Card card : cards)
			System.out.println(card.toString());
	}

	/**
	 * Shuffles the cards present in the set.
	 */
	public void shuffleCards() {
		Collections.shuffle(cards);
		System.out.println("All the cards have been shuffled");
	}

	/**
	 * Sorts the card according the deck, suit and rank of the set of cards
	 */
	public void sortCards() {
		// While sorting compare first with deck index
		Comparator<Card> byDeckIndex = (c1, c2) -> c1.getDeck().compareTo(
				c2.getDeck());
		// While sorting compare second with suit index
		Comparator<Card> bySuitIndex = (c1, c2) -> c1.getSuit().compareTo(
				c2.getSuit());
		// While sorting compare second with rank index
		Comparator<Card> byRankIndex = (c1, c2) -> c1.getRank().compareTo(
				c2.getRank());
		cards = (ArrayList<Card>) cards
				.stream()
				.sorted(byDeckIndex.thenComparing(bySuitIndex).thenComparing(
						byRankIndex)).collect(Collectors.toList());
		System.out.println("All the cards have been sorted");
	}

	/**
	 * Deal one card from the total set of cards.
	 * 
	 * @return a card from the set of cards, or the null reference if there are
	 *         no cards left in the set.
	 */
	public Card pickCard() {
		if (cards.size() > 0) {
			Card card = cards.remove(0);
			System.out.println("The picked card is " + card.toString());
			return card;
		} else {
			System.out.println("There is no more card to be picked");
			return null;
		}
	}

}
