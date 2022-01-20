package com.upgrad.movieapp;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.upgrad.movieapp.dao.CustomerDAO;
import com.upgrad.movieapp.entities.Customer;

@SpringBootApplication
public class MovieappApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(MovieappApplication.class, args);
		
		CustomerDAO customerDAO = context.getBean(CustomerDAO.class);
		Customer customer = new Customer();
		customer.setFirstName("Rasika");
		customer.setLastName("Joshi");
		customer.setUserName("abcedfghi");
		customer.setPassword("******");
		customer.setDateOfBirth(LocalDateTime.of(1998,11,6,0,0));
		System.out.println("Before saving to databse" + customer);
		
		Customer afterSaved = customerDAO.save(customer);
		System.out.println("After saving to Databse" + afterSaved);
		
		Customer retrieveCustomer = customerDAO.findById(afterSaved.getCutomerId());
		System.out.println(retrieveCustomer);
		
		customer.setUserName("newName");
		
		Customer updateCustomer = customerDAO.update(customer);
		System.out.println("After update" + updateCustomer);
		
		customerDAO.delete(updateCustomer);
		System.out.println("After deleting" + customerDAO.findById(updateCustomer.getCutomerId()));
	}

}
