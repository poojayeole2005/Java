import java.util.Scanner;

public class Calculator {
/**
 * @param args
 */
public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
        int ans= 0;
        while (true) {
            System.out.println("Enter the operator");
            char op= in.next().trim().charAt(0);
            System.out.println();
            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%')
            {
                System.out.println("Enter two numbers");
                int num1 = in.nextInt();
               int num2 = in.nextInt();

                if (op=='+') {
                    ans=num1 + num2;
                }
                
                if (op=='-') {
                    ans=num1 - num2;
                }
                if (op=='*') {
                    ans=num1 * num2;
                }
                if (op=='/') {
                    if (num2 !=0) {
                        ans=num1 / num2;

                    }
                }
                if (op=='%') {
                    ans=num1 % num2;
                }
                else if (op=='x' || op=='X') {
                    break;
                    
                }else {
                    System.out.println("Invalid Operator");
                }
            
            }
            System.out.println(ans);
            
        }
    }
}
}
