package fr.eseo.poo.projet.artiste.modele;

public class Ligne {

    private double Epsilon = .0000001;
    private final double LARGUEUR_PAR_DEFAUT = 0;
    private final double HAUTEUR_PAR_DEFAUT = 0;

    private Coordonnees position;
    private double largueur;
    private double hauteur;

    public Ligne(){
        this.position = new Coordonnees();
        this.hauteur = HAUTEUR_PAR_DEFAUT;
        this.largueur = LARGUEUR_PAR_DEFAUT;
    }

    public Ligne( double hauteur, double largueur) {
        this.largueur = largueur;
        this.hauteur = hauteur;
    }

    public Ligne( double hauteur, double largueur, Coordonnees coordonnees) {
        this.largueur = largueur;
        this.hauteur = hauteur;
        this.position = coordonnees;
    }

    public Coordonnees getC1(){
        return this.position;
    }

    public Coordonnees getC2() {
        double x =this.position.getX() + this.largueur;
        double y = this.position.getY() + this.hauteur;
        return new Coordonnees(x,y);
    }

    public void setC1(Coordonnees coordonnees) {
        double xC2 = this.getC2().getX();
        double yC2 = this.getC2().getY();
        this.position = coordonnees;
        this.setHauteur(yC2 - this.position.getY());
        this.setLargueur(xC2 - this.position.getX());
    }

    public void  setC2(Coordonnees coordonnees) {
        double xC2 = this.getC2().getX();
        double yC2 = this.getC2().getY();
        this.position = coordonnees;
        this.setHauteur(yC2 - this.position.getY());
        this.setLargueur(xC2 - this.position.getX());
    }

    public Coordonnees getPosition() {
        return position;
    }

    public void setPosition(Coordonnees position) {
        this.position = position;
    }

    public double getLargueur() {
        return largueur;
    }

    public void setLargueur(double largueur) {
        this.largueur = largueur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }
}
