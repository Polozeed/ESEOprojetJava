package fr.eseo.poo.projet.artiste.modele;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoordonneesTest {

    private double erreur = .000001;


    @Test
    public void testConstructeur0 () {
        Coordonnees test = new Coordonnees();
        assertEquals(test.getX(), 0);
        assertEquals(test.getY(),0);
    }

    @Test
    public void testConstructeur1 () {
        Coordonnees test = new Coordonnees(2,2);
        assertEquals(test.getX(), 2);
        assertEquals(test.getY(),2);
    }
    @Test
    public void testDeplacerVers() {
        Coordonnees test = new Coordonnees(1, 1);
        test.deplaceVers(2,2);
        assertEquals(test.getX(),2);
        assertEquals(test.getY(),2);
    }

    @Test
    public void testDeplacerDe() {
        Coordonnees test = new Coordonnees(1, 1);
        test.deplaceDe(2,3);
        assertEquals(test.getX(),3);
        assertEquals(test.getY(),4);
    }

    @Test
    public void testDistanceVers() {
        Coordonnees test = new Coordonnees(1, 1);
        Coordonnees testDistance = new Coordonnees(3, 4);
        double[] tabSortie = {2,3};
        assertArrayEquals(test.distanceVers(testDistance),tabSortie);
    }

    @Test
    public void testAngleVers() {
        Coordonnees test = new Coordonnees(0, 0);
        Coordonnees testDistance = new Coordonnees(5, 5);
        assertEquals(test.angleVers(testDistance),0.7853981633974483);
    }
}
