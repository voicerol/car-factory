public class Step_6 {

    // Scenario 1: One-dimensional array manipulation for car models
    public static String[] carModels() {
        String[] carModels = new String[5]; // Create a one-dimensional array for car models

        // Add elements to the array
        carModels[0] = "Toyota: ";
        carModels[1] = "BMW: ";
        carModels[2] = "Volvo: ";
        carModels[3] = "Ferrari: ";
        carModels[4] = "Tesla Truck: ";

        return carModels; // Return array
    }

    // Scenario 2: Two-dimensional array manipulation for car production data
    public static int[][] carProductionData() {
        int[][] carProductionData = new int[5][4]; // Create a two-dimensional array for car production data

        // Add elements to the array
        for (int i = 0; i < carProductionData.length; i++) {
            for (int j = 0; j < carProductionData[i].length; j++) {
                carProductionData[i][j] = (i + 1) * (j + 1) * 100; // Placeholder data
            }
        }

        // Edit elements in a loop (adjust production numbers)
        for (int i = 0; i < carProductionData.length; i++) {
            for (int j = 0; j < carProductionData[i].length; j++) {
                carProductionData[i][j] += 50; // Increment production numbers
            }
        }

        return carProductionData; // Return the modified array
    }

    // Scenario 3: 
    // Combine two arrays into a single array
    public static Object[] combineArrays(String[] array1, int[][] array2) {
        return new Object[]{array1, array2};
    }

    public static void main(String[] args) {
        // Call the method to get arrays
        String[] cars = carModels();
        int[][] carData = carProductionData();
        // Combine arrays into a single array
        Object[] combinedArrays = combineArrays(cars, carData);

        // Unpack the combined array in main
        String[] carsCombined = (String[]) combinedArrays[0];
        int[][] carDataCombined = (int[][]) combinedArrays[1];

        // Print arrays
        for (int i = 0; i < carsCombined.length; i++) {
            System.out.printf(carsCombined[i]);
            for (int j = 0; j < carDataCombined[i].length; j++) {
                System.out.print(carDataCombined[i][j] + " ");
            }
            System.out.println();
        }
    }
}

