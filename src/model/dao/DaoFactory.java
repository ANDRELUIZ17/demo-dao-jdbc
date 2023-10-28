package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    private DaoFactory() {
        throw new IllegalStateException("Utility class");
    }

    //essa classe vai ter operações estaticas para instanciar os Daos
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }  

    public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
