package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	private SimpleJdbcInsert sji;
	
	@Override
	public int insertEmpData(EmployeeBO bo) {

		Map<String, Object> map = null;
		int result = 0;
		
		//prepare param for execute
		map = new HashMap<String, Object>();
		map.put("empId", bo.getEmpId());
		map.put("empName", bo.getEmpName());
		map.put("salary", bo.getSalary());
		map.put("desg", bo.getDesg());
		
		//specify the table name
		sji.setTableName("Employee1");
		
		//execute the logic
		result = sji.execute(map);
		return result;
	}//method

}//class
