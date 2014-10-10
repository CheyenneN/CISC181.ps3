public class Test{

    public static void main(String[] args)
    {
        Account account = new Account(1122, 20000, 0.045);

        account.setID(1122);
        account.setBalance(20000);
        account.setAnnualInterestRate(0.045);



        System.out.println ("Account number: \n"+ +account.getID());
        System.out.println ("The account balance is: $ \n" + +account.getbalance());
        System.out.println("The Annual Interest Rate is: $ \n" + account.getAnnualInterestRate());
        account.deposit(2500);
        System.out.println("The account balance is: $ \n" +account.getbalance());
        account.withdraw(3000);
        System.out.println("The account balance is: $ \n" +account.getbalance());
        System.out.println ("The monthly interest earned is: $ \n" + +account.getbalance() *    account.getAnnualInterestRate());
        System.out.println ("The account was created on: \n" + account.getDateCreated());

    }



}