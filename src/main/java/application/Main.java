package application;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.dao.impl.SellerDAOJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SellerDAO sellerDAO = DaoFactory.createSellerDao();

        System.out.println("=== Test 1: Seller findById ===");

        Seller seller = sellerDAO.findById(3);

        System.out.println(seller);

        System.out.println();

        System.out.println("=== Test 2: Seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDAO.findByDepartment(department);

        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println();
        System.out.println("=== Test 3: Seller findAll ===");
        List<Seller> list2 = sellerDAO.findAll();
        for (Seller obj : list2){
            System.out.println(obj);
        }

        System.out.println();
        System.out.println("=== Test 4: Seller insert  ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail",new Date(), 4000.00, department);
        sellerDAO.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println();
        System.out.println("=== Test 5: Seller update  ===");
        seller = sellerDAO.findById(2);
        seller.setName("Frederico");
        sellerDAO.update(seller);
        System.out.println("Update completed ");

        System.out.println();
        System.out.println("=== Test 6: Seller delete  ===");
        System.out.println("Enter id for delete: ");
        int id = sc.nextInt();
        sellerDAO.deleteById(id);
        System.out.print("Delete completed ");

        sc.close();
    }
}