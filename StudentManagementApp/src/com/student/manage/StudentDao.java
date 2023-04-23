package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDao {
// sttic kardete hai to method bnane ki jarurat nahi padti
	public static boolean insertStudentToDB(student st) {
		boolean f = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/student_system";
			String username = "root";
			String password = "Guptag285001@ankit";
			Connection con = DriverManager.getConnection(url, username, password);
			String query = "insert into students(sname, sphone, scity) values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			pstmt.executeUpdate();
			f = true;
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
}
