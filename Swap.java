import java.util.Scanner;

public class Swap {
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter First Number" );

    int a = in.nextInt();
    System.out.println("Enter Second Number" );

    int b = in.nextInt();

    int temp = a;
    a=b ;
    b= temp;

    System.out.println(a + " " + b);
 }
}
