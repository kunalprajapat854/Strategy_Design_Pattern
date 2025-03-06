1.Simple Java application without using spring core and spring boot features.

2. This application shows how to communicate one java class to another java class withuot using inheritence or composition.
 
3. Inheritence (Is-A) and composition (has-A) our java classes is tightly coupled to each other .
  
4. Developing classes with tightly coupling is not recommended in real time application developement.
  
5. If you're using spring core module then setter injection or constructor injection it will care of Ioc container .
 
6. Inversion Of control(IOC) identify the target object and dependent object and injecting the dependent object that called Dependency Injection (DI)

                            Classes Info:
                         IPayment. (interface)
                        CreditCardPayment (class)
                        DebitCardPayment (class)
                          UpiPayment(class)
                         BillCollector (class)
                             Test (class)

7.These Java classes create to follow strategy design pattern rules to achieve lossey coupling.

8.Strategy design pattern rules:

			     	* using interface instead implementation classses.
				* code should open for extension and closed for modification.

9.Losely coupling means not calling dependent method directly instead  we are using interface reference variable.

10. By default interface reference variable is null because it not intialized or it throws NullPointerException.when we using interface ref variable.
  
11. To set interface implement classes parameter value then we are using setter method or either constructor method.
12. Using setter method injecting dependent class object into target class object  (dependent class CreditCardPayment) and (target class Billcollector).
13. Setter Method is used to set the value for the interface ref variable to achieve loosely coupling.
14. We can also use construtor method to injecting one class object into another class .
15. In Test.java class creating billcollector.class object and injecting dependent object using setter or constructor method and call interface pay method.
    
16. Performing Field injection using reflection class to access private variable outside the class and injecting dependent obj into target class.
