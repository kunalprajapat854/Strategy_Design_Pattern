package in.kunal;

public class Test {
	
	public static void main(String[] args) {
		
		BillCollector billCollector = new BillCollector();
//		using setter method to injecting creditcardPayment  into billcollector
//		billCollector.setPayment(new UpiPayment());
//		billCollector.paybill(1500.0);
//		
		//using constructor method injecting creditcard into billcollector
		BillCollector billCollector2 = new BillCollector(new CreditCardPayment());
		billCollector2.paybill(1500.0);
		
	}

}
