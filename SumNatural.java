import java.util.Scanner;
public class SumNatural {
  public static void main(String[] args) {
    int n;
    Scanner s=new Scanner(System.in);
    System.out.print("enter the value of n:");
    n=s.nextInt();

    int sum = n*(n+1)*(2*n+1)/6;

    System.out.println("Sum is: " + sum);
  }
}