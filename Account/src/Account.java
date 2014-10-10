import java.util.Date;

public class Account
{
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Account()
    {

    }

    public Account(int Id, double Balance, double annualInterestRate)
    {
        id = Id;
        balance = Balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new Date();
    }

    public void setID (int Id)
    {
        id = Id;
    }

    public int getID()
    {
        return id;
    }

    public void setBalance (double newBalance)
    {
        balance = newBalance;
    }

    public double getbalance()
    {
        return balance;
    }

    public void setAnnualInterestRate (double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    public Date getDateCreated()
    {
        return dateCreated;
    }

    public double getMonthlyInterestRate()
    {
        return annualInterestRate / 12;
    }

    public void withdraw(double amount)
    {
        balance -= amount;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }
}