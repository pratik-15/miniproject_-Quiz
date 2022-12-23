package com.quiz.connection;

import java.sql.DriverManager;
import java.sql.Connection;

public class CreateConnection {
	Connection con = null;

	public Connection getConnect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "Amu03@96");

		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

} 
