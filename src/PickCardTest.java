import static org.junit.Assert.*;

import org.junit.Test;


public class PickCardTest {

	@Test
	public void testPickingCard() {
		Deck decks = new Deck(1);
		int sortedDeck = decks.getCards().size();
		decks.pickCard();
		int minimizedDeck = decks.getCards().size();
		assertEquals(sortedDeck,minimizedDeck + 1);
	}

}
