package car;

public class LuxuryCar implements Car {

    // sal = 50000
    // sal * 0.10 + sal




    String name;

    //default constructor
    public LuxuryCar() {
        System.out.println("hi from constructor");
    }

    public LuxuryCar(String name) {
        this.name = name;
    }

    public void tyres() {
        System.out.println("costly tyres"); // 100000
    }

    public void breaks() {
        System.out.println("breaks");
    }

    public void sunroof() {
        System.out.println("sunroof");
    }


}
