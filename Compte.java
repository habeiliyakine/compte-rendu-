
public class Compte <T>{
	public void setSolde(double solde) {
		this.solde = solde;
	}

	private T devise;
	private int numeroCompte;
	private double solde;
	public Compte(T devise,int numeroCompte,double solde ) {
		this.devise=devise;
		this.numeroCompte=numeroCompte;
		this.solde=solde;
		
	}

	public void deposer(double montant) {
		this.solde=this.solde+montant;
	}
	public void retirer(double montant) {
		if (this.solde==0) {
			System.out.println("votre solde est insuffisant");
		}
		else {
			this.solde=this.solde-montant;
		}
		
	}
	public void afficherSolde() {
		System.out.println(" votre solde est de :"+this.solde);
	}

	public double getSolde() {
		return solde;
	}

	public T getDevise() {
		return devise;
	}

	public void setDevise(T devise) {
		this.devise = devise;
	}

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	public static <T> void transferer(Compte<T> compte1,Compte<T> compte2,double m) {
		if (compte1.getSolde()==0) {
			System.out.println("le transfert est impossible pas de solde");
		}
		else {
			
		
		compte1.retirer(m);
		compte2.deposer(m);}

		
	}
	
}
