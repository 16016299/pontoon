package PontoonObjects;
import java.util.Scanner;
import PontoonObjects.Card;
public class Player {
	Scanner kboard = new Scanner(System.in);
	Card Card1 = new Card();
	Card Card2 = new Card();
	int card1 = Card1.getCardValue();
	int card2 = Card2.getCardValue();
	int total;
	String imp;
	
	public int total() {
	System.out.println("your have drawn a "+card1+" and a "+card2);
	total = card1 + card2;
	System.out.println("Would you like to draw another card? y/n");
	imp = kboard.next();
	while((imp.equalsIgnoreCase("y"))&&  (total < 21)) {
		Card Newcard = new Card();
		int newcard = Newcard.getCardValue();
		System.out.println("your new card is a "+newcard);
		total = total + newcard;
		System.out.println("Would you like to draw another card? y/n");
		imp = kboard.next();
	}
	return total;
}
}
