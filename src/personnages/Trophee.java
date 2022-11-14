package personnages;

public class Trophee {
	Gaulois gaulois; 
	Equipement Equipement; 
	String nom; 
	String trophee;
	public Gaulois getGaulois() {
		return gaulois;
	}
	public Trophee(Gaulois gaulois, Equipement equipement) {
		this.gaulois=gaulois; 
		this.equipement=equipement; 
	}
	public void setGaulois(Gaulois gaulois) {
		this.gaulois = gaulois;
	}
	public Equipement getEquipement() {
		return Equipement;
	}
	
	
}
