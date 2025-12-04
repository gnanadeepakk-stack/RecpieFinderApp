package com.Services;

import com.DataAccess.empDAO;
import com.DataAccess.empDTO;

import java.util.Scanner;

public class empServicesimpl implements empServices{
    private final Scanner s=new Scanner(System.in);
    @Override
    public void addEmp() {
        System.out.println("Add emp feature");

        System.out.println("Enter emp Id");
        int Id= s.nextInt();
        System.out.println("Enter emp name");
        String name= s.next();
        System.out.println("Enter emp job");
        String job= s.next();
        System.out.println("Enter emp mgr");
        String mgr= s.next();
        System.out.println("Enter emp hiredate");
        String hiredate= s.next();
        System.out.println("Enter emp sal");
        String sal= s.next();
        System.out.println("Enter emp comminution");
        String comm= s.next();
        System.out.println("Enter emp Deptno");
        String deptno= s.next();

        empDTO empdto= new empDTO();
        empdto.setName(name);
        empdto.setJob(job);
        empdto.setMgr(mgr);
        empdto.setHiredate(hiredate);
        empdto.setSal(sal);
        empdto.setComm(comm);
        empdto.setDept(deptno);

        empDAO empdao=new empDAO();
        insert();



    }
}
