package in.kunal;

import java.lang.reflect.Field;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {

//		BillCollector billCollector = new BillCollector();
////		using [setter method] to injecting creditcardPayment  into billcollector
////		billCollector.setPayment(new UpiPayment());
////		billCollector.paybill(1500.0);
////		
//		//using [constructor method] injecting creditcard into billcollector
//		BillCollector billCollector2 = new BillCollector(new CreditCardPayment());
//		billCollector2.paybill(1500.0);

		// Field Injection using interface ref variable

		Class<?> clz = Class.forName("in.kunal.BillCollector"); // target class path
		Field field = clz.getDeclaredField("payment"); // interface ref variable

		field.setAccessible(true); // accessing private variable outside the class
		Object object = clz.newInstance(); // creating the object of that variable

		field.set(object, new UpiPayment()); // injecting dependent obj into billcollector

		BillCollector billCollector = (BillCollector) object;  
		billCollector.paybill(1500.0);

	}

}
