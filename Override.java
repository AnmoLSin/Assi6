class Animal
{
	String breed,color;
	void speak()
	{
		System.out.println("Animal here");
	}
	
	
}
class Dog extends Animal
{
	String breed,color;
	void speak()
	{
		System.out.println("Bhao");
	}
	
	
}
class Cat extends Animal
{
	
	String breed,color;
	void speak()
	{
		System.out.println("Meow");
	}
	
}
public class Override {
	public static void main(String[] args) {
		Animal obj=new Animal();
		Dog obj1=new Dog();
		Cat obj2=new Cat();
		obj.speak();
	    obj1.speak();
	    obj2.speak();
		
		
	}
}