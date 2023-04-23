package com.student.manage;

import java.sql.Connection;

public class cp {

	static Connection con;

	public static Connection createC() {
		try {
			// load the driver
			Class.forName("com.mysql.jdbc.Driver");

			// create the connection....
			String user = "root";
			String password = "Guptag285001@ankit";
			String url = "jdbc:mysql://localhost:3306/student_system";
		} catch (Exception e) {
			e.printStackTrace();

		}
		return con;
	}
}
