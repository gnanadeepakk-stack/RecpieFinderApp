package com.miniproject;

import java.net.Socket;
import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        System.out.println("Please slect the option");

        System.out.println("1.Add employee");
        System.out.println("2.View employee");
        System.out.println("3.Update employee");
        System.out.println("4.Delete employee");
        System.out.println("0.EXIT");

        Scanner s=new Scanner(System.in);
        int choice = s.nextInt();

        switch (choice)
        {
            case 1:
                    System.out.println("Add employee");
                    addEmp();
                    break;
            case 2:
                System.out.println(" update employee");
                break;
            case 3:
                System.out.println(" select employee");
                break;
            case 4:
                System.out.println("delete employee");
                break;
            default:
               System.out.println("nothing");
                break;
        }

    }
}
