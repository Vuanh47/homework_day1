package bt7_1;

import java.util.Date;

import javax.xml.crypto.Data;

public class Visit {
	Customer customer;
	Date date;
	Double serviceExpense;
	Double productExpense;
	public Visit(Customer customer, Date date, Double serviceExpense, Double productExpense) {
		super();
		this.customer = customer;
		this.date =  date;
		this.serviceExpense = serviceExpense;
		this.productExpense = productExpense;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Date getData() {
		return date;
	}
	public void setData(Date data) {
		this.date = data;
	}
	public Double getServiceExpense() {
		return serviceExpense;
	}
	public void setServiceExpense(Double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}
	public Double getProductExpense() {
		return productExpense;
	}
	public void setProductExpense(Double productExpense) {
		this.productExpense = productExpense;
	}
	public double getTotalExExpense() {
		return productExpense+serviceExpense;
	}
	public String toString() {
		   return "Total Expense:"
		   		+ "\n service expense = " + serviceExpense + "\n product expense = " + productExpense + 
	   "\n-> total expense = service expense + product expense = " + getTotalExExpense()+"\n Date: " + date;
	   }
	
}
