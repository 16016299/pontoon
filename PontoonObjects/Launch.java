package PontoonObjects;
import PontoonObjects.Player;
import PontoonObjects.House;
public class Launch {
	public static void main(String[] args) {
		System.out.println("game start");
		Player P1 = new Player();
		House P2 = new House();
		
		int playertotal = P1.total();
		int house = P2.gethousetotal();
		
		System.out.println("you have "+playertotal+" and house has "+house);
		
		if(playertotal > 21){
			if(house < 22) {
			System.out.println("youre bust, house wins");
		}
			else if(house > 21) {
			System.out.println("youre both bust, its a draw");
		}
		}
		
		if(playertotal < 22) {
			if(house > 21) {
				System.out.println("house is bust, you win");
			}
			else if(house < 22) {
				if(playertotal > house) {
					System.out.println("you win");
				}
				else if(house > playertotal) {
					System.out.println("you loose");
				}
				else {
					System.out.println("its a draw");
				}
			
		}
	}
	

	}
}
