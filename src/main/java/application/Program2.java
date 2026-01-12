package application;

import entities.Department;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        System.out.println("=== TEST 1: department findById ===");
        Department dep = departmentDao.findById(2);
        System.out.println(dep);

        System.out.println("=== TEST 2: department findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }

        System.out.println("=== TEST 3: department insert ===");
        Department newDepartment = new Department(null, "Vehicles");
        departmentDao.insert(newDepartment);
        System.out.println(newDepartment);

        System.out.println("=== TEST 4: department update ===");
        dep = departmentDao.findById(7);
        dep.setName("Moto");
        departmentDao.update(dep);
        System.out.println(dep);

        System.out.println("=== TEST 5: department update ===");
        departmentDao.deleteById(9);
        System.out.println("Delete completed");




    }
}
