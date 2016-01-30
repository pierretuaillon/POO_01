package fr.unice.l3.formes;

import java.awt.Graphics;

public class Ellipse extends AFormeGeometrique {
	public Ellipse(Point centre, int largeur, int hauteur) {
		super(centre, largeur, hauteur);
	}
	
	@Override
	double surface() {
		return Math.PI*getLargeur()*getHauteur()/4;
	}

	@Override
	double perimetre() {
		return Math.PI*(getLargeur() + getHauteur())/2;
	}

	@Override
	public void dessineToi(Graphics g) {
		super.dessineToi(g);
		getCentre().dessineToi(g);
		Point coin = getCoinSuperieurGauche() ;
		g.drawOval(coin.getX(), coin.getY(), getLargeur(), getHauteur());
	}

	Point getCentre() {
		return super.getAncrage();
	}
	
	@Override
	public String toString() {
		return "Ellipse"+super.toString();
	}
}
