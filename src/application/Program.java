package src.application;

import java.util.ArrayList;
import java.util.List;

import src.model.dao.DaoFactory;
import src.model.dao.SellerDao;
import src.model.entities.Department;
import src.model.entities.Seller;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("===== TEST 1: seller findById() =====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("===== TEST 2: seller findByDepartment() =====");
        Department department = new Department(2,null);
        List<Seller> list = sellerDao.findByDepartment(department);
        System.out.println(list);

        System.out.println("===== TEST 3: seller findAll() =====");
        List<Seller> list2 = sellerDao.findAll();
        System.out.println(list2);


    } 
}
