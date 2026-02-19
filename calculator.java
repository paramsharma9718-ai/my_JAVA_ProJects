import java.util.*;
class calculator{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ENTER 1st NUMBER");
        int a = sc.nextInt();

        System.out.println("ENTER 2nd NUMBER");
        int b = sc.nextInt();

        System.out.println("CHOOSE AN OPERATOR => + , - , * , / ");
        char c = sc.next().charAt(0);

        switch(c){
            case '+':
                System.out.println("SUM = "+(a+b));
                break;
            case '-':
                System.out.println("DIFFERENCE = "+(a-b));
                break;  
            case '*':
                System.out.println("MULTIPLICATION = "+(a*b));
                break;
            case '/':
                System.out.println("DIVISION = "+(a/b)); 
                break;
            default:
                System.out.println("INVALID OPERATOR");   
                break;          
        }
        sc.close();
    }
}