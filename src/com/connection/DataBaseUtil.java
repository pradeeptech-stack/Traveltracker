package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseUtil {
	  private static final String URL = "jdbc:mysql://localhost:3306/travel";
	    private static final String USERNAME = "root";
	    private static final String PASSWORD = "Pradeep@10";

	    public static Connection getConnection() throws SQLException {
	        return DriverManager.getConnection(URL,USERNAME, PASSWORD);
}
}