package in.nit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner implements  CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("welcome to springboot app");
		
		System.out.println("modified to springboot app");
		
	}

}
