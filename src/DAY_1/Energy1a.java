package DAY_1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Energy1a {
	public static void main(String[] args) throws IOException {

		String path = ".\\src\\DAY_1\\Calories";

		FileInputStream file = new FileInputStream(path);

		List<String> list = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(file))) {
			String line = reader.readLine();

			while (line != null) {
				list.add(line);
				line = reader.readLine();

			}
		}

		System.out.println(list);

		//System.out.println(list.get(13));
		System.out.println();

		System.out.println("List size - " + list.size());
		//System.out.println();

		String element1 = "";

		boolean containsElement = list.contains("");
		//System.out.println(containsElement);
		//System.out.println();

		int i = 0;
		int sum = 0;
		int sumElf = Integer.MIN_VALUE;

		for (String numbers : list) {
			if (numbers.equals("")) {
				if (sum > sumElf) {
					sumElf = sum;
				}
				sum = 0;

			} else {
				sum = sum + Integer.parseInt(numbers);

			}

		}
		System.out.println("Final sumElf - " + sumElf);
	}

}
