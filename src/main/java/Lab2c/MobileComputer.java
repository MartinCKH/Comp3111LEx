package Lab2c;

/*	Comp3111LEx\Lab2c\MobileComputer.java
	Inherits from Computer, class library for Lab2 Exercise 3	*/

public class MobileComputer extends Computer implements Chargeable {
    private int battery;
    public MobileComputer() {
        secret = "MobileComputer secret";
        battery = 5;
    }
    @Override
    public void work() {
        if (battery > 0) {
            System.out.println("It is working on my lap.");
            battery--;
        } else
            System.out.println("Running out of battery");
    }
    @Override
    public void charge() {
        if (battery < 10)
            battery++;
        System.out.println("Charge this mobile computer" + " battery level: " + battery); ;
    }
}
