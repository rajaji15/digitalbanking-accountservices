package digitalbanking.accountservices.service;

import java.util.List;

import org.springframework.stereotype.Service;

import digitalbanking.accountservices.model.Account;
import digitalbanking.accountservices.model.Customer;

@Service
public interface AccountService {

	public List<Account> getAccountList(Customer customer);
	public Account getAccountDetails(Customer customer, Account account);
	
	//public List getAccountTransactions(Customer customer);
	

}
