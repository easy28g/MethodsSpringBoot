package kg.megacom.MethodsSpringBoot.Services.impl;

import kg.megacom.MethodsSpringBoot.Services.CheckTiketService;
import kg.megacom.MethodsSpringBoot.models.Tickets;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class CheckTiketServiceImpl implements CheckTiketService {
    @Override
    public Tickets getTickets() {
        return new Tickets("IMPL-1", 1);
    }

    @Override
    public String toString() {
        return "CheckTiketServiceImpl1{" +
                "code='"+ getTickets().getCode() +"\'"+
                ", price='"+ getTickets().getPrice() +"'}";
    }
}
