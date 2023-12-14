/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.Controller;


import java.io.IOException;
import oracle.jdbc.driver.resource.DriverResources;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author nga
 */
public class connection {

	public static Connection getConnection () {
		Connection c = null;
		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			String jdbcUrl = "jdbc:oracle:thin:@//localhost:1521/xe";

			String user = "c##qltv";
			String password = "010895";
                      
			c =  DriverManager.getConnection(jdbcUrl, user, password);
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
                        
		}
		return c;
	}
       
	public static void closeConnection (Connection c) throws  SQLException {
		
            if (c!=null) {
                c.close();
            } // TODO Auto-generated catch block
		
	}
	
}

