package com.nt.commens;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

@Configuration
@ComponentScan(basePackages = "com.nt.dao")
public class PersistanceBeanConfig {

	@Bean
	public DataSource createDataSource() {
		BasicDataSource bds = new BasicDataSource();

		//set oracle database property
		bds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bds.setUsername("system");
		bds.setPassword("shri");
		return bds;

	}//method
	
	@Bean
	public SimpleJdbcInsert createsimpleJdbcInsert() {
		SimpleJdbcInsert sji = new SimpleJdbcInsert(createDataSource());
		return sji;
	}//method

}//class
