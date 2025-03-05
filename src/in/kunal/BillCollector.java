package in.kunal;

public class BillCollector {

	private IPayment payment;
//    interface variable is not intialized to read the parameter value 
//    we need to use either setter method or constructor 

	public void setPayment(IPayment payment) {
		this.payment = payment;
	}

//	constructor method

	public BillCollector(IPayment payment) {
		this.payment = payment;
	}
	
	public BillCollector() {
		
	}

	public void paybill(double amount) {
//	  CreditCardPayment  cardPayment = new CreditCardPayment();  //tightly coupled with credit class
//	  cardPayment.pay(amount);
		String pay = payment.pay(amount);
		System.out.println(pay);

	}

}
