package PontoonObjects;
import java.util.Scanner;
import PontoonObjects.Card;
public class Player {
	Scanner kboard = new Scanner(System.in);
	Card card1;
	Card card2;
	int total;
	String imp;
	
	public int total() {
	System.out.println("your have drawn a "+card1+" and a "+card2);
	total = card1 + card2;
	System.out.println("Would you like to draw another card? y/n");
	imp = kboard.next();
	while(imp.equalsIgnoreCase("y")+  total < 21) {
		Card newcard;
		total = total + newcard;
		System.out.println("Would you like to draw another card? y/n");
		imp = kboard.next();
	}
}
}
