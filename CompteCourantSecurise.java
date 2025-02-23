public class CompteCourantSecurise <T> extends Compte  implements Securisable {
	private String id;
	
	public CompteCourantSecurise(Object devise, int numeroCompte, double solde, String id) {
		super(devise, numeroCompte, solde);
		this.id = id;
	}

	public boolean verifierIdentite (String identifiant) {
		return this.id.equals(identifiant);
		
	}
	public void afficheSolde(String identifiant)throws AccesException {
		if (verifierIdentite (identifiant)) {
			afficherSolde();

		}
		else {
			throw new AccesException("identifiant incorrect");
		}
	}
	
 
}
