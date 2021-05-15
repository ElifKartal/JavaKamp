package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers= {new SmsLogger(),new EmailLogger(),new FileLogger()};
		CustomerManager customerManager=new CustomerManager(loggers);
		Customer elif =new Customer(1,"Elif","Kartal");
		customerManager.add(elif);
		
	}

}
