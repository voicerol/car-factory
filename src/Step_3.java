public class Step_3{
    public static void main(String [] args){
    boolean isAutomated = true;
    boolean isProfitable = false;
    char emissionStandard = 'E';
    boolean isTurbocharged = true;
    char fuelType = 'P';
    String carColor = "Grey";
    String colorCategory;
    
    // Scenario: check is automated
        if (isAutomated) {
            System.out.println("Is Automated\n");
        }

        
    // Scenario: check if the car is profitable || if not
        if (isProfitable) {
            System.out.println("The car manufacturing is profitable.\n");
        }else {
            System.out.println("The car manufacturing is not profitable.\n");
        }
        
    // Scenario: check the car emission standard and provide recommendations
        if (emissionStandard == 'E') {
            System.out.println("This car meets the latest emission standards.\n");
        }else if (emissionStandard == 'B') {
            System.out.println("Consider upgrading the car to meet higher emission standards.\n");
        }else {
            System.out.println("Emission standards not recognized.\n");
        }
    // Scenario: check if the car is turbocharged and fuel type
        if (isTurbocharged) {
            System.out.println("This car is turbocharged.\n");
        
            if (fuelType == 'P') {
                System.out.println("It uses premium fuel.\n");
            } else {
                System.out.println("It uses regular fuel.\n");
            }
        }else {
            System.out.println("This car is not turbocharged.\n");
        }
    // Scenario: determine the car color category using switch-case
        switch (carColor) {
            case "Red":
            case "Blue":
            case "Green":
                colorCategory = "Premium Color\n";
                break;
            case "Grey":
            case "Black":
            case "White":
                colorCategory = "Natural Color\n";
                break;
            default:
                colorCategory = "Unidentified color\n";
                break;
        }
        System.out.println("The car color included into the category: " + colorCategory);
    }
}