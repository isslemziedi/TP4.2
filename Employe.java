package tp4heritage;

public class Employe extends salarie{
	private double Hsupp;
	private double PHsupp;
	
	Employe(int Matricule,String Nom ,double Recrutement,double Hsupp,double PHsupp){
		super(Matricule,Nom,Recrutement);
		this.Hsupp=Hsupp;
		this.PHsupp=PHsupp;
		
	}

	public double getPHsupp() {
		return PHsupp;
	}

	public void setPHsupp(double pHsupp) {
		PHsupp = pHsupp;
	}

	public double getHsupp() {
		return Hsupp;
	}

	public void setHsupp(double hsupp) {
		Hsupp = hsupp;
	}

	@Override public String toString() {
		return (super.toString()+ " l'employe a comme Hsupp: "+ Hsupp +"et comme PHsupp : "+PHsupp);
	}
	
	@Override public void Affiche(){
		//super.Affiche();
		System.out.println(this);
		//System.out.println("employe : "+this.getClass().getSimpleName());
	}
	
	@Override public double Salaire() {
		double salaire=0;
		salaire=super.Salaire()+PHsupp;
		return salaire;
		
	}
}
