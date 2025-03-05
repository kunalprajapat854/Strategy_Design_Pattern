package in.kunal;

public class CreditCardPayment implements IPayment {

	@Override
	public String pay(double amount) {
//		logic
		return "Payment through CreditCard";
	}

}
