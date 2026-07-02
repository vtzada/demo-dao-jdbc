package application;

import dao.DaoFactory;
import dao.SellerDao;
import dao.impl.SellerDaoJDBC;
import entities.Department;
import entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department dep = new  Department(1, "Books");

        System.out.println(dep);

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, dep);

        SellerDao sellerDao = new DaoFactory().createSellerDao();

        System.out.println(seller);
    }
}
