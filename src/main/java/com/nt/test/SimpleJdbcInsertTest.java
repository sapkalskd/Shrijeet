package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.commens.AppConfig;
import com.nt.service.EmployeeService;
import com.nt.vo.EmployeeVO;

public class SimpleJdbcInsertTest {

	public static void main(String[] args) {

		ApplicationContext aCtx = null;
		EmployeeService service = null;
		EmployeeVO vo = null;
		
		//create IOC container
		aCtx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get service class object
		service = aCtx.getBean("empService", EmployeeService.class);
				
		//prepare VO class object
		vo = new EmployeeVO();
		vo.setEmpId("1121");
		vo.setEmpName("Amit");
		vo.setDesg("Java Programmer");
		vo.setSalary("90000");
		
		//invoke B. method
		System.out.println(service.registerEmployee(vo));
		
		//close ioc container
		((AbstractApplicationContext) aCtx).close();
		
	}//main

}//class
