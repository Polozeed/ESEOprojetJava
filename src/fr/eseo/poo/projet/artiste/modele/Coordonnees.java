package fr.eseo.poo.projet.artiste.modele;

public class Coordonnees {

	public static final double ABSCISSE_PAR_DEFAUT = 0;
	public static final double ORDONNEE_PAR_DEFAUT = 0;
	private double x;
	private double y;

	public Coordonnees(){
		this.y = ABSCISSE_PAR_DEFAUT;
		this.x = ORDONNEE_PAR_DEFAUT;
	}

	public Coordonnees(double x, double y){
		this.y = y;
		this.x = x;
	}

	double getY() {
		return this.y;
	}
	
	void setY(Double y) {
		this.y = y;
	}

	double getX() {
		return this.x;
	}
	
	void setX(Double x) {
		this.x = x;
	}

	 void deplaceVers(double xNouveau, double yNouveau){
		this.x = xNouveau;
		this.y = yNouveau;
		System.out.println("Fct deplaceVers");
	}
	
	 void deplaceDe(double deltaX, double deltaY){
		this.x += deltaX;
		this.y += deltaY ;
		System.out.println("Fct deplaceDe");
	}

	public double[] distanceVers(Coordonnees cord){
		double distanceX = cord.x - this.x; 
		double distanceY = cord.y - this.y;
		double[] distance = { distanceX , distanceY};
		System.out.println("distanceX : " + distanceX + ", distanceY : " + distanceY);
		return distance;
	}

	public double angleVers(Coordonnees coord){
		double[] resDistance = this.distanceVers(coord);
		double resX = resDistance[0];
		double resY = resDistance[1];
		double opp =  (Math.abs(Math.atan(resY / resX)));
		System.out.println("angle vers :" + opp + " en radian");
		return opp;
	}

	public  String aff() { 
    	return "X :" + this.x + ", Y :" + this.y;
}


}

