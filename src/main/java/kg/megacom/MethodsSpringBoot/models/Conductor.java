package kg.megacom.MethodsSpringBoot.models;

import kg.megacom.MethodsSpringBoot.Services.CheckTiketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") // Кондуктор будет один принимать билеты
public class Conductor {


    private Tickets tickets;

    @Autowired
    @Qualifier("checkTiketServiceImpl")
    CheckTiketService checkTiketService;


    public Conductor(Tickets tickets) {
        this.tickets = tickets;

    }

    public Tickets getTickets() {
        return tickets;
    }

    public void setTickets(Tickets tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "tickets=" + tickets +
                '}';
    }

    public void test(){
        Tickets ticket = checkTiketService.getTickets();
        System.out.println(ticket);
    }
}
