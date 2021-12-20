package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.service.MergeSortImplementation;
import com.greatlearning.service.NotesCount;

public class Main {

	public static void main(String[] args) {

		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		NotesCount notesCount = new NotesCount();
//		QuickSortImplementation quickSortImplementation = new QuickSortImplementation();

		System.out.println("Enter the size of currency denominations ");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] notes = new int[size];
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			notes[i] = input.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount = input.nextInt();
		mergeSortImplementation.sort(notes, 0, notes.length - 1);
		// quickSortImplementation.quickSort(notes,0,notes.length-1);

		/*
		 * for (int i = 0; i < size; i++) { System.out.println(notes[i]); }
		 */

		notesCount.notesCountImplementation(notes, amount);
	}

}
