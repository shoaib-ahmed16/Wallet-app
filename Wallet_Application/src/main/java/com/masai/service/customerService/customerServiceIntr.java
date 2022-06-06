package com.masai.service.customerService;

import java.util.List;

import com.masai.entity.Customer;
import com.masai.entity.Wallet;
import com.masai.globalExceptionHandler.CostumerNotFoundException;

public interface customerServiceIntr {
	
	public Customer createAcc(Customer cs)throws CostumerNotFoundException;
	
	public Customer showBlacnce(String mobile)throws CostumerNotFoundException;
	
	public Customer depositAmount(String mobile, Double amount) throws CostumerNotFoundException;
	
	public String fundTransfer(String mobileNo,String targetMobileNo, Double amount)throws CostumerNotFoundException;
	
	public List<Customer> getListCustomer() throws CostumerNotFoundException ;
	
	public Customer updateCustomer(Customer customer) throws CostumerNotFoundException;
	
	public Customer addMoney(Wallet wallet, Double amount) throws CostumerNotFoundException;

}
