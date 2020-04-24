package tabuleiro;

import menu.Jogador;

public class Tabuleiro {

	
	
	
	public void mostrarTabuleiro() {
		
		for (int i = 0; i <= 8; i++) {

			if (i != 2 && i != 5) {
				System.out.println(" 	| 	   |");
			} else {
				System.out.println("_ _ _ _ |_ _ _ _ _ |_ _ _ _ ");
				// System.out.println();
			}

		}
	}
}
