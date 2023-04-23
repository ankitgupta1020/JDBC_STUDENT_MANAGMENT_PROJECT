package com.student.manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
	public static void main(String[] args) throws IOException {
		System.out.println("welcome to student management App"); // Welcome message
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Input Reader
		while (true) {
			System.out.println("Press 1 to Add student"); // Option 1: Add student
			System.out.println("Press 2 to Delete student"); // Option 2: Delete student
			System.out.println("Press 3 to dispaly student"); // Option 3: Display student
			System.out.println("Press 4 to exit app"); // Option 4: Exit app
			int c = Integer.parseInt(br.readLine()); // User input
			if (c == 1) {
				// add student...
				System.out.println("Enter your name : ");
				String name = br.readLine();

				System.out.println("Enter user phone : ");
				String phone = br.readLine();

				System.out.println("Enter user city: ");
				String city = br.readLine();

				// create student object to store student
				student st = new student(name, phone, city);
				boolean answer = StudentDao.insertStudentToDB(st);
				if (answer) {
					System.out.println("Student is addeded succesfully.....");
				} else {
					System.out.println("somethig went wrong try again....");
				}
				System.out.println(st); // Displaying the added student

			} else if (c == 2) {
				// delete student
			} else if (c == 3) {
				// display student...
			} else if (c == 4) {
				// exit
				break;
			} else {
				// Invalid input
			}

		}
		System.out.println("Thank you for using my application.... "); // Exit message
		System.out.println("see you soon..bye bye...");
	}
}
