
public class Product {
	
	// Properties
	public String name;
	
	public int price;
	
	public boolean electric;
	
	// Constructors (no args)
	public Product() {
		System.out.println("In no-arg constructor");
	}
	
	public Product(String name) {
		System.out.println("In arg constructor");
		this.name = name; // this betekent het huidige object
		
	}
	
	// Method declaration
	public void printName() {
		System.out.println("Naam is " + name);
	}
	
	public void overridePrice(int newPrice) {
		price = newPrice;
	}
	
	public int calculateTotalPrice() {
		int totalPrice = price * 2; // Voeg BTW toe
		return totalPrice;
	}
}

