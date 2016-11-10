package digitalbanking.accountservices.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sboot.dao.UserDao;

import digitalbanking.accountservices.dao.AccountDAO;
import digitalbanking.accountservices.model.Account;
import digitalbanking.accountservices.model.Customer;

@Component
@Resource

public class AccountServiceImpl {

    @Autowired
	private AccountDAO accountDao;
	
	public List getAccountList(Customer customer)
	{
		return accountDao.getAccountList(customer);
	
	}
	/*public Account getAccountDetails(Customer customer, Account account)
	{
		
		accountDao.getAccountDetails(customer, account);
	}*/
}
