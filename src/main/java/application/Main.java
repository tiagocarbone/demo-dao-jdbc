package application;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.dao.impl.SellerDAOJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        Seller seller = new Seller(1, "bob", "seller@gmail",new Date(), 3000.0, obj);

        SellerDAO sellerDAO = DaoFactory.createSellerDao();

        System.out.println(seller);

    }
}