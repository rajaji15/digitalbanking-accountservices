package digitalbanking.accountservices.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import digitalbanking.accountservices.model.Account;
import digitalbanking.accountservices.model.Customer;

@Repository
@Transactional

public interface AccountDAO extends CrudRepository<Account, Long> {


	public List<Account> getAccountList(Customer customer);
	//public Account getAccountDetails(Customer customer, Account account);

}
