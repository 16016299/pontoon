package Pontaloon;
import java.util.Scanner;

public class Pontoon1 {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		
		String imp;
		int card1, card2, newcard, cardtotal;
		
		card1 = (int) (Math.random() * 9) + 1;
		card2 = (int) (Math.random() * 9) + 1;
		cardtotal = card1 + card2;
		System.out.println("your first card is a "+card1+" and your second card is a "+card2);
		System.out.println("would you like another card? y/n");
		imp = kboard.next();
		
		while(imp.equalsIgnoreCase("y")) {
			newcard = (int) (Math.random() * 9) + 1;
			System.out.println("you have pulled a "+newcard);
			cardtotal = cardtotal + newcard;
			System.out.println("would you like another card? y/n");
			imp = kboard.next();
		}
		
		if(cardtotal < 17){
			System.out.println("you total at "+cardtotal+" while the house has 17");
			System.out.println("you loose");
		}
		else if(cardtotal > 21) {
			System.out.println("you total at "+cardtotal+" while the house has 17");
			System.out.println("youre bust");
		}
		else if(cardtotal == 17) {
			System.out.println("both you and the house total at 17");
			System.out.println("its a draw");
		}
		else {
			System.out.println("you total at "+cardtotal+" while the house has 17");
			System.out.println("you win");
		}
		kboard.close();
	}

}
