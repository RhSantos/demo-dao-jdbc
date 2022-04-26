package src.application;

import java.util.Date;

import src.model.entities.Department;
import src.model.entities.Seller;

public class Program {
    public static void main(String[] args) {
        Department obj = new Department(1,"Book");
        Seller seller = new Seller(21,"Bob","bob@gmail.com",new Date(),2900.0,obj);
        System.out.println(obj);
        System.out.println(seller);
    } 
}
