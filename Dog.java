class Animal{
	public void eat() {
		System.out.println("eats");
	}
}
public class Dog extends Animal{

	public void eat() {
		System.out.println("eatsbone");
	}
	
	public void playdead() {
		System.out.println("playdead");
	}
	
	
	public static void main(String[] args) {
		Animal animal=new Dog();
		animal.eat();
		((Dog)animal).playdead();
		
		
		Animal animalobj=new Animal();
		Dog dog=new Dog();
		//animalobj=dog;
		dog=(Dog) animalobj;
		
		
		
	}
}
