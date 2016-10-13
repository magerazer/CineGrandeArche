package fr.demos.projet.metier;

import java.util.ArrayList;

public class Panier {

	private Compte compte;
	private ArrayList<LignePanier> panier = new ArrayList<>();;

	public Panier() {

	}

	public Panier(Compte compte) {
		this.compte = compte;
	}

	// recalcule à chaque fois le prix total
	public int getPrixTotal() {
		int prixTotal = 0;
		for (LignePanier l : panier) {
			prixTotal += l.getArticle().getPrixHT();
		}
		return prixTotal;
	}

	public void ajouter(Article a, int qte) throws StockException {
		LignePanier l = new LignePanier(a, qte);
		int stock = 0;
		if (a.getMat() != null) {
			stock = a.getMat().getStock();
		}
		int index = panier.indexOf(l);
		int quantite = qte;
		// 1) cas d'une ligne existante
		if (index != -1) {
			LignePanier ligneExistante = panier.get(index);
			quantite = ligneExistante.getQuantite() + qte;

			// gestion de l'erreur sur le stock dans le cas d'une ligne
			// existante

			if (quantite > stock) {
				throw new StockException(stock, quantite);
			}

			ligneExistante.setQuantite(quantite);
		}
		// 2) cas d'une ligne inexistante
		else

		{
			if (quantite > stock) {
				throw new StockException(stock, qte);
			}

			panier.add(l);
		}

	}
	
	public void supprimerLigne(Article a) {
		LignePanier lp = new LignePanier(a, 0);
		panier.remove(panier.indexOf(lp));
	}
	
	public void modifierQte(Article argA, int qte) {
		int index = panier.indexOf(argA);
		LignePanier lp = panier.get(index);
		
		
	}
	
	public void vider() {
		panier.removeAll(panier);
	}
	

	@Override
	public String toString() {
		return "Panier [panier=" + panier + "]";
	}

}
