
public class FordFigo {
	//properties 
	String color;
	int modelNumber;
	
	//8 primitive datatypes
	/**
	 * byte, byte b = 10 (literal);
	 * short, short sh = 10;
	 * int, int i = 10;
	 * long, long l = 10;
	 * float, float f = 32.5f;
	 * double, double d = 12.5;
	 * boolean, boolean flag = true;
	 * char, char ch = 'a';
	 *  */
	FordFigo(String color,int modelNo){
		this.color = color;
		this.modelNumber = modelNo;
	}

	//methods
	boolean unlockCar() {
		//code to unlock car
		System.out.println("FordFigo is unlocked");
		return true;
	}
	boolean lockCar() {
		System.out.println("FordFigo is locked");
		return true;
	}
	boolean applyBrakes() {
		System.out.println("FordFigo brake is applied");
		return true;
	}
	boolean acclerate() {
		System.out.println("FordFigo is accelarated");
		return true;
}
	

}
