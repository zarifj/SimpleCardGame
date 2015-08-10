import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class SortTest {

	@Test
	public void testSorting() {
		Deck decks = new Deck(1);
		String sortedCard = decks.getCards().get(0).toString();
		decks.shuffleCards();
		decks.sortCards();
		String shuffledCard = decks.getCards().get(0).toString();
		assertEquals(sortedCard, shuffledCard);
	}

}
