package Game;

import java.util.*;


public class Guesser_Game {

	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
	}

}


class Guesser {
	int guessNum;

	int guessNum() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Guesser Kindly guess the number : ");
		guessNum = scan.nextInt();
		return guessNum;
	}
}

class Player {
	int guessNum;

	int guessNum() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Player Kindly guess the number : ");
		guessNum = scan.nextInt();
		return guessNum;
	}
}

class Umpire {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;

	void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
	}

	void collectNumFromPlayer() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numFromPlayer1 = p1.guessNum();
		numFromPlayer2 = p2.guessNum();
		numFromPlayer3 = p3.guessNum();
	}

	void compare() {
		if (numFromGuesser == numFromPlayer1) {
			if ((numFromGuesser == numFromPlayer2) && (numFromGuesser == numFromPlayer2)) {
				System.out.println("All players won the game.");
			} else if (numFromGuesser == numFromPlayer2) {
				System.out.println("Player1 & Player2 won the game.");
			} else if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player1 & Player3 won the game.");
			} else {
				System.out.println("Player1 won the game.");
			}
		} else if (numFromGuesser == numFromPlayer2) {
			if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player2 & Player3 won the game.");
			} else {
				System.out.println("Player2 won the game.");
			}
		} else if (numFromGuesser == numFromPlayer3) {
			System.out.println("Player3 won the game.");
		} else {
			System.out.println("Game lost try again!");
		}

	}
}
