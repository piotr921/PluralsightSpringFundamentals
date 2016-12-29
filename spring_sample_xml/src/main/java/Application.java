import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		//CustomerService service = new CustomerServiceImpl();
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService service = applicationContext.getBean("customerService", 
				CustomerService.class);
		
		System.out.println(service);
		
		CustomerService service2 = applicationContext.getBean("customerService", 
				CustomerService.class);
		
		System.out.println(service2);
		
		System.out.println(service.findAll().get(0).getFirstName());
	}

}
