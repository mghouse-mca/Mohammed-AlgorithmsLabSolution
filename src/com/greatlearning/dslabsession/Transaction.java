package com.greatlearning.dslabsession;

import java.util.Scanner;

public class Transaction {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		// Ask the user to enter the size of the transaction array

		System.out.println("Enter the size of transaction array");

		int size = input.nextInt();

		int transactionArray[] = new int[size];

		// Ask the user to enter the values of the array

		System.out.println("Enter the values of array");

		for (int i = 0; i < size; i++)

			transactionArray[i] = input.nextInt();

		// Ask the user to enter the number of targets that needs to be achieved
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetNo = input.nextInt();

		// Ask the user to enter the value of target

		// Loop over the transaction array that you have created earlier and find out
		// whether the target can be achieved.
		// If the target cannot be achieved then print some message saying that given
		// target cannot be achieved

		while (targetNo != 0) {

			int flag = 0;

			long target;

			System.out.println("Enter the value of target");
			target = input.nextInt();

			long sum = 0;

			for (int i = 0; i < size; i++) { // linear iteration , linear searching

				sum += transactionArray[i];

				if (sum >= target) {

					System.out.println("Target achieved after " + (i + 1) + " transactions ");

					flag = 1;

					break;

				}

			}

			if (flag == 0) {

				System.out.println(" Given target is not achieved ");

			}

		}
	}

}
