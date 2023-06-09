interface InterfaceOne {
    void updateGear(int gear);
}

interface InterfaceTwo {
    void accelerate(int speed);
}

interface InterfaceThree {
    void pushBrake(int brake);
}

class Car implements InterfaceOne, InterfaceTwo, InterfaceThree {
    private int gear;
    private int speed;
    private int brake;

    public void updateGear(int gear) {
        this.gear = gear;
    }

    public void accelerate(int speed) {
        this.speed = speed;
    }

    public void pushBrake(int brake) {
        this.brake = brake;
    }

    public void currentSpeed() {
        int currentSpeed = speed - brake;
        System.out.println("Car present state: " );
        System.out.println("brake:"+ brake);
        System.out.println(" speed: " + currentSpeed + " gear: " + gear);
    }
}

class Truck implements InterfaceOne, InterfaceTwo, InterfaceThree {
    private int gear;
    private int speed;
    private int brake;

    public void updateGear(int gear) {
        this.gear = gear;
    }

    public void accelerate(int speed) {
        this.speed = speed;
    }

    public void pushBrake(int brake) {
        this.brake = brake;
    }

    public void currentSpeed() {
        int currentSpeed = speed - brake;
        System.out.println("Truck present state: " );
        System.out.println( "brake:" + brake );
        System.out.println(" speed: " + currentSpeed + " gear: " + gear);
    }
}

public class Bipana {
    public static void main(String[] args) {
        Car c1 = new Car();
        Truck t1 = new Truck();

        c1.updateGear(2);
        c1.accelerate(3);
        c1.pushBrake(2);
        c1.currentSpeed();

        t1.updateGear(1);
        t1.accelerate(4);
        t1.pushBrake(3);
        t1.currentSpeed();
    }
}

    
