package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    //essa classe vai ter operações estaticas para instanciar os Daos

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC();
    }
    
}
