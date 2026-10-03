//Water Billing System.Hackathon
//1A Data Types;
import java.util.Scanner;
public class Hakathon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           System.out.println("Enter the number of family numbers");
          int family=sc.nextInt();
          System.out.println("enter the water consumption ");
          double waterConsumed=sc.nextDouble();
          System.out.println("Enter the house number");
          int houseNo=sc.nextInt();
          System.out.println("Enter the usage status");
          //H-HIGH USAGE,M-MEDIUM USAGE,L-LESS USAGE;
          char usage=sc.next().charAt(0);
        //display
        System.out.println("Family Members: "+family);
        System.out.println("Water Consumed: "+waterConsumed);
        System.out.println("House number: "+houseNo);
        System.out.println("water usage:"+ usage);
   




    }
}

