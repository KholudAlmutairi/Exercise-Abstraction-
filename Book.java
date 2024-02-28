public class Book extends Product {
    private String author;

    public Book() {

    }

    public Book(String author) {
        this.author = author;
    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double getDiscount() {
        double discountPercentage = 10;
        double discountAmount = getPrice() * (discountPercentage / 100);
        return discountAmount;
    }
}
