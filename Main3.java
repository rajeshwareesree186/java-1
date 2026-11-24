public class Main3 {

    public static void main(String [] args)
    {
        Payment[] payments = {
             new CreditCard(),
              new  UPI() 
            };

        for(int i=0; i<2 ; i++)
        {
            payments[i].pay(500.0);
        }
    }
    
}
class Payment
{
    void pay(double amount)
    {
        System.out.println("Processing generic payment of ₹" + amount);
    }
}

class CreditCard extends Payment
{
    @Override 
    void  pay(double amount)
    {
        System.out.println("Paid ₹" + amount + " via Credit card ");
    }
}

class UPI extends Payment
{
   @Override 
    void  pay(double amount)
    {
        System.out.println("Paid ₹" + amount + " via UPI");
    } 
}