public class Lab05 {
    public static void main(String[] args){
        User john = new User ("John", 1954, 11, 18);
        john.displayInfo();
        john.displayHappyBirthday();
        System.out.println();
        Admin nicolas = new Admin ("nicolas",1964, 12,18);
        nicolas.displayInfo();
        nicolas.displayHappyBirthday();
        System.out.println();
        nicolas.displayInfo(true);
        System.out.println();
        nicolas.displayInfo(false);
    }
}
