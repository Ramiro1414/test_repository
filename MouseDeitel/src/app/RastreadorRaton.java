package app;

import javax.swing.JFrame;
import frame.MarcoRastreadorRaton;

public class RastreadorRaton {

	public static void main(String args[]) {
		MarcoRastreadorRaton marcoRastreadorRaton = new MarcoRastreadorRaton();
		marcoRastreadorRaton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marcoRastreadorRaton.setSize(300, 100); // establece el tamaño del marco
		marcoRastreadorRaton.setVisible(true); // muestra el marco
	} // fin de main
} // fin de la clase RastreadorRaton
