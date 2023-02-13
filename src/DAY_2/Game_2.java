package DAY_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game_2 {
	public static final int ROCK = 1;
	public static final int PAPER = 2;
	public static final int SCISSORS = 3;
	public static final int LOSS = 0;
	public static final int DRAW = 3;
	public static final int WIN = 6;

	public static void main(String args[]) throws IOException {

		File file = new File("hand_game");

		List<String> hh = parseFileToStringList(file);

		System.out.println(hh);

		hh.get(0);
		System.out.println(hh.get(0));
		System.out.println();

		hh.size();
		System.out.println("List size - " + hh.size());

		int sum = 0;

		for (int i = 0; i < hh.size(); i++) {
			String[] letters = hh.get(i).split(" ");

			String player1 = letters[0];
			String player2 = letters[1];

			switch (player1) {
			case "A":
				if (player2.equals("X")) { 				// X - rock
					sum += SCISSORS + LOSS; 			// 3+0

				} else if (player2.equals("Y")) {
					sum += ROCK + DRAW; 				// 1+3

				} else if (player2.equals("Z")) {
					sum += PAPER + WIN; 				// 2+6
				}
				break;

			case "B":
				if (player2.equals("X")) { 				// Y - paper
					sum += ROCK + LOSS; 				// 1+0

				} else if (player2.equals("Y")) {
					sum += PAPER + DRAW; 				// 2+3

				} else if (player2.equals("Z")) {
					sum += SCISSORS + WIN; 				// 3+6

				}
				break;

			case "C": // Z - scissors
				if (player2.equals("X")) {
					sum += PAPER + LOSS; // 2+0

				} else if (player2.equals("Y")) {
					sum += SCISSORS + DRAW; // 3+1

				} else if (player2.equals("Z")) {
					sum += ROCK + WIN; // 1+6

				}
				break;

			}

		}

		System.out.println("Final amount - " + sum);
	}

	public static List<String> parseFileToStringList(File file) throws IOException {

		List<String> ageNames = new ArrayList<String>();

		Scanner sc;

		try {
			sc = new Scanner(file);

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");

			throw new IOException();
		}

		while (sc.hasNextLine()) {

			String line = sc.nextLine();

			String[] numbers = line.split(" ");

			ageNames.add(line);
		}
		sc.close();

		return ageNames;

	}

}	
