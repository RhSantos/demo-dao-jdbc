package src.application;

import java.util.Date;
import java.util.List;

import src.model.dao.DaoFactory;
import src.model.dao.DepartmentDao;
import src.model.dao.SellerDao;
import src.model.entities.Department;
import src.model.entities.Seller;

public class Program {
    public static void main(String[] args) {

        // SellerDao sellerDao = DaoFactory.createSellerDao();

        // System.out.println("===== TEST 1: seller findById() =====");
        // Seller seller = sellerDao.findById(3);
        // System.out.println(seller);

        // System.out.println("===== TEST 2: seller findByDepartment() =====");
        // Department department = new Department(2,null);
        // List<Seller> list = sellerDao.findByDepartment(department);
        // System.out.println(list);

        // System.out.println("===== TEST 3: seller findAll() =====");
        // List<Seller> list2 = sellerDao.findAll();
        // System.out.println(list2);

        // System.out.println("===== TEST 4: seller insert() =====");
        // Seller seller1 = new Seller(null,"Greg","greg@gmail.com",new Date(),4000.00,department);
        // sellerDao.insert(seller1);
        // System.out.println("Inserted! New Id: "+seller1.getId());

        // System.out.println("===== TEST 5: seller update() =====");
        // seller1.setName("Marcos");
        // seller1.setEmail("marcos@gmail.com");
        // sellerDao.update(seller1);
        // System.out.println("Updated!");

        // System.out.println("===== TEST 6: seller delete() =====");
        // sellerDao.deleteById(10);
        // System.out.println("Deleted!");

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("===== TEST 1: department findById() =====");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("===== TEST 2: department findAll() =====");
        List<Department> list2 = departmentDao.findAll();
        System.out.println(list2);

        // System.out.println("===== TEST 3: department insert() =====");
        // Department department1 = new Department(null,"Sports");
        // departmentDao.insert(department1);
        // System.out.println("Inserted! New Id: "+department1.getId());

        // System.out.println("===== TEST 4: department update() =====");
        // department1.setName("Finances");
        // department1.setId(5);
        // departmentDao.update(department1);
        // System.out.println("Updated!");

        // System.out.println("===== TEST 5: department delete() =====");
        // departmentDao.deleteById(5);
        // System.out.println("Deleted!");

    } 
}
