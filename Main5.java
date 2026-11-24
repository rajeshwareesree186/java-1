public class Main5 {

    public static void main(String [] args)
    {
        Student s1 = new Student("Raj",100);
        Student s2 = new Student("Leela",98);


        s1.showresult();
        s2.showresult();
    }
    
}


class Student 
{
    String name;
    double marks;
    
    Student(String name,double marks)
    {
        this.name=name;
        this.marks=marks;
    }

    void showresult()
    {
        System.out.println("nmae:"+name);
        System.out.println("Marks:"+marks);
    }
}


