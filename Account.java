
import java.io.*;
import java.util.*;
import java.util.Scanner;
class AmountNotInRangeException extends RuntimeException
{
    public String getMessage()
    {
        return "enter lesser amount";
    }
}
class Account
{
    int account_no;
    double balance;
    String name;
    Account(int account_no,double balance,String name)
    {
        this.account_no=account_no;
        this.balance=balance;
        this.name=name;
    }
    void deposit()
    {
        System.out.println("enter how much u want to deposit");
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        System.out.println("amount to deposit:"+amount);
        System.out.println("After deposting:");
        this.balance=this.balance+amount;
        getbalance();
    }
    
    void getbalance()
    {
        System.out.println("the balance is-"+this.balance+"\n");
    }
}

class Savings extends Account
{
    double interest;
    Savings(int account_no,double balance,String name,double interest)
    {
        super(account_no,balance,name);
        this.interest=interest;
    }
    void interest()
    {
        
        System.out.println("do you want to deposit?(yes-1/no-2)");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a == 1)
        {
            deposit();
        }
        
        System.out.println("interest applided is:"+this.interest);
        System.out.println("initial balance:"+super.balance);
        super.balance = super.balance + (super.balance*this.interest)/100 ;
        System.out.print("\nAfter adding interest ");
        getbalance();
    }
}
class Current extends Account
{
    double overdraft;
    Current(int account_no,double balance,String name,double overdraft)
    {
        super(account_no,balance,name);
        this.overdraft = overdraft;
    }
    void withdraw()
    {
        System.out.println("initialize balance:"+super.balance);
        this.overdraft=balance*(this.overdraft/100);
        System.out.println("the amount that can be withdrawed-"+overdraft);
        System.out.println("enter how much you want to withdraw:");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if(a < this.overdraft)
        {
            super.balance = super.balance - a;
            System.out.print("after withdrawing ");
            getbalance();
        }
        else
        {
            throw new AmountNotInRangeException();
        }
    }
    
}
class Test1
{
    public static void main(String[] args)
    {
        Savings a=new Savings(245,2000.0,"jyothi",10.0);
        System.out.println("this is savings account:");
        a.interest();
        
        Current c = new Current(245,2000.0,"jyothi",28.0);
        System.out.println("this is current account:");
        c.withdraw();
    }
}










