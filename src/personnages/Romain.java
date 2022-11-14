package personnages;

public class Romain {
	private String nom;
	private String texte;
	private int force;
	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "´ " + texte + "ª");
	
	}
	private String prendreParole() {
		return "Le romain " + nom + " : " ;
	}
	
//	public void recevoirCoup(int forceCoup) {
//		force -= forceCoup;
//		if (force > 0) {
//			parler("AÔe");
//		} else {
//			parler("J'abandonne...");
//	}
	public Equipement[] recevoirCoup(int forceCoup){
		Equipement[] equipementEjecte = null; 
		assert force > 0; 
		int oldForce = force; 
		
		force Coup= CalculResistanceEquipement(forceCoup);
		
		force -= forceCoup; 
//		if (force >0){
//			parler("Aïe");}
//		else{
//			equipementEjecte = ejecterEquipement(): 
//			parler("J'abandonne..."):}
		switch(force){
		case 0: 
			parler("Aïe");
		default:
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
			break;
			}
		// post condition la force a diminuée
		assert force < oldForce;
		return equipementEjecte; 
		}
	private int CalculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0; 
		if(!(nbEquipement ==0)){
			texte+="\nmais heureusement, grace à mon 			équipement sa force est diminué de "; 
			for(int i=0; i < nbEquipement;){
				if((equipement[I]!=null && equipements[I].equals(Equipement.BOUCLIER))==true){
					resistanceEquipement+=8;}
			else{
				System.out.println("Equipement casque");
				resistanceEquipement+=5;}
			I++;}
			texte=+resistanceEquipement + "!"; }
		parler(texte); 
		forceCoup-=resistanceEquipement; 
		return forceCoup; }
	
	private Equipement[] ejecterEquipement(){
		Equipement[] equipementEjecte = new Equipement[nbEquipement]; 
		System.out.println("L'équipement de " + nom.toString() + " s'envole sous la force du coup.");
		//TODO
		int nbEquipementEjecte = 0; 
		for (int i=0; I < nbEquipement; I++){
			if(equipement[I]==null){
				continue;}
			else{
				equipementEjecte[nbEquipementEjecte]equipements[I]; 
				nbEquipementEjecte++;
				equipements[i] = null;}
			}
		return equipementEjecte;
	}
	
				
	
}
		

