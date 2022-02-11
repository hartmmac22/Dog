import java.util.ArrayList;

public class DogTester {
	public static void main(String[] args) {
		Dog d1 = new Dog("Link", 2010);
		Dog d2 = new Dog("Sparky", 2019);
		
		BassettHound h1 = new BassettHound ("Chloe", 2015, "Bassett Hound");
		BassettHound h2 = new BassettHound ("Luther", 2018, "Bassett Hound");
		
		BullDog b1 = new BullDog("Leo", 2012, "English Bulldog");
		BullDog b2 = new BullDog("Sam", 2011, "English BullDog");
		
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(d1);
		dogs.add(d2);
		dogs.add(b1);
		dogs.add(b2);
		dogs.add(h1);
		dogs.add(h2);
		
		dogs.set(0, h1);
		dogs.set(1, d2);
		dogs.set(2, b2);
		dogs.set(3, b1);
		dogs.set(4, h1);
		dogs.set(5, d1);
		
		
		System.out.print(dogs);
	}
}
