import java.time.LocalDate;

public class Admin extends User {
    public Admin(){
        super();
    }

    public Admin(String name, int year, int month, int day){
        super(name, year, month, day);
    }
    public void displayInfo(){
        System.out.println("User type: admin.");
        super.displayInfo();

    }

    public void displayInfo(boolean full){
        if(full){
            this.displayInfo();
            System.out.println("Today's date: " + LocalDate.now());
        }else{
            System.out.println("Admin's name: " + name);
        }
    }

    public void displayHappyBirthday() {
        int age = LocalDate.now().getYear() - dob.getYear();
        if(isBirthday()) {
            System.out.println("Happy birthday " + this.name + "! You are " + age + "!");
        }else{
            System.out.println("Today is not " + this.name + " Birthday !");
        }
    }
}