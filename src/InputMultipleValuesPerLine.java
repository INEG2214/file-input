import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputMultipleValuesPerLine {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("data/material.txt");
        Scanner scnr = new Scanner(fis);

        String materialName = "";
        double materialValue = 0.0;
        int materialUnits = 0;
        int sum = 0;
        int count = 0;

        while (scnr.hasNext()) {
            materialName = scnr.next();
            materialValue = scnr.nextDouble();
            materialUnits = scnr.nextInt();
            sum=sum+materialUnits;
            count++;
            System.out.printf("%s %.1f %d %d %d%n", materialName, materialValue, materialUnits, sum, count);
        }
    }
}
