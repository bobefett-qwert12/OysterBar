import java.util.Scanner;
public class OysterBarTester {
    public static void main(String[] args) {
        OysterBar bar = new OysterBar(0);
        Scanner in = new Scanner(System.in);
        while(bar.getPeopleInBar() < 100){
            System.out.print("Please enter the number of people entering the bar (use negatives for departures): ");
            int peopleEnteringBar;
            if (in.hasNextInt()){
                peopleEnteringBar = in.nextInt();
                if (bar.getPeopleInBar() + peopleEnteringBar > 100){
                    System.out.println("Sorry, that exceeds the maximum capacity of the bar (100 people).");
                    System.out.println("The bar still has " + bar.getPeopleInBar() + " people.");
                }else if(bar.getPeopleInBar() + peopleEnteringBar == 100){
                    System.out.println("The bar is now full with 100 people. Terminating program...");
                    bar.addToBar(peopleEnteringBar);
                }else {
                    bar.addToBar(peopleEnteringBar);
                    System.out.println("The bar now has " + bar.getPeopleInBar() + " people.");
                }
            }else{
                System.out.println("Sorry, that's not an integer. Try again.");
            }
        }
    }
}
