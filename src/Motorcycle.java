public class Motorcycle {
    private String name;
    private int yearOfRelease;
    private MotorcycleColors motorcycleColors;
    private MotorTechnics motorTechnics;

    public Motorcycle(String name, int yearOfRelease, MotorcycleColors motorcycleColors, MotorTechnics motorTechnics) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.motorcycleColors = motorcycleColors;
        this.motorTechnics = motorTechnics;
    }

    public String getName() {
        return name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public MotorcycleColors getMotorcycleColors() {
        return motorcycleColors;
    }

    public MotorTechnics getMotorTechnics() {
        return motorTechnics;
    }

    public String getInfo() {
        return "\nMotorcycle colors" + motorcycleColors +
                "\nName" + name +
                "\nYear of Release" + yearOfRelease +
                "\nMotor Technics address" + motorTechnics.getAddress() +
                "\nMotor Technics number" + motorTechnics.getNumber();
    }

}
