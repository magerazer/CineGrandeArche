package fr.demos.projet.metier;

public class StockException extends Exception {

	String message;
	
	public StockException(int stock, int qte) {
		message = "stock : " + stock + "\nqte demandee : " + qte +
				"\nVeuillez saisir une qte d'articles inferieure à " + stock;
		
	}

	public String getMessage() {
		return message;
	}
	
	


}
