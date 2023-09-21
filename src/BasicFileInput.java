
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BasicFileInput {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("data/years.txt");
        Scanner scnr = new Scanner(fis);

        while (scnr.hasNextDouble()) {

            int nextValue = scnr.nextInt();
            System.out.println(nextValue);
        }
    }
}
