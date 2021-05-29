package kg.megacom.MethodsSpringBoot.Services.impl;

import kg.megacom.MethodsSpringBoot.Services.CheckTiketService;
import kg.megacom.MethodsSpringBoot.models.Tickets;
import org.springframework.stereotype.Service;

@Service
public class CheckTiketServiceImpl2 implements CheckTiketService {
    @Override
    public Tickets getTickets() {
        return new Tickets("IMPL-2", 2);
    }

    @Override
    public String toString() {
        return "CheckTiketServiceImpl2{" +
                "code='"+ getTickets().getCode() +"\'"+
                ", price='"+ getTickets().getPrice() +"'}";
    }
}
