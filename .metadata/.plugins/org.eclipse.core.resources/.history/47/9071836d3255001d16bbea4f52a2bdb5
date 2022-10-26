package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois;
	private int nbVillageoisMaximum;
	public Village(String nom) {
		this.nom = nom;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	
	public Village(int nbVillageoisMaximum, String nom) {	
	this.nom=nom;
	this.villageois=new Gaulois [nbVillageoisMaximum];

	}

	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
		nbVillageois=nbVillageois+1;		
	}
	public Gaulois trouverHabitant(int i) {
		return null;
		
	}
	public static void main(String[] args ) {
		Village village= new Village("Village des Irréductibles");
//		Gaulois gaulois = village.trouverHabitant(30);
	}

}
