import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner kb= new Scanner(System.in);
	    double total=0;
	    int q=0;
	    System.out.println("Enter the price of item 1: ");
	    System.out.println("Enter the quantity of item 1: ");
	    total+= q*kb.nextInt();
	    q=0;
	    System.out.println("Enter the price of item 2: ");
	    System.out.println("Enter the quantity of item 2: ");
	    total+= q*kb.nextInt();
	    q=0;
	    System.out.println("Enter the price of item 3: ");
	    System.out.println("Enter the quantity of item 3: ");
	    total+= q*kb.nextInt();
	    q=0;
	    double tax= 0.05*total;
	    System.out.println("Subtotal: $"+total+"\n"+"Tax: $"+tax+"\n"+"Total: $"+(total+tax));
    }
}
