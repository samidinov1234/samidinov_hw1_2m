public class SportBike extends Motorcycle {
    private int speed;

    public SportBike(String name, int yearOfRelease, int speed, MotorcycleColors motorcycleColors, MotorTechnics motorTechnics) {
        super(name, yearOfRelease, motorcycleColors, motorTechnics);
        this.speed = speed;

    }

    public final void method() {
        System.out.println("The motorcycle is for sale");
    }

    public void method(String method) {
        System.out.println(method);
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nspeed " + speed;
    }

}
