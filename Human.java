package Objects.Project;

import java.util.Scanner;

public abstract class Human {
    protected String name;
    protected String yearOfBir;
    protected String phone;
    protected String address;
    Scanner input=new Scanner(System.in);

    public Human(){
    }
    public Human(String nameOfYou, String yearOfBirth, String phones, String addressOY){
        name = nameOfYou;
        yearOfBir = yearOfBirth;
        phone = phones;
        address = addressOY;
    }

    public String getName() {
        return name;
    }
    public void setName(String nameOfYou) {
        name = nameOfYou;
    }
    public String getYearOfBir() {
        return yearOfBir;
    }
    public void setyearOfBir(String yearOfBirth) {
        yearOfBir = yearOfBirth;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phones) {
        phone = phones;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String addressOY) {
        address = addressOY;
    }

    public abstract int logIn();
}