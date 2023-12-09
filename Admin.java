package Objects.Project;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends Human {
    Scanner in= new Scanner(System.in);
    private String adPassWord="123";
    public static ArrayList<Reader> accountReaders = new ArrayList<Reader>();

    public Admin(){
        super();
    }
    public Admin(String name, String yearOfBirth, String phone, String address){
        super(name, yearOfBirth, phone, address);
    }

    @Override
    public int logIn() {
        String mk;
        for(int y =0;y<6;y++){
            System.out.print("Enter admin password : ");
            mk=in.nextLine();
            if(adPassWord.equals(mk)){
                System.out.print("----- Congratulations, you have successfully logged in -----\n");
                return 1;
            }
            else{
                System.out.print("----- You entered it wrong, please re-enter it-----\n");
            }
            if(y==5){
                System.out.println("You are accessing unauthorized\n");
                return 0;
            }
        }
        return 0;
    }
    public static void addReader(){
        System.out.println("----- Hello Admin. Someone wants to create an account ------");
        Reader r1=new Reader();
        accountReaders.add(r1);
        r1.register();
    }
    public void removeReader(){
        int choose5;
        boolean check=true;
        while(check){
            Admin.displayReaders();
            do{
                System.out.print("Select the serial number of reader you want to delete  : ");
                choose5=in.nextInt();
                if(choose5<1 || choose5>accountReaders.size()){
                    System.out.println("\n====> Number not found in the list. Please choose again\n");
                }
            }
            while(choose5< 1 || choose5>accountReaders.size());
            for(int n =0; n<accountReaders.size();n++){
                if(n == choose5-1){
                    accountReaders.remove(n);
                    System.out.println("------- Successfully deleted -------");
                }
            }
            System.out.print("Do you want to delete more?\n1. Yes\n2. No\nPlease choose: ");
            int t=in.nextInt();
            while(t<=0 || t>2){
                 System.out.print("Invalid value.Please re-enter:");
                 t=in.nextInt();
            }
            if(t==2){
                check=false;
            }
        }
    }
    public static void displayReaders(){
        for(int i =0; i<accountReaders.size();i++){
            System.out.println((1+i)+". "+accountReaders.get(i).toString2());
        } 
    }
    public static void displayReader1(){
        for(int i =0; i<accountReaders.size();i++){
            System.out.println((i+1)+". "+accountReaders.get(i).toString3());
        }
    }
}