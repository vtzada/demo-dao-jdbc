package application;

import dao.DaoFactory;
import dao.SellerDao;
import dao.impl.SellerDaoJDBC;
import entities.Department;
import entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = new DaoFactory().createSellerDao();

        System.out.println("=== TEST 1: seller findById ===:");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("=== TEST 2: seller findByDepartment ===:");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller s : list) {
            System.out.println(s);
        }

        System.out.println("=== TEST 3: seller findAll ===:");
        list = sellerDao.findAll();
        for (Seller s : list) {
            System.out.println(s);
        }

        System.out.println("=== TEST 3: seller update ===:");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update complete");

    }
}
