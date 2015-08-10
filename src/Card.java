/**
 * Representation of a single playing card. A card consists of a Suit value
 * (e.g. hearts, spades), a Rank value (e.g. ace, 7, king)
 *
 * @author Zarif Jawad
 * @version 1.0
 */
public class Card {

	// Instance variable for the card
	public Integer rank, suit, deck;

	/**
	 * Constructor for creating a new playing card.
	 * 
	 * @param suit
	 *            the suit value of this card.
	 * @param rank
	 *            the rank value of this card.
	 * @param deck
	 *            the deck set which the card belongs to
	 */
	Card(int suit, int rank, int deck) {
		this.rank = rank;
		this.suit = suit;
		this.deck = deck;
	}

	/**
	 * Returns the rank value of the card.
	 * 
	 * @return an integer variable representing the rank value of the card.
	 */
	public Integer getDeck() {
		return deck;
	}
	
	/**
	 * Returns the rank value of the card.
	 * 
	 * @return an integer variable representing the rank value of the card.
	 */
	public Integer getRank() {
		return rank;
	}

	/**
	 * Returns the suit value of the card.
	 * 
	 * @return an integer variable representing the suit value of the card.
	 */
	public Integer getSuit() {
		return suit;
	}

	/**
	 * Returns a description of the rank and suit of this card.
	 * 
	 * @return the rank and suit value of the card as a string.
	 */
	@Override
	public String toString() {
		return Deck.Ranks.values()[rank] + " of " + Deck.Suits.values()[suit];
	}
}
