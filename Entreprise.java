package tp4heritage;

public class Entreprise {

	public static void main(String[] args) {
		
		salarie tabSalarie[]= new salarie[5];
		
		Employe  e1 = new Employe (12345,"Walid",2002,15,4);
		Vendeur  v1 = new Vendeur (23445,"Yassine",2007,1000,0.1);
		Vendeur  v2 = new Vendeur (65478,"Nassime",2000,700,0.1);
		Employe  e2 = new Employe (87698,"Aymen ",2003,19,5);
		Employe  e3 = new Employe(12345,"Khaled",2008,7,4);
		
		tabSalarie[0]= e1; 
		tabSalarie[1]= v1; 
		tabSalarie[2]= v2; 
		tabSalarie[3]= e2; 
		tabSalarie[4]= e3; 
	
		System.out.println("Liste des employes : \n");
		for(int i =0;i<5;i++) {
			if(tabSalarie[i]instanceof Employe ) {
				tabSalarie[i].Affiche();
			}
		}
		System.out.println("\n");
		System.out.println("Liste des Vendeurs : \n");
		for(int i=0;i<5;i++) {
			if(tabSalarie[i]instanceof Vendeur ) {
				tabSalarie[i].Affiche();
			}
		}
		
		System.out.println("\n");
		//plus ancien
		salarie min = tabSalarie[0];
		for(int i =0;i<5;i++) {
			
			if(tabSalarie[i].Recrutement < min.Recrutement ) {
				min= tabSalarie[i];
			}
		}
		System.out.println("le nom du salarie le plus ancien est  "+ min.Nom +"  qui a comme annee de recrutement : "+min.Recrutement);
		System.out.println("\n");
		//grand salaire
		/*
		salarie s = tabSalarie[0];
		for(int i =0;i<5;i++) {
			if(tabSalarie[i].Salaire()> s.Salaire()) {
				s= tabSalarie[i];
			}
		}
		System.out.println("le matricule du vendeur qui a le plus grand salaire "+s.Matricule +"qui a comme salaire = "+s.Salaire());
		
		*/
		//lezem ykoun VENDEUR mouch salarie
		salarie Smax = null;
		for(int i=0;i<tabSalarie.length;i++) {
			if(tabSalarie[i] instanceof Vendeur) {
				if(Smax == null) {
					Smax=tabSalarie[i];
				}
				else 
				{
					if(Smax.Salaire() < tabSalarie[i].Salaire()) {
						Smax=tabSalarie[i];
					}
				}
			}
		}
		System.out.println("le matricule du vendeur qui a le plus grand salaire "+Smax.Matricule +" qui a comme salaire = "+Smax.Salaire());
	}

}
