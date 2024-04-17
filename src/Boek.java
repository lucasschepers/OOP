
public class Boek extends Publicaties {
	
	// Properties
		
	public int uitgaveNummer;
	
	public String uitgeverij;
	
	// Constructors
	
	public Boek() {
		System.out.println("In de no arg constructor. Goedemiddag.");
	}
	
	public Boek(String titelIn, double prijsIn, String schrijverIn) {
		System.out.println("In de ARG constructor.");
		this.titel = titelIn;
		this.schrijver = schrijverIn;
		this.prijs = prijsIn;
	}	
	
	// Methods
	
	public void printSchrijver() {
		System.out.println("Het boek geschreven door: " + schrijver);
	}
	
	public void printTitel() {
		System.out.println("De titel is: " + titel);
	}
	
	public void korting(double kortingProcent) {
		prijs = prijs * (1 - kortingProcent);
	}
	
	public double prijsOptellen(Boek tweedeBoek) {
		double som = tweedeBoek.prijs + prijs;
		System.out.println("De totale prijs is " + som);
		return som;
	}
	
	public void printPrijs() {
		System.out.println("De prijs is: " + prijs);
	}
	
	public String samenvatting() {
		String returnString = "De titel is: " + titel + ". De auteur is: " + schrijver + ". Uitgegeven door: " + uitgeverij + ". Prijs: " + prijs;
		return returnString;
	}
	
}
