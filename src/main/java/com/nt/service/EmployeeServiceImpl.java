package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.vo.EmployeeVO;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO dao;
	
	@Override
	public String registerEmployee(EmployeeVO vo) {
		EmployeeBO empBo = null;
		int result = 0;
		
		//prepare Bo
		empBo = new EmployeeBO();
		empBo.setEmpId(Integer.parseInt(vo.getEmpId()));
		empBo.setEmpName(vo.getEmpName());
		empBo.setSalary(Double.parseDouble(vo.getSalary()));
		empBo.setDesg(vo.getDesg());
		
		//use dao
		result = dao.insertEmpData(empBo);
		if(result!=0)
			return "Employee Record Inserted successfully......";
		else
		return "Employee Record Insertion failed......";
	}//method

}//class
