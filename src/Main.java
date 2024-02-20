import pack.assembly.*;
import pack.parts.*;
import java.util.Scanner;

class CarFactoryMain {
    public static void main(String[] args) {

        AssemblyLine assemblyLine = new AssemblyLine();
        QualityControl qualityControl = new QualityControl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Car factory main program running.");

        System.out.println(assemblyLine);
        System.out.println(qualityControl);
        scanner.close();
    }
}