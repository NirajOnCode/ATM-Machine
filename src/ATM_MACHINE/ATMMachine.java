package ATM_MACHINE;

import java.util.Scanner;

class ATM
{
    float Balance;
    int PIN=3435;

    public void checkpin()
    {
        System.out.println(" *** Enter your PIN: *** ");
        Scanner sc=new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin==PIN)
        {
            menu();
        }
        else
        {
            System.out.println(" *** Enter a valid PIN *** ");
            checkpin();
        }
    }

    public void menu()
    {
        System.out.println(" ********** Enter your Choice: ********** ");
        System.out.println("1. Check A/C Balance: ");
        System.out.println("2. Withdraw Money: ");
        System.out.println("3. Deposit Money: ");
        System.out.println("4. Exit");

        Scanner sc=new Scanner(System.in);
        int opt =sc.nextInt();

        if(opt ==1)
        {
            checkbalance();
        }
        else if(opt ==2)
        {
            withdrawMoney();
        }
        else if(opt ==3)
        {
            depositMoney();
        }
        else if(opt == 4)
        {
            return;
        }
        else
        {
            System.out.println(" *** Enter the valid choice *** ");
            menu();
        }
    }


    public void checkbalance()
    {
        System.out.println("Balance: "+Balance);

        Scanner sc=new Scanner(System.in);
        System.out.println(" ***** DO YOU WANT TO GO BACK TO THE MENU ***** ");
        String yesno=sc.next();
        if(yesno.equals("yes"))
        {
            menu();
        }
        else if (yesno.equals("no"))
        {
            System.out.println(" *** THANKS FOR TRANSACTION *** ");
            return;
        }
    }
    public void withdrawMoney()
    {
        System.out.println("enter Amount to Withdraw: ");
        Scanner sc= new Scanner(System.in);
        float amount= sc.nextInt();
        if(amount>Balance)
        {
            System.out.println("Insufficient Balance");
        }
        else {
            Balance=Balance-amount;
            System.out.println("Money Withdraw Successfully");
        }
        System.out.println(" ***** DO YOU WANT TO GO BACK TO THE MENU ***** ");
        String yesno=sc.next();
        if(yesno.equals("yes"))
        {
            menu();
        }
        else if (yesno.equals("no"))
        {
            System.out.println(" *** THANKS FOR TRANSACTION *** ");
            return;
        }
    }

    public void depositMoney()
    {
        System.out.println("Enter the Amount: ");
        Scanner sc= new Scanner(System.in);
        float amount = sc.nextInt();
        Balance=Balance+amount;
        System.out.println("Money Deposit Successfully");

        System.out.println(" ***** DO YOU WANT TO GO BACK TO THE MENU ***** ");
        String yesno=sc.next();
        if(yesno.equals("yes"))
        {
            menu();
        }
        else if (yesno.equals("no"))
        {
            System.out.println(" *** THANKS FOR TRANSACTION *** ");
            return;

        }
    }
}

public class ATMMachine {
    public static void main(String[] args) {
        ATM obj= new ATM();
        obj.checkpin();
    }
}
