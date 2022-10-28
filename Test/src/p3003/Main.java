package p3003;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int King = 1;
		int Queen = 1;
		int Rook = 2;
		int Bishop = 2;
		int Knight = 2;
		int Pawn = 8;

		King = King - scanner.nextInt();
		Queen = Queen - scanner.nextInt();
		Rook = Rook - scanner.nextInt();
		Bishop = Bishop - scanner.nextInt();
		Knight = Knight - scanner.nextInt();
		Pawn = Pawn - scanner.nextInt();

		System.out.print(King + " ");
		System.out.print(Queen + " ");
		System.out.print(Rook + " ");
		System.out.print(Bishop + " ");
		System.out.print(Knight + " ");
		System.out.print(Pawn + " ");
	}
}
