package Objects.Project;

import java.util.Scanner;

public class TestProject {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int letgo,location,recognize,nb1;
        boolean stop=true, a=true;
        String ask;

        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 9.99f, "Fiction", 10);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 7.99f, "Fiction", 5);
        Book book3 = new Book("The Art of War", "Sun Tzu", 5.99f, "Non-fiction", 3);
        Book book4 = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 12.99f, "Science fiction", 8);
        Book book5 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 19.99f, "Fantasy", 12);
        Librarian.listBook.add(book1);
        Librarian.listBook.add(book2);
        Librarian.listBook.add(book3);
        Librarian.listBook.add(book4);
        Librarian.listBook.add(book5);

        Librarian librarian1 = new Librarian("Nguyen Thi Kim Tuyen", "2004","0234278498","101B_Le Huu Trac");
        Librarian librarian2 = new Librarian("Nguyen Ngan","2003","0942345234","102B_Le Huu Trac");

        Reader reader1 = new Reader("Nguyen Van A", "1990", "0901234567", "Ha Noi", "reader1", "123456");
        Reader reader2 = new Reader("Tran Thi B", "1995", "0987654321", "Ho Chi Minh", "reader2", "abcdef");
        Admin.accountReaders.add(reader1);
        Admin.accountReaders.add(reader2);
        Admin.displayReader1();

        while(stop){     
            System.out.println("\n------------------------***** Welcome to My Library Manager App *****------------------------\n");
            System.out.print("Who are you?\n1. Admin\n2. Reader\n3. Librarian\nPlease choose :");
            letgo=sc.nextInt();
            switch (letgo){
                case 1:
                   
                    Admin a1=new Admin();
                    if(a1.logIn()==1){
                        while(a){
                            System.out.print( "\nWhat function do you want to perform?\n1. Add Reader\n2. Remove Reader\n3. Display Readers\n\nPlease choose:");
                            nb1=sc.nextInt();
                            while(nb1<=0 || nb1>3){
                                System.out.print("Invalid value.Please re-enter:");
                                nb1=sc.nextInt();
                            }
                            if(nb1==1){
                                a1.addReader();
                            }
                            else if(nb1==2){
                                a1.removeReader();
                            }
                            else{
                                a1.displayReaders();
                            }
                            System.out.print("Do you want to continue?\n1. Yes\n2. No\nPlease choose: ");
                            int t=sc.nextInt();
                            while(t<=0 || t>2){
                                System.out.print("Invalid value.Please re-enter:");
                                t=sc.nextInt();
                            }
                            if(t==2){
                                a=false;
                            }
                        }
                    }
                    break;
                case 2:
                    a=true;
                    while(a) {
                        System.out.print("Do you already have an account?\n1. Yes\n2. No\nPlease choose: ");
                        int t=sc.nextInt();
                        sc.nextLine();
                        while(t<=0 || t>2){
                            System.out.print("Invalid value.Please re-enter:");
                            t=sc.nextInt();
                        }
                        if(t==1){
                            Admin.displayReader1();
                            System.out.print("Choose the sequence number that is your name: ");
                            location = sc.nextInt();
                            if(Admin.accountReaders.get(location-1).logIn()==1){
                                while(a){
                                    do{
                                        System.out.print("What function do you want to perform?\n1. Borrow book\n2. Purchasing book\n3. Return book\nPlease choose: ");
                                        nb1=sc.nextInt();
                                        if(nb1<1  || nb1>3){
                                            System.out.println("---- You entered wrong. Please re-enter ----");
                                        }  
                                    }
                                    while(nb1<1  || nb1>3);
                                    if(nb1==1){
                                        Admin.accountReaders.get(location-1).borrowBooks();
                                    }
                                    else if(nb1==2){
                                        Admin.accountReaders.get(location-1).purchasingBook();
                                    }
                                    else{
                                    Admin.accountReaders.get(location-1).returnBook();
                                    }
                                    System.out.print("Do you want to continue?\n1. Yes\n2. No\nPlease choose: ");
                                    t=sc.nextInt();
                                    while(t<=0 || t>2){
                                        System.out.print("Invalid value.Please re-enter:");
                                        t=sc.nextInt();
                                    }
                                    if(t==2){
                                        a=false;
                                    }
                                }
                            }
                        }
                        else{
                            a=true;
                            Admin.addReader();
                            Admin.displayReader1();
                            System.out.print("Choose the sequence number that is your name: ");
                            location = sc.nextInt();
                            if(Admin.accountReaders.get(location-1).logIn()==1){
                                while(a){
                                    do{
                                        System.out.print("What function do you want to perform?\n1. Borrow book\n2. Purchasing book\n3. Return book\nPlease choose: ");
                                        nb1=sc.nextInt();
                                        if(nb1<1  || nb1>3){
                                            System.out.println("---- You entered wrong. Please re-enter ----");
                                        }  
                                    }
                                    while(nb1<1  || nb1>3);
                                    if(nb1==1){
                                        Admin.accountReaders.get(location-1).borrowBooks();
                                    }
                                    else if(nb1==2){
                                        Admin.accountReaders.get(location-1).purchasingBook();
                                    }
                                    else{
                                        Admin.accountReaders.get(location-1).returnBook();
                                    }
                                    System.out.print("Do you want to continue ?\n1. Yes\n2. No\nPlease choose: ");
                                    t=sc.nextInt();
                                    while(t<=0 || t>2){
                                        System.out.print("Invalid value.Please re-enter:");
                                        t=sc.nextInt();
                                    }
                                    if(t==2){
                                        a=false;
                                    }
                                }
                            }
                        }
                        System.out.print("Do you want to do the program again?\n1. Yes\n2. No\nPlease choose: ");
                        t=sc.nextInt();
                        while(t<1 || t>2){
                            System.out.print("Invalid value.Please re-enter:");
                            t=sc.nextInt();
                        }
                        if(t==2){
                            a=false;
                        }
                        else{
                            a=true;
                        }
                    }
                    break;
                case 3:
                    a=true;
                    while(a){
                        int t;
                        System.out.print("Who are you ?\n1. "+librarian1.getName()+"\n2. "+librarian2.getName()+"\nPlease choose: ");
                        location=sc.nextInt();
                        while(location<=0 || location>2){
                            System.out.print("Invalid value.Please re-enter:");
                            location=sc.nextInt();
                        }
                        if(location==1){
                            
                            if(librarian1.logIn()==1){
                                while(a){
                                    System.out.print("What function do you want to perform?\n1. Add books\n2. Remove books\n3. Book statistics\nPlease choose: ");
                                    recognize=sc.nextInt();
                                    while(recognize>3 || recognize<1){
                                        System.out.print("Invalid value.Please re-enter:");
                                        recognize=sc.nextInt();
                                    }
                                    if(recognize==1){
                                        librarian1.addBook();
                                    }
                                    else if(recognize==2){
                                        librarian1.removeBook();
                                    }
                                    else{
                                        librarian1.bookStatistics();
                                    }
                                    System.out.print("Do you want to continue?\n1. Yes\n2. No\nPlease choose: ");
                                    t=sc.nextInt();
                                    while(t<=0 || t>2){
                                        System.out.print("Invalid value.Please re-enter:");
                                        t=sc.nextInt();
                                    }
                                    if(t==2){
                                        a=false;
                                    }
                                }
                            }
                        }
                        if(location==2){
                            a=true;
                            if(librarian2.logIn()==1){
                                while(a){
                                    System.out.print("What function do you want to perform?\n1. Add books\n2. Remove books\n3. Book statistics\nPlease choose: ");
                                    recognize=sc.nextInt();
                                    while(recognize>3 || recognize<1){
                                        System.out.print("Invalid value.Please re-enter:");
                                        recognize=sc.nextInt();
                                    }
                                    if(recognize==1){
                                        librarian2.addBook();
                                    }
                                    else if(recognize==2){
                                        librarian2.removeBook();
                                    }
                                    else{
                                        librarian2.bookStatistics();
                                    }
                                    System.out.print("Do you want to continue?\n1. Yes\n2. No\nPlease choose: ");
                                    t=sc.nextInt();
                                    while(t<=0 || t>2){
                                        System.out.print("Invalid value.Please re-enter:");
                                        t=sc.nextInt();
                                    }
                                    if(t==2){
                                        a=false;
                                    }
                                }
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("\nThe value you entered could not be found\n");
            }
            sc.nextLine();
            do{
                System.out.print("Do you want to exit the program?\n1. Yes\n2. No\nPlease choose : ");
                recognize=sc.nextInt();
                if(recognize<=0 || recognize>2){
                    System.out.println("---- You entered wrong. Please re-enter ----");
                }
            }
            while(recognize<=0 || recognize>2);
            if(recognize==1){
                stop = false;
            }
        }
    }
}