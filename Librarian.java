package Objects.Project;
import java.util.ArrayList;
import java.util.Scanner;

public class Librarian extends Human {
    static ArrayList<Book> listBook = new ArrayList<Book>();
    Scanner in = new Scanner(System.in);
    private final String nameLogin1="Tuyen";
    private final String nameLogin2="Ngan Nguyen";
    private final String password1="mk1";
    private final String password2="mk2";
    public Librarian() {}
    public Librarian(String name,String yearOfBirth, String phone, String address){
        super(name, yearOfBirth, phone, address);
    }

    @Override
    public int logIn() {
        String a;
        String b;
        for(int t=0; t<=10;t++){
            System.out.print("Enter your name login: ");
            a= in.nextLine();
            System.out.print("Enter your pass word: ");
            b= in.nextLine();
            if(t==10){
                System.out.println("You are logging in without permission\n");
                return 0;
            }
            if((nameLogin1.equals(a) && password1.equals(b)) || (nameLogin2.equals(a) && password2.equals(b))){
                System.out.println("----- Congratulations, you have successfully logged in -----\n"); 
                return 1;
            }
            else{
                System.out.println("You are logging in without permission\n");            }
        }
        return 0;
    }
    public void addBook(){
        System.out.print("Number of book you want to enter : ");
        int n= in.nextInt();
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print("<<<<<<<<<< Enter the information of book _"+(i+1) +"_ >>>>>>>>>\n");
            Book a=new Book();
            a.inputInfor();
            listBook.add(a);

        }
    }
    public static void bookStatistics(){
        for(int i=0;i<listBook.size();i++){
            System.out.println((i+1)+"."+listBook.get(i).toString1());
        }
        System.out.println("                            -------------------------- END ------------------------\n");
    }
    public void removeBook(){
        int choose, number;
        Librarian.bookStatistics();
        System.out.print("Number of book you want to remove : ");
        number= in.nextInt();
        for(int k=0;k<number;k++) {
            do{
                System.out.print("Select the serial number of the book you want to delete " +(k+1)+" : ");
                choose=in.nextInt();
                if(choose< 0 || choose>listBook.size()){
                    System.out.println("\n====> Number not found in the library.Please choose again\n");
                }
            }
            while(choose< 0 || choose>listBook.size());
           
            System.out.println("Do you want to delete all of these books or just a few?");
            int b, r;
            do{
                System.out.println("1. Delete all\n2. Just a few");
                System.out.print("Please choose : ");
                b = in.nextInt();
                if(b< 1 || b> 2){
                    System.out.println("Invalid value.");
                }
            }
            while(b< 1 || b> 2);
            if(b==1){
                listBook.remove(choose-1);
                System.out.println("--- Successfully deleted ---");
            }
            else{
                System.out.print("How much do you want to reduce? : ");
                r = in.nextInt();
                listBook.get(choose-1).reduceQuantity(r);
                System.out.println("--- Successfully deleted ---");
            }
        }
    }
}