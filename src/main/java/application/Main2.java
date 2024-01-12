package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        DepartmentDAO departmentDAO = DaoFactory.createDepartmentDao();

        System.out.println("=== Test 1: Department findById ===");
        Department dep = departmentDAO.findById(3);
        System.out.println(dep);
        System.out.println();

        System.out.println("=== Test 2: Department findAll ===");

        List<Department> list = departmentDAO.findAll();

        for (Department obj : list){
            System.out.println(obj);
        }

        System.out.println();


        System.out.println("=== Test 3: Department delete ===");
        departmentDAO.deleteById(7);
        System.out.println("Deleted");

        System.out.println("=== TEST 4: update =======");
        Department dep2 = departmentDAO.findById(1);
        dep2.setName("Food");
        departmentDAO.update(dep2);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 5: Insert =======");
        Department newDepartment = new Department(null, "Music");
        departmentDAO.insert(newDepartment);
        System.out.println("Inserted! New id: " + newDepartment.getId());


    }
}