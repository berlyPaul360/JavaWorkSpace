
public class FordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FordFigo myCar = new FordFigo("white",12345);
		myCar.unlockCar();
		myCar.acclerate();
		myCar.applyBrakes();
		myCar.lockCar();
		
		
		System.out.println("-------------------------------------");
		FordFigoTitanium myCar2= new FordFigoTitanium("black", 67895,2);
		myCar2.unlockCar();
		myCar2.acclerate();
		myCar2.applyBrakes();
		myCar2.applyBrakes();
		myCar2.lockCar();
		

	}

}
