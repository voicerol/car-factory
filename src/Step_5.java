public class Step_5{

    // Scenario: declare six static variable
    static double m;
    static double n;
    static double currentMileage;
    static double speed;
    static double timeInHours;
    static double distance;


    // Scenario: create a instance method which calculate engine power formula
    // 2 arguments, m is mass (it should be in kg), n is revolutions (per minute)
    // not recommended that the parameter n > m
    static double enginePowerFormula(double m, double n){
        return m * n / 9550;
    }

    // Scenario: recursive method for calculating the mileage of a car
    public static double calculateMileAge(double currentMileage, double speed, double timeInHours) {
    // Basicly: if the time == 0, the mileage is == the current mileage
        if (timeInHours == 0) {
            return currentMileage;
        } else {
    // Recursion: calculate the mileage for the current hour & call the method for the remaining time
            distance = speed * 1; // mileage in 1 hour
            return calculateMileAge(currentMileage + distance, speed, timeInHours - 1);
        }

    }
    // Scenario: create a static block which printing result of power & mileage
    public static void main(String[] args) {
        // oops!
    }
    static {
        System.out.println(enginePowerFormula(1500, 4000));
        System.out.println(calculateMileAge(100, 120, 2));
    }
}