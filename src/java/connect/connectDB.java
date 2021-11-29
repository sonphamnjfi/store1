/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sonph
 */
public class connectDB {
    	
	private final static String hostName = "localhost";
	private final static String dbName = "stores";
	private final static String userName = "root";
	private final static String password = "San479420";
	
	public static Connection getMySQLConnection() throws SQLException, ClassNotFoundException {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
		 Connection conn = DriverManager.getConnection(connectionURL, userName, password);
		 return conn;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println(new connectDB().getMySQLConnection());
	}  
}
