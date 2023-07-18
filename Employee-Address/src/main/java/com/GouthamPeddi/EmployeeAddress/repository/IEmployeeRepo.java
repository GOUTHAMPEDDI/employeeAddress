package com.GouthamPeddi.EmployeeAddress.repository;

import com.GouthamPeddi.EmployeeAddress.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepo extends CrudRepository<Employee,Long> {

    Employee findByEmployeeId(Long empId);
}
