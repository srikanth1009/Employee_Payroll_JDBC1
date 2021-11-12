package com.bridgelabz.jdbc.EmployeePayrollJdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Purpose: This class is used for establish connection between java progaram and Database
 * 
 *
 */

public class EmployeeConfig {
	private static Connection connection = null;
	/**
	 * Using static block creating the connection
	 */

    public static Connection getConfig(){
        String URL_JD = "jdbc:mysql://localhost:3306/payroll_services";
        String USER_NAME = "srikanth";
        String PASSWORD = "root";
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers loaded!!");
            connection = DriverManager.getConnection(URL_JD,USER_NAME,PASSWORD);
            System.out.println("connection Established!!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}

