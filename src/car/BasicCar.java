package car;

public abstract class BasicCar implements Car, Doors {

    public void breaks() {
        System.out.println("breaks");
    }
}
