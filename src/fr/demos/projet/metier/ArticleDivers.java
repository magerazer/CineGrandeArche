package fr.demos.projet.metier;

public class ArticleDivers extends Article {

	

	public ArticleDivers(String ref, double prixHT, String nom, String format, String url) {
		super(ref, prixHT, nom, format, url);
		// TODO Auto-generated constructor stub
	}

	public ArticleDivers(String ref, double prixHT, String nom, int stock) {
		super(ref, prixHT, nom, stock);
		// TODO Auto-generated constructor stub
	}

	public ArticleDivers(String ref, double prixHT, String nom, int stock, Etat etat) {
		super(ref, prixHT, nom, stock, etat);
		// TODO Auto-generated constructor stub
	}

	
	
}
