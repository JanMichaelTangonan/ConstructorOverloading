import java.util.Scanner;



public class ClassOverloading {

    public TimeOfDay now;

    public void init() {
        Scanner keyboard = new Scanner(System.in);
        now = setTimeOfDay(keyboard, now);

        System.out.println(now.getmHours() + ": " + now.getmMinutes());
    }

    public static void main(String[] args) {
        ClassOverloading classOverloading = new ClassOverloading();
        classOverloading.init();
    }

    public TimeOfDay setTimeOfDay(Scanner pKeyboard, TimeOfDay now) {
        boolean valid = false;
        while (!valid) {
            System.out.println("Enter the desired hour");
            int pHours = pKeyboard.nextInt();
            System.out.println("Enter the desired minutes");
            int pMinutes = pKeyboard.nextInt();
            if (validHours(pHours) && validMinutes (pMinutes)) {
                now = new TimeOfDay(pHours, pMinutes);
                valid = true;
                return now;
            }
            else{
                System.out.println("You entered incorrect hours or minutes: "+ pHours+": "+ pMinutes);
                System.out.println("Please try again");
            }

        }
        return null;
    }

    private boolean validHours(int pHours) {
        if (pHours < 24 && pHours > 0) {
            return true;

        } else {
            return false;
        }


    }

    private boolean validMinutes(int pMinutes){
        if (pMinutes < 60 && pMinutes >= 0){
            return true;
        } else {
            return false;
        }

    }
}