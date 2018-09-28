package PontoonObjects;


import PontoonObjects.Card;

public class House {
	Card Card1 = new Card();
	Card Card2 = new Card();
	int housetotal;
	int card1 = Card1.getCardValue();
	int card2 = Card2.getCardValue();
	
	public int gethousetotal() {
	housetotal = card1 + card2;
	
	if (housetotal < 14) {
		Card Newcard = new Card();
		int newcard = Newcard.getCardValue();
		
		housetotal = housetotal + newcard;
		
	}
	return housetotal;
}
}

