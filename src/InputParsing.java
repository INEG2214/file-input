import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputParsing {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("data/material.txt");
        Scanner scnr = new Scanner(fis);

        String[] inputLine;
        String materialName = "";
        double materialValue = 0.0;
        int materialUnits = 0;

        while (scnr.hasNextLine()) {
            inputLine = scnr.nextLine().split(" ");
            materialName = inputLine[0];
            materialValue = Double.valueOf(inputLine[1]);
            materialUnits = Integer.valueOf(inputLine[2]);
            System.out.printf("%s %.1f %d%n", materialName, materialValue, materialUnits);
        }
    }
}
