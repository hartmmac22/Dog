public class BassettHound extends Dog {
	private String breed;
	
	public BassettHound (String name, int birth, String breed) {
		super(name, birth);
		this.breed = breed;
	}
	
	public void snore() {
		System.out.print("ZZZzzz");
	}
	
	public String toString() {
		return(super.toString () + ", " + breed);
	}
}
