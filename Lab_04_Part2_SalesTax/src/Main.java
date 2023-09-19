
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    //Variables
    double price;
    double postTax;
    double tax;
    System.out.println("Please enter price of purchase: ");
    price = scan.nextDouble();
    tax = price * .05;
    postTax = price + tax;
    System.out.println("Your cost after tax is: $" + postTax + "." );




}
}