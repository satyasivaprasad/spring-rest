package org.spring.rest.dao;


import org.spring.rest.entity.Customer;

import java.util.List;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
}
