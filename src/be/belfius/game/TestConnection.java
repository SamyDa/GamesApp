package be.belfius.game;

import java.sql.*;
import java.util.Scanner;  

public class TestConnection {

	public static void main(String[] args) {
		
		System.out.println("Enter password");
		
		//Scanner scanner = new Scanner(System.in);
		
		//String password  = scanner.nextLine();
		
		String url = "jdbc:mysql://localhost:3306/games";
		url+= "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/games","root","Sa1_Sony_4");
			System.out.println("Test");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  

	}

}
