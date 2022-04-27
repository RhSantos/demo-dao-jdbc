package src.application;

import java.util.ArrayList;
import java.util.List;

import src.model.dao.DaoFactory;
import src.model.dao.SellerDao;
import src.model.entities.Seller;

public class Program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        List<Seller> list = new ArrayList<>();
        list = sellerDao.findAll();
        System.out.println(list);
    } 
}
