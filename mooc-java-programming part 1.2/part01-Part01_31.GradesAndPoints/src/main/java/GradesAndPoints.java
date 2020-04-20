
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]: ");
        int data = Integer.valueOf(scan.nextLine());
        if (data < 0) {
            System.out.println("Grade: impossible!");
        } else if (data <= 49){
            System.out.println("Grade: failed");
        } else if (data <= 59) {
            System.out.println("Grade: 1");
        } else if (data <= 69) {
            System.out.println("Grade: 2");
        } else if (data<= 79){
            System.out.println("Grade: 3");
        } else if (data <= 89){
            System.out.println("Grade: 4");
        } else if (data <= 100){
            System.out.println("Grade: 5");
        } else if (data>100){
            System.out.println("Grade: incredible");
        }

    }
}
