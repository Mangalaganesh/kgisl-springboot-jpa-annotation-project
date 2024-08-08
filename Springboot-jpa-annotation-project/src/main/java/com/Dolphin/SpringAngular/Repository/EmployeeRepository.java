package com.Dolphin.SpringAngular.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Dolphin.SpringAngular.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	
	
}
