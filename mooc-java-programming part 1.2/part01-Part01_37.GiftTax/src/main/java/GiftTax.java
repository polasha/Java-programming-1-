
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int data = Integer. valueOf(scan.nextLine());
        
        if(data< 5000){
            System.out.println("No tax!");
        }else if (data>=5000 && data<=25000 ) {
            double tax = 100 + (data-5000)*0.08;
            System.out.println("Tax: " + tax);
        
        }else if (data>=25000 && data<=55000 ) {
            double tax = 1700 + (data-25000)*0.10;
            System.out.println("Tax: " + tax);
            
        }else if (data>=55000 && data<=200000 ) {
            double tax = 4700 + (data-55000)*0.12;
            System.out.println("Tax: " + tax);
            
        }else if (data>=200000 && data<=1000000 ) {
            double tax = 22100 + (data-200000)*0.15;
            System.out.println("Tax: " + tax);
            
        }else if (data>=1000000) {
            double tax = 142100 + (data-1000000)*0.17;
            System.out.println("Tax: " + tax);
            
        }

    }
}
