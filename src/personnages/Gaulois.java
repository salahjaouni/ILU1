package personnages;

public class Gaulois {
	private static String nom;
	private static int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de "
				+ romain.getNom());
		romain.recevoirCoup(force / 3);
	}
	private static void asterix(String nom, int force) {
		char[] asterix = null;{
		asterix (nom = "Ast�rix", force = 8);
		System.out.println(asterix);

		
	}
	}
}
