package application;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.dao.impl.SellerDAOJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SellerDAO sellerDAO = DaoFactory.createSellerDao();

        System.out.println("=== Test 1: Seller findById ===");

        Seller seller = sellerDAO.findById(3);

        System.out.println(seller);

    }
}