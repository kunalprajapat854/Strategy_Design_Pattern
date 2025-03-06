package in.kunal;

public class BillCollector {

	private IPayment payment;  // instance default value is null 
	
//	we call this variable it will return nullpointer exception
//    interface variable is not initialized to read the parameter value 
//    we need to use either setter method or constructor 

	public void setPayment(IPayment payment) { // set the value for the payment variable
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
//	  cardPayment.pay(amount); pay is reference to payment interface 
		String pay = payment.pay(amount);
		System.out.println(pay);

	}

}
