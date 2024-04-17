import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		int a = 1099;
		
		// Maak product 1 aan met properties
		Product product1 = new Product();
		product1.name = "TV";
		product1.price = a;
		product1.electric = true;
		
		// Maak product 2 aan
		Product product2 = new Product();
		product2.name = "Fiets";
		
		System.out.println(product1.price);
		
		// Method call
		product1.printName();
		product1.overridePrice(1234);
		int totalPrice = product1.calculateTotalPrice(); //met return value
		System.out.println("Total price = " + totalPrice);
		
		Product product3 = new Product("Laptop");
				
		// Pauline's favorite boek
		Boek theHungerGames = new Boek();
		theHungerGames.titel = "the Hunger Games";
		theHungerGames.schrijver = "Suzanna Collins";
		theHungerGames.uitgaveNummer = 3;
		theHungerGames.prijs = 19.99;
		theHungerGames.uitgeverij = "de bezige bij";
		
		Boek MaartenVanRossem = new Boek();
		MaartenVanRossem.titel = "Over Populisme en onze Democratie";
		MaartenVanRossem.schrijver = "Maarten van Rossem";
		MaartenVanRossem.uitgaveNummer = 2;
		MaartenVanRossem.prijs = 14.99;
		MaartenVanRossem.uitgeverij = "Nieuw Amsterdam";
		
		System.out.println(theHungerGames.titel);
		System.out.println(MaartenVanRossem.titel);
		
		theHungerGames.printSchrijver();
		theHungerGames.printTitel();
		
		theHungerGames.printPrijs();
		theHungerGames.korting(0.1);
		theHungerGames.printPrijs();
		
		theHungerGames.prijsOptellen(MaartenVanRossem);
		
		String out = theHungerGames.samenvatting();
		System.out.println(out);
		
		Boek LisaBoek = new Boek("Jip en Janneke", 9.99, "Annie MG Schmidt");
		LisaBoek.printSchrijver();
		
		// inheritance classes
		// Animal is abstract en kan niet aangemaakt worden.
//		Animal animal1 = new Animal();
//		animal1.setName("Diertje");
		
		Dog dog1 = new Dog();
		dog1.setName("Woefie");
		
		Cat cat1 = new Cat();
		cat1.setName("Poes");
		cat1.setLegs(4);
		
		boolean mybool = cat1 instanceof Animal;
		System.out.println("mybool = " + mybool);
		
		List<Animal> animals = new ArrayList<>();
		animals.add(cat1);
		animals.add(dog1);
		
		animals.forEach(animal -> {
			// Polymorphism: de abstract methode makeSound wordt automatisch ge-extend naar de respectievelijke methode van de respectievelijk class
			animal.makeSound();
		});
		
		// Nieuwe opdracht
		
		Tijdschrift linda = new Tijdschrift();
		linda.setColumnist("Jantje");
		linda.setDoi("12.34.56");		
		
	}

}
