package fr.demos.projet.metier;

public class ArticleDivers extends Article {

	private String type;
	private String caracteristiques;

	public ArticleDivers(String ref, double prixHT, String nom, String format, String url, String type, String caracteristiques) {
		super(ref, prixHT, nom, format, url);
		
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
