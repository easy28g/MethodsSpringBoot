package kg.megacom.MethodsSpringBoot;

import kg.megacom.MethodsSpringBoot.models.Conductor;
import kg.megacom.MethodsSpringBoot.models.Tickets;
import kg.megacom.MethodsSpringBoot.models.TicketsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MethodsSpringBootApplication {

	public static void main(String[] args) {

		SpringApplication.run(MethodsSpringBootApplication.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(TicketsConfig.class);


		Conductor conductor = context.getBean("conductor", Conductor.class);
		conductor.test();

		Conductor conductor2 = context.getBean("conductor", Conductor.class);
		conductor2.test();

		System.out.println(conductor.equals(conductor2));

		Tickets ticket1 = (Tickets) context.getBean("getTicket");
		System.out.println(ticket1);

		Tickets ticket2 = (Tickets) context.getBean("getTicket");
		System.out.println(ticket2);

		System.out.println(ticket1.equals(ticket2));
	}

}
