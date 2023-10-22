package tp4heritage;

public class Vendeur extends salarie {
	private double Vente;
	private double Pourcentage;
	
	Vendeur(int Matricule,String Nom ,double Recrutement,double Vente,double Pourcentage){
		super(Matricule,Nom,Recrutement);
		this.Vente=Vente;
		this.Pourcentage=Pourcentage;
	}

	public double getVente() {
		return Vente;
	}

	public void setVente(double vente) {
		Vente = vente;
	}

	public double getPourcentage() {
		return Pourcentage;
	}

	public void setPourcentage(double pourcentage) {
		Pourcentage = pourcentage;
	}
	
	@Override public String toString() {
		return (super.toString()+"  le vendeur a comme Vente: "+ Vente +"et comme Pourcentage : "+Pourcentage);
	}
	
	@Override public void Affiche(){
		//super.Affiche();
		System.out.println(this);
		//System.out.println("Vendeur : "+this.getClass().getSimpleName());
	}
	@Override public double Salaire() {
		double salaire =0;
		salaire= super.Salaire()+(Vente* Pourcentage);
		return salaire;
		
	}
	

}
