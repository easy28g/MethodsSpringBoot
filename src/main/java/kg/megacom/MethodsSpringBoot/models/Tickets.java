package kg.megacom.MethodsSpringBoot.models;

public class Tickets {

    private String code;
    private double price;

    public Tickets() {
    }

    public Tickets(String code, double price) {
        this.code = code;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "code='" + code + '\'' +
                ", price=" + price +
                '}';
    }

    public void init(){
        System.out.println("init");
    }

    public void destroy(){
        System.out.println("destroy");
    }
}
