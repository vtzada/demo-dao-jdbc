package application;

import dao.DaoFactory;
import dao.SellerDao;
import dao.impl.SellerDaoJDBC;
import entities.Department;
import entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = new DaoFactory().createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

    }
}
