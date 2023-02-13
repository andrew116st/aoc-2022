package DAY_1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Energy1a2 {
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

		// System.out.println(list.get(13));
		// System.out.println();

		System.out.println("List size - " + list.size());
		System.out.println();

		String element1 = "";

		boolean containsElement = list.contains("");
		// System.out.println(containsElement);
		// System.out.println();

		int sum = 0;

		TreeSet<Integer> sumTemp = new TreeSet<Integer>();

		for (String numbers : list) {

			if (numbers.equals("")) {

				sumTemp.add(sum);

				sum = 0;

			} else {
				sum = sum + Integer.parseInt(numbers);

			}
			
		}

		System.out.println("smallest element - " + sumTemp.first()); 			// get the first - smallest element
		System.out.println("largest element - " + sumTemp.last()); 				// get the last - largest element

		NavigableSet<Integer> navSet = sumTemp.descendingSet();
		System.out.println(navSet);
		System.out.println();
		System.out.println(
				"Sum - Elves carrying in total: " + (sumTemp.pollLast() + sumTemp.pollLast() + sumTemp.pollLast()));
				// pollLast() Retrieves and removes the last (highest) element, or returns null
				// if this set is empty.

	}

}
