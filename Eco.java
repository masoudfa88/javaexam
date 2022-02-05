public class Eco extends Car {

    public Eco(String name, String model, int price) {
        super(name+" eco", model, price);
        super.addoption1("Eco_ring",1200000);
        super.addoption2("Eco_remote",500000);

    }

    @Override
    public void addoption1(String name, int price) {
        System.out.println("just Eco options....");
    }

    @Override
    public void addoption2(String name, int price) {
        System.out.println("just Eco options....");
    }

    @Override
    public void addoption3(String name, int price) {
        System.out.println("just Eco options....");
    }

    @Override
    public void addoption4(String name, int price) {
        System.out.println("just Eco options....");
    }


}
