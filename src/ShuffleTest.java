import static org.junit.Assert.*;

import org.junit.Test;

public class ShuffleTest {

	@Test
	public void testshuffling() {
		Deck decks = new Deck(1);
		String sortedCard = decks.getCards().get(0).toString();
		decks.shuffleCards();
		String shuffledCard = decks.getCards().get(0).toString();
		assertNotEquals(sortedCard, shuffledCard);
	}

}
