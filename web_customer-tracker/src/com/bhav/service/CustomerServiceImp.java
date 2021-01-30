package com.bhav.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bhav.dao.CustomerDAO;
import com.bhav.entity.Customer;
@Service
public class CustomerServiceImp implements CustomerService {
	
	@Autowired
	
	private  CustomerDAO cd;

	@Override
	@Transactional
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return cd.listCustomer();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		cd.saveCustomer(theCustomer);
		
	}

}
