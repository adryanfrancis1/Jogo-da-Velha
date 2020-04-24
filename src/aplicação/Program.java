package aplicação;

import java.awt.Menu;
import java.util.Scanner;

import tabuleiro.Tabuleiro;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Tabuleiro tab = new Tabuleiro();
		Menu men = new Menu();

		char jogador1;
		char jogador2;
		char bola = 'O';
		char xis = 'X';

		System.out.println("Com qual forma o jogador 1 quer jogar?");
		System.out.println("X - DIGITE 1" + "\nO - DIGITE 2");
		jogador1 = sc.next().charAt(0);

		if (jogador1 == 1) {
			jogador1 = bola;
			jogador2 = xis;
		} else {
			jogador1 = xis;
			jogador2 = bola;
		}

		while (true) {
			tab.mostrarTabuleiro();
			System.out.println("Vez do jogador 1: " );
			System.out.println("1 2 3");
			System.out.println("4 5 6");
			System.out.println("7 8 9");
		}

	}
}
