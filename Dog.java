public class Dog {
	private String name;
	private int birth;
	
	public Dog (String name, int birth) { 
		this.name = name;
		this.birth = birth;
		
	}
	
	public void bark(String sound) {
		System.out.print(sound);
	}
	
	public void eat() {
		
	}
	
	public void sleep() {
		
	}
	
	public String toString() {
		return ("\nDog's Name and Age: " + name + ", " + birth );
	}
}
