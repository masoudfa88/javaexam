public class Enterprize extends Car{
    public Enterprize(String name, String model, int price) {
        super(name, model, price);
        super.addoption1("EN_zeh",1200000);
        super.addoption2("EN_remote",5000000);
        super.addoption3("EN_jack",50000);
        super.addoption4("EN_pakhsh",3000000);
    }
    @Override
    public void addoption1(String name, int price) {
        System.out.println("just Enterprize options....");
    }

    @Override
    public void addoption2(String name, int price) {
        System.out.println("just Enterprize options....");
    }

    @Override
    public void addoption3(String name, int price) {
        System.out.println("just Enterprize options....");
    }

    @Override
    public void addoption4(String name, int price) {
        System.out.println("just Enterprize options....");
    }

}
