
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year:");
        int data = Integer.valueOf(scan.nextLine());
        if ((data % 4 == 0) && (data % 100 != 0) || (data % 400 == 0) ){
            System.out.println("The year is  a leap year.");
            
        }else {
            System.out.println("This year is not  a leap year.");
        }
        
        

    }
}
