public class Main {
    public static void main(String[] arg){

        Car pride = new Car("Pride","132",25_000_000);
        pride.addoption1("zeh",200_000);
        pride.addoption2("ring",1200000);
        pride.addoption3("keyless",2000000);
        pride.finalprice();

        Car saina = new Eco("saina","cross",370000000);
        saina.finalprice();

        Car quick = new Enterprize("Quick","R" , 120000000);
        quick.finalprice();



    }
}
