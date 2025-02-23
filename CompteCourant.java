
public class CompteCourant <T> extends Compte<T>{
	private final double limitesolde;

	public CompteCourant(T devise, int numeroCompte, double solde, double limitesolde) {
		super(devise, numeroCompte, solde);
		this.limitesolde = limitesolde;
	}
	
	public void retirer(double montant) {
		if ((super.getSolde()-montant)<-limitesolde) {
			System.out.println("votre solde est insuffisant");
		}
		else {
			super.setSolde(super.getSolde()-montant);
		}
		
	}
	public void afficherSolde() {
		System.out.println("Compte Courant - Solde: "+super.getSolde()+super.getDevise());
	}
	
	

}
