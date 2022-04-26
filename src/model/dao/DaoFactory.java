package src.model.dao;

import src.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC();
    }

    // public static DepartmentDao createDepartmentDao(){
    //     return new DepartmentDaoJDBC();
    // }
}
