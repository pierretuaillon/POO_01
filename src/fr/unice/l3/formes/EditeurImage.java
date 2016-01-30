package fr.unice.l3.formes;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class EditeurImage extends JFrame{
	public static void main (String[] arg) {
		//Defintion de la JFrame et de toutes ces caractéristiques
		JFrame frame = new JFrame();
		//Titre de la fenetre
		frame.setTitle("Editeur images");
		//Modifie la taille de la femetre
		frame.setSize(350, 350);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Definition du JPanel
		JPanel pan = new JPanel(new BorderLayout());
		frame.setContentPane(pan);
		
		//Panel centre
		JPanel panelCentre = new JPanel();
		panelCentre.setBackground(Color.WHITE);
		pan.add(panelCentre, BorderLayout.CENTER);
		
		
		
		//Panel West
		JPanel panelWest = new JPanel();
		panelWest.setBackground(Color.BLUE);
		pan.add(panelWest, BorderLayout.WEST);

		//Rend la fenetre visible
		frame.setVisible(true);
	}
}
