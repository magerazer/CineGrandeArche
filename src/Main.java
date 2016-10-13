import fr.demos.projet.metier.*;

public class Main {

	public static void main(String[] args) {
		
		Article livre1 = new Livre("ref1", 25.0, "seigneur des anneaux 1", 50, "Tolkien", "575");
		Article livre2 = new Livre("ref2", 20.0, "seigneur des anneaux 2", 60, "Tolkien", "575");
	
		//System.out.println(livre1);
				
		
		Panier panier = new Panier();
		
		try {
			panier.ajouter(livre1, 40);
		} catch (StockException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println(panier);
		
	}

}
