package tp4heritage;

public class salarie {
	protected int Matricule ;
	protected String Nom;
	protected double Recrutement ; 
	
	salarie(int matricule , String nom , double recrutement){
		this.Matricule=matricule;
		this.Nom=nom;
		this.Recrutement=recrutement;
	}
	
	int getMatricule() {
		return Matricule;
	}
	String getNom() {
		return Nom ;
	}
	Double getRecrutement() {
		return Recrutement;
	}
	void setMatricule(int matricule) {
		this.Matricule=matricule;
	}
	void setNom (String nom) {
		this.Nom=nom;
	}
	void setRecrutement(double recrutement) {
		this.Recrutement=recrutement;
	}
	
	@Override public String toString() {
		return ("le salarie : '"+Nom+"' identifie par la matricule : "+Matricule+" et l'annee de son recrutement : "+Recrutement);
	}
	
	
	public void Affiche() {
		System.out.println(this);
	}
	
	public double Salaire() {
		double salaire =0;
		if(Recrutement<2005) {
			salaire = 400 ;
		}
		else 
		{
			salaire = 280;
		}
		return salaire;
	}
}
