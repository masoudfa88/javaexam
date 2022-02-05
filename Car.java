public class Car {
    private String name ;
    private String model;
    private int price ;

    public Car(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }
    public void addoption1(String name,int price){
        this.price+=price;
        System.out.println(name+" about Option 1 was added by "+price+" cost");
    }    public void addoption2(String name,int price){
        this.price+=price;
        System.out.println(name+" about Option 2 was added by "+price+" cost");
    }    public void addoption3(String name,int price){
        this.price+=price;
        System.out.println(name+" about Option 3 was added by "+price+" cost");
    }    public void addoption4(String name,int price){
        this.price+=price;
        System.out.println(name+" about Option 4 was added by "+price+" cost");
    }
    public void finalprice(){
        System.out.println("final price is "+this.price+"\n");
    }
}
