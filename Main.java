//University of Arizona Global Campus
//Kyle Younce
//CPT307 Data Structures & Algorithms
//Dr. Joshua Reichard
// 8/23/2021

import java.util.LinkedList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//User inputs and Defining Linked List
		LinkedList<equipment> equipments = new LinkedList<>();
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter Replacement IT Equipment" +  (i + 1));
			System.out.println("Enter Brand Name: ");
			String brandName = scanner.nextLine();
			System.out.println("Enter Gain: ");
			double gain = scanner.nextDouble();
			System.out.println("Enter Cost: ");
			double cost = scanner.nextDouble();
			scanner.nextLine();
			// Tying the User inputs of brand name, gain, and cost to individual "node" in linked list. I.E. Equipment 1...
			equipment equipment = new equipment(brandName, gain, cost);
			equipments.add(equipment);
		}

		equipments.sort((a,b) -> Double.compare(b.getROI(), a.getROI()));
		
		System.out.println("Best Return on Invest to Worst");
		for (equipment equipment : equipments) {
			System.out.println(equipment);
		}
		
		scanner.close();
		
		System.out.println("Processing completed");
	}

}
