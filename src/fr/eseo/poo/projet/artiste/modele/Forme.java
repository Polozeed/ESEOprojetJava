
package fr.eseo.poo.projet.artiste.modele;

public abstract class Forme {

		public static final int LARGEUR_PAR_DEFAUT = 100;
		public static final int HAUTEUR_PAR_DEFAUT = 100;

		private int largeur;
		private int hauteur;
		private Coordonnees coordonnee;

		public Forme(Coordonnees coordonnees, int largeur, int hauteur) {
			setHauteur(hauteur);
			setLargeur(largeur);
			setCoordonnees(coordonnees);
		}

		public Forme() {
			this(new Coordonnees(), LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
		}

		public Forme(int x, int y, int largeur, int hauteur) {
			this(new Coordonnees(x, y), largeur, hauteur);
		}

		public Forme(int largeur, int hauteur) {
			this(new Coordonnees(), largeur, hauteur);
		}

		public Forme(Coordonnees coordonnees) {
			this(coordonnees, LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
		}

		public Coordonnees getCoordonnee() {
			return coordonnee;
		}

		public void setCoordonnees(Coordonnees coordonnees) {
			this.coordonnee = coordonnees;
		}

		public int getHauteur() {
			return hauteur;
		}

		public void setHauteur(int hauteur) {
			this.hauteur = hauteur;
		}

		public int getLargeur() {
			return largeur;
		}

		public void setLargeur(int largeur) {
			this.largeur = largeur;
		}

		public double getX() {
			return this.getCoordonnee().getX();
		}

		public void setX(double x) {
			coordonnee.setX(x);
		}

		public double getY() {
			return this.getCoordonnee().getY();
		}

		public void setY(double y) {
			coordonnee.setY(y);
		}

		public void deplacerVers(int x, int y) {
			coordonnee.deplaceVers(x, y);
		}

		public void deplacerDe(int deltaX, int deltaY) {
			coordonnee.deplaceDe(deltaX, deltaY);
		}

		public abstract double aire();

		public abstract double perimetre();

		@Override
		public String toString() {
			return "[" + this.getClass().getSimpleName() + "] pos : " + coordonnee + " dim : " +
					this.getLargeur() + " x " + this.getHauteur() + "\npérimètre : " + this.perimetre() + " aire : " +
					this.aire();
		}
}

