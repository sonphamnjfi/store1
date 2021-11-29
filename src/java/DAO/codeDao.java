/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import connect.connectDB;
import entity.code;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sonph
 */
public class codeDao {
    Connection conn = null; // connectDB
    PreparedStatement ps = null; // send to db
    ResultSet rs = null; // receive from db

    // read list code
    public List<code> getall() {
            List<code> list = new ArrayList<>();
            String query = "SELECT * FROM code";
            try {
                    conn = new connectDB().getMySQLConnection();
                    ps = conn.prepareStatement(query);
                    rs = ps.executeQuery();
                    while (rs.next()) {
                            list.add(new code(rs.getString(1), 
                                                              rs.getString(2), 
                                                              rs.getLong(3), 
                                                              rs.getLong(4), 
                                                              rs.getDate(5), 
                                                              rs.getDate(6)));
                    }
            }catch (Exception e) {

            }
            return list;
    }

    public code getcode() {
            String query = "SELECT * from code order by idCode desc limit 1";
            try {
                    conn = new connectDB().getMySQLConnection();
                    ps = conn.prepareStatement(query);
                    rs = ps.executeQuery();
                    while(rs.next()) {
                            return new code(rs.getString(1), 
                                              rs.getString(2), 
                                              rs.getLong(3), 
                                              rs.getLong(4), 
                                              rs.getDate(5), 
                                              rs.getDate(6));
                    }
            }catch (Exception e) {

            }
            return null;	
    }
    public static void main(String[] args) {
            codeDao cd = new codeDao();
//		Code code = cd.getcode();
            List<code> list = cd.getall();
            for(code code1 : list) {
                    System.out.println(code1);
            }
    }	
}
