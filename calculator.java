import java.util.*;
public class calculator {
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter the a: ");

     int a = sc.nextInt();
        
     System.out.print("Enter the b: ");

     int b = sc.nextInt();

     System.out.print("Enter the opreator: ");
     String operator = sc.next();
     
     switch (operator) {
        case "+":
            {
                System.out.println("Addition:" + (a+b));
                break;
            }
            
        case "-":
            {
            System.out.println("subtraction:" + (a-b));
            break;
            }
        case "*":
        {
            System.out.println("Multiplication:" + (a*b));
            break;
        }
        
        case "/":
        {
            System.out.println("Division:" + (a/b));
            break;
        }
        
        case "%":
        {
            System.out.println("Modulo:" + (a%b));
            break;
        }
        
        default:
        {
            System.out.println("invalid operator");
        }
            
     }
    }
    }
        