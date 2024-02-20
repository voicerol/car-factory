package pack.assembly;

import pack.parts.Engine;
import java.util.Scanner;

public class AssemblyLine {

    public static void AssemblyLine() {
        Engine engineDisplay = new Engine();
        System.out.println(engineDisplay);
        System.out.println("Assembly line initialized.");
    }
}