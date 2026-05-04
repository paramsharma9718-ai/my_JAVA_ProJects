import java.util.*;

class Bank
{
    private String name;
    private int balance;

    public void setName(String name){
        if(name.matches("[a-zA-Z ]+")){ 
            this.name = name;
        }else{
            System.out.println("Invalid Name");
        }
    }
     
    public String getName(){
        return name;
    }

    public void setBalance(int balance){
        if(balance>0){
        this.balance = balance;
        }else{
            System.out.println("INVALID BALANCE");
        }
    }

    public int getBalance(){
        return balance;
    }
    

    public void deposit(int amount)
    {
        if(amount<=0){
            System.out.println("invalid amount");
        }else{
            balance+=amount;
            System.out.println("Amount Deposited = "+amount);
            System.out.println("Total Balance = "+balance);
        }
    }

    void withdraw(int amount)
    {
        if(amount>balance){
            System.out.println("Insufficient Balance");
        }else{
            balance-=amount;
            System.out.println("Withdrawed Amount ="+amount);
            System.out.println("Total Balance ="+balance);
        }
    }

    void checkbalance()
    {
        System.out.println("Total Balance ="+getBalance());
    }
}


public class BankAcc
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NAME");
        String name = sc.nextLine();

        System.out.println("ENTER CURRENT BALANCE");
        int balance = sc.nextInt();

        Bank p = new Bank();
        p.setName(name);
        p.setBalance(balance);
        int choice;

        do{
            System.out.println("\n===== MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to be deposited");
                    int dep = sc.nextInt();
                    p.deposit(dep);
                    break;
                case 2:
                    System.out.println("Enter amount to be withdrawn");
                    int wit = sc.nextInt();
                    p.withdraw(wit);
                    break;
                case 3:
                    p.checkbalance();
                    break;
                case 4:
                    System.out.println("THANK YOUUU!!!");  
                    break;      
                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }

        }while(choice!=4);
        sc.close();
    }
}

