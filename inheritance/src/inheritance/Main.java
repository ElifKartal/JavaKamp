package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer elif =new IndividualCustomer();
		elif.customerNumber="12345";
		
		
		CorporateCustomer hepsiBurada =new CorporateCustomer();
		hepsiBurada.customerNumber="78910";
		SendikaCustomer abc =new SendikaCustomer();
		abc.customerNumber="11111";
		
		CustomerManager customerManager =new CustomerManager();
		
		Customer[] customers= {elif,abc,hepsiBurada};
		
		customerManager.addMultiple(customers);
	}

}
