package kg.megacom.MethodsSpringBoot.models;

import kg.megacom.MethodsSpringBoot.Services.CheckTiketService;
import kg.megacom.MethodsSpringBoot.Services.impl.CheckTiketServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "kg.megacom.MethodsSpringBoot")
public class TicketsConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    @Scope("prototype")  // Создаваемый билет должен быть другим объектом. Он ведь не произдной для автобусов и троллейбусов)
    public Tickets getTicket(){
        return new Tickets("TikConfig", 1);
    }


}
