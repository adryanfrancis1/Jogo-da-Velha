package aplicação;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// System.out.println();
		// System.out.println();

		for (int i = 0; i <= 8; i++) {

			if (i != 2 && i != 5) {
				System.out.println(" 	| 	   |");
			} else {
				System.out.println("_ _ _ _ |_ _ _ _ _ |_ _ _ _ ");
				//System.out.println();
			}

		}

	}
}
