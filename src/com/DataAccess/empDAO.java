package com.DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class empDAO {
    private final String dburl="jdbc:mysql://localhost:3306/db2";
    private final String user ="root";
    private final String pass ="Root@123";
     public void insert(empDTO,empDTO)
     {
         String insertsql= "insert into db2.emp values(0,?,?,?,?,?,null)";
        try {
            Connection c= DriverManager.getConnection(dburl,user,pass);
            PreparedStatement p= c.prepareStatement(insertsql);
            p.setString(2,empDTO.getname());
            p.setString(3,empDTO.getjob());
            p.setString(4,empDTO.getmgr());
            p.setString(5,empDTO.getsal());
            p.setString(6,empDTO.gethiredate());
            p.setString(7,empDTO.getdeptno());

            p.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
