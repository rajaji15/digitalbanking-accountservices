package digitalbanking.accountservices.model;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component

@Entity
@Table(name = "Account")

public class Account {

	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public double getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}
	public Date getAccount_creation_date() {
		return account_creation_date;
	}
	public void setAccount_creation_date(Date account_creation_date) {
		this.account_creation_date = account_creation_date;
	}
	public boolean isAccount_status() {
		return account_status;
	}
	public void setAccount_status(boolean account_status) {
		this.account_status = account_status;
	}
	private int account_no;
	private int customer_id;
  
	@NotNull
	private String ifsc_code;
	  @NotNull

	private  String account_type;
	  @NotNull

	  private double account_balance;
	private Date account_creation_date;
	  @NotNull

	private boolean account_status;
	
}
