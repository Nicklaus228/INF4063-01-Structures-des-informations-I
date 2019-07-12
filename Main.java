import java.text.NumberFormat;
import java.util.List;

public class Main {

	public Main() {
		Combinaison cmb = new Combinaison(1800); // 400 dkg = 400 dag = 4
		/*
		 * // kg 2 3 1 2 5 8 10 13 18 4 3 3 10 7 13 8 17 10 20
		 */
		// making the list of items that you want to bring
		cmb.add("1", 9, 150);
		cmb.add("2", 13, 35);
		cmb.add("3", 153, 200);
		cmb.add("4", 50, 160);
		cmb.add("5", 15, 60);
		cmb.add("6", 68, 45);
		cmb.add("7", 27, 60);
		cmb.add("8", 39, 40);
		cmb.add("9", 23, 30);
		cmb.add("10", 52, 10);
		cmb.add("11", 11, 70);
		cmb.add("12", 32, 30);
		cmb.add("13", 24, 15);
		cmb.add("14", 48, 10);
		cmb.add("15", 73, 40);
		cmb.add("16", 42, 70);
		cmb.add("17", 43, 75);

		// calculate the solution:
		List<Item> itemList = cmb.calcSolution();

		// write out the solution in the standard output
		if (cmb.isCalculated()) {
			NumberFormat nf = NumberFormat.getInstance();

			System.out.println("Poids recherché           = "
					+ nf.format(cmb.getMaxWeight() / 100.0) + " kg");
			System.out.println("Poids solutionnaire = "
					+ nf.format(cmb.getSolutionWeight() / 100.0) + " kg");
			System.out
					.println("Valeur total              = " + cmb.getProfit());
			System.out.println();
			System.out.println("Voici la configuration a suivre :");
			for (Item item : itemList) {
				if (item.getInKnapsack() == 1) {
					System.out.format("%1$-23s %2$-3s %3$-5s %4$-15s \n",
							item.getName(), item.getWeight(), "dag  ",
							"(value = " + item.getValue() + ")");
				}
			}
		} else {
			System.out.println("Problème non résolu. "
					+ "Erreur de donné peut-être.");
		}

	}

	public static void main(String[] args) {
		new Main();
	}

} // class