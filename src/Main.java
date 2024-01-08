

public class Main {
    public static void main(String[] args) {
        MotorTechnics motorTechnics = new MotorTechnics("gjyhb", 128);
        Snowrider snowrider = new Snowrider("CMX", 2006, 180, motorTechnics, MotorcycleColors.WHITE, "America");
        SportBike sportBike = new SportBike("Minsk R 250", 2014, 280, MotorcycleColors.BLACK, motorTechnics);

        System.out.println(snowrider.getInfo());
        System.out.println();
        System.out.println(sportBike.getInfo());
        System.out.println();
        snowrider.method();
        System.out.println();
        sportBike.method();
        System.out.println("Excellent aerodynamics");
    }
}