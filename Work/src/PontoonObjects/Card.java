package PontoonObjects;

public class Card {

	int value = 0;
	public void value(){
		value = (int) (Math.random() * 9) + 1;
		System.out.println("Im guessing... "+value);

}
}