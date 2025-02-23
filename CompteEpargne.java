
public class CompteEpargne <T> extends Compte{
	private final double taux;

	public CompteEpargne(Object devise, int numeroCompte, double solde, double taux) {
		super(devise, numeroCompte, solde);
		this.taux = taux;
	}
	public double calculerInteret() {
		super.setSolde(super.getSolde()+super.getSolde()* taux);
		return (super.getSolde());
		
	}
	public void afficherSolde() {
		System.out.println("Compte Epargne - Solde:"+calculerInteret()+super.getDevise());
	} 
}
