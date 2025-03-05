package in.kunal;

public class DebitCardPayment implements IPayment {

	@Override
	public String pay(double amount) {
//		logic
		return "Payment through Debit Card";
	}

}
