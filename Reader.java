package Objects.Project;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader extends Human {
    private ArrayList<Book> listBorrow =new ArrayList<Book>();
    private ArrayList<Book> listPurchasing = new ArrayList<Book>();
    private String userName;
    private String password;
    Scanner in= new Scanner(System.in);

    public Reader(){}
    
    public Reader(String name, String yearOfBirth, String phone, String address,String userName,String password){
        super(name, yearOfBirth, phone, address);
        this.password=password;
        this.userName=userName;
    }
    
    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int logIn() {
        String a;
        String b;
        for(int p=0;p<=10;p++){
            System.out.print("Enter your name login: ");
            a= in.nextLine();
            System.out.print("Enter your pass word: ");
            b= in.nextLine();
            if(p==10){
                System.out.println("You are accessing unauthorized or maybe you do not have an account\n");
                return 0;
            }
            if(userName.equals(a) && password.equals(b)){
                System.out.println("----- Congratulations, you have successfully logged in -----\n"); 
                return 1;
            }
            else{
                System.out.println("----- You entered it wrong, please re-enter it-----\n");
            }
        }
        return 0;   
    }
    
    public void register(){
        System.out.print("Please enter your username : ");
        userName= in.nextLine();
        System.out.print("Enter your password : ");
        password= in.nextLine();
       
        System.out.print("Your name: ");
        this.name=input.nextLine();
        System.out.print("Your year of birth: ");
        this.yearOfBir=input.nextLine();
        System.out.print("Your phone: ");
        this.phone=input.nextLine();
        System.out.print("Your address: ");
        this.address=input.nextLine();
        
        System.out.println("------ Successfully entered information -------");
    

        System.out.println("------** Sign Up Success **-------\n");
    }
    public void register(Reader another){
        System.out.print("Please enter your username : ");
        userName= in.nextLine();
        System.out.print("Enter your password : ");
        password= in.nextLine();
      
        System.out.print("Your name: ");
        this.name=input.nextLine();
        System.out.print("Your year of birth: ");
        this.yearOfBir=input.nextLine();
        System.out.print("Your phone: ");
        this.phone=input.nextLine();
        System.out.print("Your address: ");
        this.address=input.nextLine();
        
        System.out.println("------ Successfully entered information -------");
    

        System.out.println("------** Sign Up Success **-------\n");
    }
    public void borrowBooks(){
        Librarian.bookStatistics();
        System.out.print("Number of book you want to borrow : ");
        int number2= in.nextInt();
        int choose2;
        for(int i=0;i<number2;i++){
            do{
                System.out.print("Which book would you like to borrow? Please select its serial number : ");
                choose2= in.nextInt();
                if(choose2< 0 || choose2>Librarian.listBook.size()){
                    System.out.println("\n====> Number not found in the library.Please choose again\n");
                }
            }
            while(choose2< 0 || choose2>Librarian.listBook.size());
            for(int n =0;n<Librarian.listBook.size();n++){
                if(n==choose2-1){
                    Librarian.listBook.get(n).reduceQuantity(1);
                    listBorrow.add(Librarian.listBook.get(n));
                }
            }
        }
        System.out.println("Successfully borrowed the book\n");
        System.out.println("----- The books you have borrowed below ------");
        for(int i=0;i<listBorrow.size();i++){
            System.out.println((i+1)+". "+listBorrow.get(i).toString1());
        }
    }
    public void purchasingBook(){
        Librarian.bookStatistics();
        System.out.print("Number of book you want to purchasing : ");
        int number3= in.nextInt();
        int chooose3;
        for(int i=0;i<number3;i++){
            do{
                System.out.print("Which book would you like to purchasing ? Please select its serial number : ");
                chooose3= in.nextInt();
                if(chooose3< 0 || chooose3>Librarian.listBook.size()){
                    System.out.println("\n====> Number not found in the library.Please choose again\n");
                }
            }
            while(chooose3< 0 || chooose3>Librarian.listBook.size());
            for(int n =0;n<Librarian.listBook.size();n++){
                if(n==chooose3-1){
                    Librarian.listBook.get(n).reduceQuantity(1);
                    listPurchasing.add(Librarian.listBook.get(n));
                }
            }
        }
        System.out.println("Bought the book successfully\n");
        System.out.println("----- The books you have bought below ------");
        for(int i=0;i<listPurchasing.size();i++){
            System.out.println((i+1)+". "+listPurchasing.get(i).toString1());
        }
    }
    public void returnBook(){
        int nhap,choose4;
        for(int n =0;n<listBorrow.size();n++){
            System.out.println((n+1)+". "+ listBorrow.get(n).toString1());
        }
        System.out.print("What kind of books do you return? Please select:");
        nhap= in.nextInt();       
        for(int e=0;e<nhap;e++){
            do{
                System.out.print("Select the order number of the book you want to return "+(e+1)+" : ");
                choose4= in.nextInt();
                if(choose4<= 0 || choose4>listBorrow.size()){
                    System.out.println("\n====> Number not found in the story.Please choose again\n");
                }
            }
            while(choose4<0 || choose4>listBorrow.size());
            for(int j =0;j<listBorrow.size();j++){
                if(j==choose4-1){
                    Librarian.listBook.get(j).addQuantity(1);
                }
            }
        }
        System.out.println("Successfully returned the book\n");
    }
    public String toString2(){
        return "Reader's name is "+ getName()+" || Reader's year of birth is "+ getYearOfBir()+ " || Reader's phone number is "+ getPhone()+" || Reader's address is"+getAddress();
    }
    public String toString3(){
        return "Reader's name is "+ getName();
    }
}