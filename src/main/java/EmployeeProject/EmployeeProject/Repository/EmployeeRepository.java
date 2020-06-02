package EmployeeProject.EmployeeProject.Repository;


import EmployeeProject.EmployeeProject.Model.Department;
import EmployeeProject.EmployeeProject.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByDepartment(Department department);
}
