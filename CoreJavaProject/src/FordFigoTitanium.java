
public class FordFigoTitanium extends FordFigo{
	


	int bumper;
	
	FordFigoTitanium(String color,int modelNo,int bumper){
		super(color,modelNo);
		this.bumper=bumper;
	}
	
	
	public FordFigoTitanium(String color, int modelNo) {
		super(color, modelNo);
		// TODO Auto-generated constructor stub
	}


	boolean airBags() {
		System.out.println("Airbags of Ford Figo Titanium");
		return true;
	}
	
	//Method Overriding
	@Override
	boolean applyBrakes() {
		// TODO Auto-generated method stub
		System.out.println("ABS brakes applied");
		return true;
	}
	
}
