public class BullDog extends Dog {
	private String breed;
	
	public BullDog (String name, int birth, String breed) {
		super(name, birth);
		this.breed = breed;
	}
	
	public void swim() {
		System.out.print("splash splash");
	}
	
	public String toString() {
		return(super.toString() + ", " + breed);
	}
}
