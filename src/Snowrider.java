public final class Snowrider extends SportBike {
    private String production;

    public Snowrider(String name, int yearOfRelease, int speed, MotorTechnics motorTechnics, MotorcycleColors motorcycleColors, String production) {
        super(name, yearOfRelease, speed, motorcycleColors, motorTechnics);
        this.production = production;
    }

    public String getProduction() {
        return production;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nproduction " + production;
    }

}
