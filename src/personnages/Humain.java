package personnages;

public class Humain {
    private String nom ;
    protected String boisson ;
    private int argent ;
    protected int nbConnaissance; 
    public Humain(String nom , String boisson , int argent ){
        this.nom = nom ;
        this.boisson = boisson ;
        this.argent = argent ;
    }
    private String prendreParole() {
        return "Le gaulois " + nom + " : ";
        }

   protected String parler(String texte){
        return prendreParole() + " "+ texte + " ";
    }
    public String getNom( ){
        return nom ;
    }
    /*public String getboisson() {
        return boisson;
    }*/

    public int getArgent(){
        return qargent ;
    }
    
    public void direBonjour (){

        System.out.println( parler("Bonjour ! Je m'appelle ")+getNom()+ " et j'aime boire du " +boisson); ;

    }
    public void boire(){
        System.out.println( parler("Mmmmmm , un bon verre de " )+ boisson +"!GLOUPS ! ");


    }


        /*public void setargent(int argent) {
                this.argent = argent;
        }*/
    protected int gagnerArgent(int sommeGagnee){
        int x=getArgent();
        return argent=x+sommeGagnee;
    }

    protected int perdreArgent(int sommePerdue ){
        int x=getArgent();
        return argent=x-sommePerdue;
    }

    public void acheter(String bien , int prix ){
                if(getArgent()>prix) {
                        System.out.println( parler("j'ai ")+getArgent()+"sous en poche .Je vais m'offrir un "+ bien + " à "+ prix +" sous");
                perdreArgent(prix);
                }
                else if(getArgent()<prix) {
                        System.out.println(parler("je n'ai plus que")+getArgent()+"sous en poche.Je ne peux meme pas m'offrir un "+bien+" à "+prix+" sous");
                }

    }
    public int faireConnaissance(Humain humain) {
		return argent;
    	
    }
    private int memoriser(Humain humain)
    {
		return argent;
    	
    }
    
    private int respondre(Humain humain) {
		return argent;
    	
    }
    
    public int listerConnaissance() {
		return argent;
    	
    }
}
