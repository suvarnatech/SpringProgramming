package com.capg;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.bean.EmployeeBean;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("conf.xml");
		Object obj = context.getBean("emp");
		EmployeeBean emp = (EmployeeBean) obj;
		System.out.println(emp);

	}

}
