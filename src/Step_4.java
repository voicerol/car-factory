public class Step_4{
    public static void main(String[] args) {
    int currentYear = 2023,TargetProduction = 1000,CurrentProductionPerDay = 10;
    boolean factoryStatus = true;
    int quantityProduct = 0;
    final int dailyNormProduct = 10;

    // Scenario: Print the production years for the next 5 years
    System.out.println("Production Years for the Next 5 Years:\n");
    for (int i = 0; i <= 5; i++) {
        System.out.println(currentYear + i);
    }

    // Scenario: Print the number of cars produced until reaching the target
    System.out.println("\n\tProduct Progress: \n");
    while (CurrentProductionPerDay <= TargetProduction) {
        System.out.println("Current Production: " + CurrentProductionPerDay + " cars\n\n");
        CurrentProductionPerDay += 10;
    }

    // Scenario: Produce a product while the factory is running;
    // if production exceeds the daily norm, stop production.
    System.out.println("Quantity Product in day:\n");
    do {
        quantityProduct ++;
        System.out.println("Quantity Product in day: " + quantityProduct + "\n");
        if (quantityProduct >= dailyNormProduct){
            break;
        }
    }
    while(factoryStatus);
    }
}