package ua.lviv.lgs;

public class Aplication {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Cow cow = new Cow();
		cat.Voice();
		dog.Voice();
		cow.Voice();

		System.out.println();

		Amphibia frog = new Frog();
		frog.eat();
		frog.sleep();
		frog.swim();
		frog.walk();

	}

}
