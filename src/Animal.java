
public abstract class Animal {
	
	protected String name;
	
	protected int legs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public abstract void makeSound();
	
}
