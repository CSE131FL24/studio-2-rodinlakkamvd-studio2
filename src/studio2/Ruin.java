package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter start amount: ");
		double startAmount = in.nextDouble();

		System.out.println("Enter win chance 0-1: ");
		double winChance = in.nextDouble();

		System.out.println("Enter win limit: ");
		double winLimit = in.nextDouble();

		double currentMoney = startAmount;

		boolean success = true;

		// need if statement with boolean for success

		int totalSimulation = 1;
		while (totalSimulation <= winLimit || (currentMoney > 0)) {
			System.out.println("Simulation " + totalSimulation + ": Money Left: "+ currentMoney);
			totalSimulation++;
			double result = Math.random();
			System.out.println(result);
			if (result > winChance) {
				success = false;
				System.out.println("LOSE");
				currentMoney = currentMoney - 1;
				System.out.println("");
			}
			else 
				success = true;
				System.out.println("WIN");
				currentMoney++;
				System.out.println("");

		}

	}

}

