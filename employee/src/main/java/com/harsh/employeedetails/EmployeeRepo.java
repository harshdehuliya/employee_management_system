package com.harsh.employeedetails;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	ArrayList<Employee> findAllByUname(String uname);
    @Transactional
    @Modifying
	@Query("UPDATE Employee SET uname=:newuname WHERE uid=:uid")
	public void updateUnameByUid(@Param("newuname") String uname,@Param("uid") int uid);
}
