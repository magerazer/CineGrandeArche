import fr.demos.projet.metier.*;

public class Main {

	public static void main(String[] args) {
		
		Compte compte1 = new Compte("mag", "pwd");
		
		Article livre1 = new Livre("ref1", 25.0, "seigneur des anneaux1", 50, "Tolkien", "575");
		Article livre2 = new Livre("ref2", 20.0, "seigneur des anneaux2", 60, "Tolkien", "575");
		Article livre3 = new Livre("ref3", 80.0, "seigneur des anneaux3", 70, "Tolkien", "575");
		
		Article dvd1 = new ArticleDivers("dvd1", 10.0, "seigneur des anneaux1", 3);
		Article affiche1 = new ArticleDivers("affiche1", 5.0, "anneau", 1);
		
		Article pdf1 = new Livre("demat1", 3.0, "seigneurs des anneaux1", "pdf", "https://pdf1.com", "Tolkien", "123");
		Article kindle1 = new Livre("demat2", 4.0, "seigneurs des anneaux1", "kindle", "https://kindle1.com", "Tolkien", "123");
		 
		
		//System.out.println(livre1);
				
		
		Panier panier = new Panier(compte1);
		
		
		try {
			
			panier.ajouter(livre1, 1);
			panier.ajouter(livre2, 2);
			panier.ajouter(dvd1, 1);
			panier.ajouter(pdf1);
			
		} catch (StockException e) {
			System.err.println(e.getMessage());
		} 
		
		//panier.modifierQte(livre1, 100);
	
		panier.supprimerLigne(livre3);
		
		panier.diminuerQuantite(livre1);
		
		System.out.println(panier);
	
		
		Commande commande1 = new Commande();
		
		commande1.ajouter(panier);
		
		
	}

}
