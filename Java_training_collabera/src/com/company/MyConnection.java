package com.company;

import java.sql.Connection;
import java.sql.DriverManager;


public class MyConnection {

    public static void main(String[] args){
        System.out.println("We are back!");

        try{
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/world","root","root");

            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}