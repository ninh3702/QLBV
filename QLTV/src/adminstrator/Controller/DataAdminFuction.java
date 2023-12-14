/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adminstrator.Controller;

import adminstrator.model.Employee;
import book.Controller.DataFuctionImplement;
import book.Controller.connection;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static oracle.sql.NUMBER.e;

/**
 *
 * @author DELL
 */
public class DataAdminFuction {

    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    Connection data;
    public void readListAdmin(ArrayList<Employee> listE) {
        data =   connection.getConnection();
        try {
            var sql = "SELECT * FROM employee";
            var per = data.prepareStatement(sql);
            ResultSet rs = per.executeQuery();
            while (rs.next()) {
                var tk = rs.getString(1);
                var passwd = rs.getString(2);
                var name = rs.getString(3);
                var gender = rs.getString(4);
                var date = rs.getString(5);
                var address = rs.getString(6);
                var phone = rs.getString(7);
                Employee e = new Employee(tk, passwd, name, df.parse(date), address, phone, gender);
                listE.add(e);

            }
        }  catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 

    }

    public int updateAdmin(Employee emp) {
        data =   connection.getConnection();
        try  {
            var sql = "UPDATE employee SET passwd = ? WHERE tk = ?";
            var ps = data.prepareStatement(sql);
            ps.setString(1, emp.getPassword());
            ps.setString(2, emp.getNameTK());
            return ps.executeUpdate();

        }  catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return -1;

    }

}
