public class Main2
{
 
    public static void main(String [] args)
    {
        Book b3 = new Book();
       Book b1 = new Book("Atomic habits");
       Book b2 = new Book("Atomic habits",200);

       b1.display();
       b2.display();
       b3.display();

    }
}

class Book
{

    String title;
    double  price;

    Book()
    {
        title = "UNKNOWN";
        price = 0.0;
    }

    Book( String title)
    {
       this.title=title; 
       price =0.0;
    }

    

    Book(String title , double price)
    {
        this.title = title;
        this.price = price;
    }

    void display()
    {
       System.out.println("title:"+ title);
       System.out.println("Price"+ price); 
       
    }
}
