import javax.jws.soap.SOAPBinding;

public class Main {
    public static void main(String[] args) {

        //------------------------------------Q1--------------------------------

        Book b1=new Book("book1",25.3,"author1");
        Movie m1=new Movie("move1",90.2,"director1");

        System.out.println("Discount for the book "+b1.getName()+": "+b1.getDiscount());
        System.out.println("Discount for the movie "+m1.getName()+": "+m1.getDiscount());

        //------------------------------------Q2--------------------------------

        System.out.println(" //------------------------------------Q2--------------------------------\n");
        MovablePoint m2=new MovablePoint(4,3,6,5);



        System.out.println("x speed :" +m2.getxSpeed());
        m2.moveLeft();
        m2.moveRight();
        System.out.println("y speed :" +m2.getySpeed());
        m2.moveUp();
        m2.moveDown();















    }
}