
public class AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Animal animal = new Animal();
		//cannot create an object for an abstract class
		
		Snake snake = new Snake();
		
		Dog dog = new Dog();
		
		//Animal animal1 = new Snake();
		
		//a super class reference variable can point to a sub class object
		Animal animal1 = new Snake();
		Animal animal2 = new Dog();
		
		
		animal1.breath();
		animal1.mobile();
		//animal1.kills();
		
		//Down-casting
		Snake snake1 = (Snake)animal1;
		//kills implementation available
		snake1.kills();

	}

}
