package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== DEPARTMENT TESTS ===");

		System.out.println("=== TEST 1: Department insert ===");
		Department newDepartment = new Department(null, "Logistics");
		departmentDao.insert(newDepartment);
		System.out.println("Department inserted! Id = " + newDepartment.getId());

		System.out.println("=== TEST 2: Department findById ===");
		Department dep = departmentDao.findById(10);
		System.out.println(dep);
		
		System.out.println("=== TEST 3: Department deleteById ===");
		System.out.print("Enter id to be deleted: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Id " + id + " deleted");
		
		System.out.println("=== TEST 4: Department update ===");
		dep.setName("Oil and Gas");
		departmentDao.update(dep);
		System.out.println("Updated!");
		
		System.out.println("=== TEST 5: Department findAll ===");
		List<Department> list = departmentDao.findAll();
		for(Department department : list) {
			System.out.println(department);
		}

		sc.close();

	}

}
