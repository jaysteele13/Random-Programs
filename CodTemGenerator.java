import java.time.Year;
import java.util.*;

public class CodTemGenerator {

    //colours!
    public static final String ANSI_RESET = "\u001B[0m";
    //public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    //public static final String ANSI_GREEN = "\u001B[32m";
    //public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    //public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    //public static final String ANSI_WHITE = "\u001B[37m";


    public static void main(String[] args) {
        //String[] names = {"Jay", "Charlie", "Harry", "Zach", "Conor", "Erin"};


        ArrayList<String> names = new ArrayList<String>(); // <string> what list will b, create new array list to add new stuff in later
        names.add(ANSI_CYAN + "Charlie" + ANSI_RESET);
        names.add(ANSI_CYAN + "Zach" + ANSI_RESET);
        names.add(ANSI_CYAN+ "Harry" + ANSI_RESET);
        names.add(ANSI_CYAN + "Conor" + ANSI_RESET);
        names.add(ANSI_CYAN + "Jay" + ANSI_RESET);
        names.add(ANSI_CYAN+ "Erin" + ANSI_RESET);

        int totalMembers = names.size();

        //calling methods

        RandomGenNames(names);
        System.out.println("\n" + RandomTeams(totalMembers));

    }

    public static void RandomGenNames(ArrayList<String> names) {
        Random random = new Random(); //random var for name switching

        int randomIndex = random.nextInt(0, names.size()); // random number
        int previousIndex = 0; //check for same
        int arraySize = 0;

        arraySize = names.size(); //as array size is altered constant is needed
        for (int i = 1; i < arraySize; i++) //loop
        {
            System.out.println(names.get(randomIndex) + ": " + i); //random name and text
            names.remove(randomIndex); //removes used name

            randomIndex = random.nextInt(0, names.size()); //generate new random number

        }
        System.out.println(names.get(0) + ": " + arraySize); //fault in logic and only displays five names -- this is fix

    }


    public static String RandomTeams(int lengthOfNumbers) {

        Random random = new Random();
        int[] number = new int[lengthOfNumbers];
        int count = 0; //to keep do while in check and finite
        int num; //number to be randomised

        String team1 = "", team2 = ""; // team vars


        while (count < number.length) { //will loop until count is incremented
            num = random.nextInt(number.length + 1);
            boolean repeat = false;
            do {
                for (int i = 0; i < number.length; i++) {
                    if (num == number[i]) { //checking for dupes, if true loop will repeat
                        repeat = true;
                        break;
                    } else if (i == count) { //checking for dupes outside of the first comparison
                        number[count] = num;
                        count++;
                        repeat = true;
                        break;
                    }
                }
            } while (!repeat);

        }

        for (int j = 0; j < number.length; j++) { //loop creates the return string
            if (j < lengthOfNumbers/2) {
                team1 += number[j] + " ";

            } else {
                team2 += number[j] + " ";
            }

        }

        return ANSI_BLUE + "Team1: " + team1 + ANSI_RESET + ANSI_RED + " Team2: " + team2 + ANSI_RESET;
    }
}
