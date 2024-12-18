import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;

    User(){
        this.name = null;
        this.dob = LocalDate.now();
    }

    User(String name, int year, int month, int day){
        this.name = name;
        this.dob = LocalDate.of(year, month, day);
    }

    public void displayInfo(){
        System.out.println(name + " was born on " + dob);
    }

    public boolean isBirthday(){
        LocalDate today = LocalDate.now();
        return today.getMonth() == dob.getMonth() && today.getDayOfMonth() == dob.getDayOfMonth();
    }

    public void displayHappyBirthday() {
        if (isBirthday()) {
            System.out.println("Happy birthday " + this.name + "!");
        } else{
            System.out.println("Today is not " + this.name + " Birthday !");
        }
    }
}



