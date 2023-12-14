/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.controller;

import book.Controller.DataFuctionImplement;
import book.Controller.connection;
import java.sql.*;
import java.util.ArrayList;
import student.model.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class DataStudentFuctionImp implements DataStudentFunction {
    
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    Connection data;
    @Override
    public void readStudentSQL(ArrayList<Student> listst) {
        data =   connection.getConnection();
        try  {
            var sql = "SELECT * FROM student";
            var ps = data.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                var studentId = rs.getString(1);
                var nameS = rs.getString(2);
                var gender = rs.getString(3);
                var birthdayS = rs.getString(4);
                var classRoom = rs.getString(5);
                var address = rs.getString(6);
                var major = rs.getString(7);
                var phone = rs.getString(8);
                var mail = rs.getString(9);
                var password = rs.getString(10);
                
                Student st = new Student(studentId, classRoom, major, mail,
                       nameS, df.parse(birthdayS),
                        address, phone, gender,password);
                listst.add(st);
            }
        }  catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
    }
     @Override
    public int insertStudent(Student s) {
        data = (Connection) connection.getConnection();
       
        try  {
            var sql = "INSERT INTO Student VALUES(?,?,?,?,?,?,?,?,?,?)";
            var ps = data.prepareStatement(sql);
            ps.setString(1, s.getStudentId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getGender());
            java.sql.Date sqlDate = new java.sql.Date(s.getDob().getTime());
            ps.setDate(4, sqlDate);
            ps.setString(5, s.getClassRoon());
            ps.setString(6, s.getAddress());
            ps.setString(7, s.getMajor());            
            ps.setString(8, s.getPhone());
            ps.setString(9, s.getEmail());
            ps.setString(10,s.getPassword());
            return ps.executeUpdate();

        }  catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
        return -1;
    } 
    
    @Override  
    public int updateStudent(Student s) {
        data = (Connection) connection.getConnection();
        
         try {
        var sql = "UPDATE Student SET nameS = ?, gender = ?,"
                + " birthdayS = ?, class = ?, address = ?, marjor = ?,"
                + " phone = ?, mail = ?, passwd = ? WHERE studentId = ?";
        
        var ps = data.prepareStatement(sql);
        ps.setString(1, s.getName());
        ps.setString(2, s.getGender());

        // Convert java.util.Date to java.sql.Date
        java.sql.Date sqlDate = new java.sql.Date(s.getDob().getTime());
        ps.setDate(3, sqlDate);

        ps.setString(4, s.getClassRoon());
        ps.setString(5, s.getAddress());
        ps.setString(6, s.getMajor());
        ps.setString(7, s.getPhone());
        ps.setString(8, s.getEmail());
        ps.setString(9, s.getPassword());
        ps.setString(10, s.getStudentId());
        
        return ps.executeUpdate();


        }  catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
        return -1;
    }
    @Override
    public int delStudent(Student s) {
        data = (Connection) connection.getConnection();
        
        try {
            var sql = "DELETE FROM student WHERE studentId = ?";
            var ps = data.prepareStatement(sql);
            ps.setString(1, s.getStudentId());
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
        return -1;
    }
    @Override
    public ArrayList<Student> searchByName (ArrayList<Student> listStudent,
            String nameStudent) {
        ArrayList<Student> listSearch = new ArrayList<>();
         for (var e : listStudent) {
            
            if(e.getName().equalsIgnoreCase(nameStudent)) {
                listSearch.add(e);
            } 
        }
         return listSearch;
    }
    @Override
    public ArrayList<Student> searchByClass (ArrayList<Student> listStudent,
            String clss) {
        ArrayList<Student> listSearch = new ArrayList<>();
         for (var e : listStudent) {
            if(e.getClassRoon().equalsIgnoreCase(clss)) {
                listSearch.add(e);
            } 
        }
         return listSearch;
    }
    @Override
    public Student searchStudentById(ArrayList<Student> listStudent, 
            String studentId) {
        for (var e : listStudent) {
            if (e.getStudentId().equalsIgnoreCase(studentId)) {
                return e;
            }
        }
        return null;
    }

   
    
}
