package personnages;

public class Gaulois {
	private static String nom;
	private static int force;
	private int effetPotion = 1;
	private int force, nb_trophees;
	private Equipement trophees[] = new Equipement[100];
	
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
//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
	}
	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
	}

//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la m�choire de "
//				+ romain.getNom());
//		romain.recevoirCoup(force / 3);
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la
		m�choire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) *
		effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,
		nb_trophees++) {
		this.trophees[nb_trophees] = trophees[i];
		}
		return;
		}

	private static void asterix(String nom, int force) {
		char[] asterix = null;{
		asterix (nom = "Ast�rix", force = 8);
		System.out.println(asterix);

		
	}
	}
}
