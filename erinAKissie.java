import java.lang.*;
import  java.util.Random;


public class erinAKissie {

    public static final String ANSI_RESET = "\u001B[0m";
    //public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_PURPLE = "\u001B[35m";


    public static void main(String[] args) {
        char kissie = Console.getChar("Is a erin a kissie (y/n)");
        kissie = Character.toLowerCase(kissie);
        Random random = new Random();

        int lengthOfWah = 77, repeatSus = 0;
        int randomNo = random.nextInt(1, (lengthOfWah/10));


        while(kissie != 'y' && kissie != 'n') {
            if (repeatSus % 3 != 2) {
                System.out.println(ANSI_RED + "bitch" + ANSI_RESET + " i want an answer.");
            kissie = Console.getChar("");   }
            else if (repeatSus == 2) {
                kissie = Console.getChar("Wait... are you a glimble?");
            }
            else
            {
                kissie = Console.getChar("wtf, you're a glimble");
                System.out.println("                                                                whatthefuckie");

            }
            repeatSus++;
        }

        if(kissie == 'y') {
            System.out.println(ANSI_PURPLE + "kissie commencing...\n" + ANSI_RESET + "づ￣ ³￣)づ");
        }
        else {
            for(int i = lengthOfWah; i > 0; i--){
                System.out.println("wah");
                if(i % randomNo == 0) {
                    System.out.println(ANSI_RED + "kissie" + ANSI_RESET);
                    randomNo = random.nextInt(1, (lengthOfWah/4)); //resetting num
                }
            }

        }
    }


}
