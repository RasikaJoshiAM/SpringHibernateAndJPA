package com.upgrad.movieapp.dao;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.upgrad.movieapp.entities.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
	
	private SessionFactory sessionFactory;
	
	@Autowired	
	public CustomerDAOImpl(EntityManagerFactory entityManagerFactory) {
		this.sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
	}

	@Override
	public Customer save(Customer customer) {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
		return customer;
	}

	@Override
	public Customer findById(int id) {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		transaction.commit();
		session.close();
		return customer;
	}

	@Override
	public Customer update(Customer customer) {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(customer);
		transaction.commit();
		session.close();
		return customer;
	}

	@Override
	public void delete(Customer customer) {
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer mergerCustomer = (Customer) session.merge(customer);
		session.delete(mergerCustomer);
		transaction.commit();
		session.close();
	}

}
