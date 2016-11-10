package digitalbanking.accountservices.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import digitalbanking.accountservices.dao.AccountDAO;
import digitalbanking.accountservices.model.Customer;

public class AccountServicesController {

	@Autowired
	private AccountDAO accountDao;
	
    @RequestMapping("/digitalbanking/accountservices/getAccountList")
    @ResponseBody
    public List<Account> getAccountList(@RequestParam("customerId") int customerId) {
       
    	Customer customer=new Customer();
    	customer.setCustomerId(customerId);
    	accountDao.getAccountList(customer);
    
    }
}
