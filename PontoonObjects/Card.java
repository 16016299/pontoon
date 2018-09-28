package PontoonObjects;

public class Card {

	int value;

	public int getCardValue(){
		this.value = (int) (Math.random() * 9) + 1;
		return this.value;
	}
}