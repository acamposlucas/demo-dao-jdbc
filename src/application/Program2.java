package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== DEPARTMENT TESTS ===");
		
		System.out.println("=== TEST 1: Department insert ===");
		Department newDepartment = new Department(null, "Logistics");
		departmentDao.insert(newDepartment);
		System.out.println("Department inserted! Id = " + newDepartment.getId());


	}

}
