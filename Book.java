package Objects.Project;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private float price;
    private String type;
    private int quantity;
    Scanner in=new Scanner(System.in);

    public Book(){

    }
    public Book(String title, String author, float price, String type, int quantity){
        this.title= title;
        this.author= author;
        this.price = price;
        this.type = type;
        this.quantity= quantity;
    }

    public String getAuthor() {
        return author;
    }
    public float getPrice() {
        return price;
    }
    public String getTitle() {
        return title;
    }
    public String getType() {
        return type;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void reduceQuantity(int number){
        this.quantity=quantity-number;
    }
    public void addQuantity(int number){
        this.quantity=quantity+number;
    }
    public void inputInfor(Book another){
        System.out.print("Enter title: ");
        another.setTitle(in.nextLine());
        System.out.print("Enter author: ");
        another.setAuthor(in.nextLine());
        System.out.print("Enter price: ");
        another.setPrice(in.nextFloat());
        System.out.print("Enter type: ");
        another.setType(in.nextLine());
        System.out.println("Enter quantity of book: ");
        another.setQuantity(in.nextInt());

        System.out.println("-------- Enter information for book successful  --------");
        System.out.println();
    }
    public void inputInfor(){
        System.out.print("Enter title: ");
        this.title=in.nextLine();
        System.out.print("Enter author: ");
        this.author=in.nextLine();
        System.out.print("Enter price: ");
        this.price=in.nextFloat();
        in.nextLine();
        System.out.print("Enter type of book: ");
        this.type=in.nextLine();
        System.out.print("Enter quantity of book: ");
        
        System.out.println("-------- Enter information for book successful  --------");
        System.out.println();
    }
    public String toString1() {
      return "Book title is "+getTitle()+" || The author of the book is "+getAuthor()+" || The type of the book is "+getType()+" || The price of the book is "+getPrice()+ " || The quantity of book is "+getQuantity();
    }
}