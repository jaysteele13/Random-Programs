import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class RandomChord {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //asking to play game
        System.out.print("Would you like to generate a very SIMPLE chord with absolutely no sharps or flats  \nY/N ");
        String playGame = scanner.nextLine();

        //selection
        if(playGame.equalsIgnoreCase("y")) {
            System.out.println("Excellent, what will you call your chord? ");
            String chordName = scanner.nextLine();

            System.out.println("Behold... " + chordName);
            RandomChordGeneratorV2(7);
        }
        else {
            System.out.println("What the fuck you doing here, get out.");
        }

        scanner.close(); //always close your scanners folks


        /*
        Random random = new Random();


        
        String chord = "Major";
        int randomNote = random.nextInt(0, 12);

        for(int i = 0; i < 10; i++) {
            String finalChord = RandomChordGeneratorV2(randomNote);
            System.out.println(finalChord);
            randomNote = random.nextInt(0, 12);
            */
        }



    public static void RandomChordGenerator() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        //program will attempt to make completely random chords them play them
        //char notes[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};


        ArrayList<ArrayList<String>> scales = new ArrayList<>(); //big list


        //C Major / A Minor Scale (i = 0)
        ArrayList<String> cMajor = new ArrayList();

        cMajor.add("C");
        cMajor.add("D");
        cMajor.add("E");
        cMajor.add("F");
        cMajor.add("G");
        cMajor.add("A");
        cMajor.add("B");

        //G Major / E Minor Scale (i = 1)
        ArrayList<String> gMajor = new ArrayList();

        gMajor.add("G");
        gMajor.add("A");
        gMajor.add("B");
        gMajor.add("C");
        gMajor.add("D");
        gMajor.add("E");
        gMajor.add("F#");

        //D Major / B Minor Scale (i = 2)
        ArrayList<String> dMajor = new ArrayList();

        dMajor.add("D");
        dMajor.add("E");
        dMajor.add("F#");
        dMajor.add("G");
        dMajor.add("A");
        dMajor.add("B");
        dMajor.add("C#");


        //A Major / F# Minor Scale (i = 3)
        ArrayList<String> aMajor = new ArrayList();

        aMajor.add("A");
        aMajor.add("B");
        aMajor.add("C#");
        aMajor.add("D");
        aMajor.add("E");
        aMajor.add("F#");
        aMajor.add("G#");


        //E Major / C# Minor Scale (i = 4)
        ArrayList<String> eMajor = new ArrayList();

        eMajor.add("E");
        eMajor.add("F#");
        eMajor.add("G#");
        eMajor.add("A");
        eMajor.add("B");
        eMajor.add("C#");
        eMajor.add("D#");

        //B Major / G# Minor Scale (i = 5)
        ArrayList<String> bMajor = new ArrayList();

        bMajor.add("B");
        bMajor.add("C#");
        bMajor.add("D#");
        bMajor.add("E");
        bMajor.add("F#");
        bMajor.add("G#");
        bMajor.add("A#");

        //F# Major / D# Minor Scale (i = 6)
        ArrayList<String> fSharpMajor = new ArrayList();

        fSharpMajor.add("F#");
        fSharpMajor.add("G#");
        fSharpMajor.add("A#");
        fSharpMajor.add("B");
        fSharpMajor.add("C#");
        fSharpMajor.add("D#");
        fSharpMajor.add("E#");

        //F Major / D Minor Scale (i = 7)
        ArrayList<String> fMajor = new ArrayList();

        fMajor.add("F");
        fMajor.add("G");
        fMajor.add("A");
        fMajor.add("Bb");
        fMajor.add("C");
        fMajor.add("D");
        fMajor.add("E");

        //Bb Major / G Minor Scale (i = 8)
        ArrayList<String> bbMajor = new ArrayList();

        bbMajor.add("Bb");
        bbMajor.add("C");
        bbMajor.add("D");
        bbMajor.add("Eb");
        bbMajor.add("F");
        bbMajor.add("G");
        bbMajor.add("A");

        //Eb Major / C Minor Scale (i = 9)
        ArrayList<String> ebMajor = new ArrayList();

        ebMajor.add("Eb");
        ebMajor.add("F");
        ebMajor.add("G");
        ebMajor.add("Ab");
        ebMajor.add("Bb");
        ebMajor.add("C");
        ebMajor.add("D");

        //Ab Major / F Minor (i = 10)
        ArrayList<String> abMajor = new ArrayList();

        abMajor.add("Ab");
        abMajor.add("Bb");
        abMajor.add("C");
        abMajor.add("D");
        abMajor.add("Eb");
        abMajor.add("F");
        abMajor.add("G");

        //Db Major / Bb Minor (i = 11)
        ArrayList<String> dbMajor = new ArrayList();

        dbMajor.add("Db");
        dbMajor.add("Eb");
        dbMajor.add("F");
        dbMajor.add("Gb");
        dbMajor.add("Ab");
        dbMajor.add("Bb");
        dbMajor.add("C");


        //adding scales to list
        scales.add(cMajor); //i0
        scales.add(gMajor); //i1
        scales.add(dMajor); //i2
        scales.add(aMajor); //i3
        scales.add(eMajor); //i4
        scales.add(bMajor); //i5
        scales.add(fSharpMajor); //i6
        scales.add(fMajor); //i7 */
        scales.add(bbMajor); //i8
        scales.add(ebMajor); //i9
        scales.add(abMajor); //i10
        scales.add(dbMajor); //i11


        //commenting out chord gen

        //inputting variables
        int randomNotes = random.nextInt(0, 7); //% scales.size()
        //int notesOfChord = random.nextInt(3, 6);
        int notesOfChord = 3;
        int randomKey = random.nextInt(0, scales.size());


        //input key
        System.out.print("Within 12 Tone Equal Temperament, what key would you like your chord to be in (use uppercase for keys)? ");
        String playerKey = scanner.nextLine();


        switch (playerKey) {
            case "C":
                randomKey = 0;
                break;

            case "G":
                randomKey = 1;
                break;

            case "D":
                randomKey = 2;
                break;

            case "A":
                randomKey = 3;
                break;

            case "E":
                randomKey = 4;
                break;

            case "B":
                randomKey = 5;
                break;

            case "F#":
                randomKey = 6;
                break;

            case "F":
                randomKey = 7;
                break;

            case "Bb":
                randomKey = 8;
                break;

            case "Eb":
                randomKey = 9;
                break;

            case "Ab":
                randomKey = 10;
                break;

            case "Db":
                randomKey = 11;
                break;

            default:
                System.out.println("Choose an actual note next time! For now have a random one, bitch.");
        }




/*

        //what key it is
        System.out.println("here is the key: " + scales.get(randomKey).get(0));
        //basically a counter controlled loop
        for(int i = notesOfChord; i >= 0; i--) //for everytime the random number is bigger than 0, decrease;
        {
            if(i <= scales.get(randomKey).size()) { //getting random Major (C, G or D)
                System.out.println(scales.get(randomKey).get(randomNotes));
                scales.get(randomKey).remove(randomNotes);

                randomNotes = random.nextInt(0, scales.get(randomKey).size());

            }
        }
*/


        //making chord based on thirds

        Scanner input = new Scanner(System.in);

        int startingTerm = 0, numberOfTerms = 3, chordNthTerm = 0, commonDifference = 2; //input


        chordNthTerm = startingTerm + (numberOfTerms - 1) * commonDifference; //calculation
        int sum = numberOfTerms * (2 * startingTerm + (numberOfTerms - 1) * commonDifference) / 2; //end of nth term

        for (int i = 0; i < numberOfTerms; i++) {
            int term = startingTerm + i * commonDifference; //shows progression
            System.out.print(scales.get(randomKey).get(term) + " ");
            System.out.println();
            for (int j = 0; j <= scales.size(); j++) //moves next number in index
            {
                startingTerm++;
                term = startingTerm + i * commonDifference; //shows progression
                System.out.print(scales.get(randomKey).get(term) + " ");
                System.out.println();

            }
        }


        /*System.out.println("The nthTerm of the series : " + chordNthTerm);
        System.out.println("The Sum of n terms of series : " + sum); */
    }

    public static String RandomChordGeneratorV2(int randomNote) {

/*

        String maj3 = "", min3 = "";

        for(int i = 0; i < 3; i++) {

            if (noteOrder == 1) {
                System.out.println(sharps[i]); //tonic

                if ((sharps[i] == sharps[8]) || (sharps[i] == sharps[9]) || (sharps[i] == sharps[10]) || (sharps[i] == sharps[11])) {

                    maj3 = sharps[i - 8]; // major third

                } else {
                    maj3 = sharps[i + majorThird]; // major third calculation

                }

            } else if (noteOrder == 2) {

                System.out.println(maj3);
                if ((sharps[i] == sharps[9]) || (sharps[i] == sharps[10]) || (sharps[i] == sharps[11])) {

                    min3 = sharps[i - 9 ]; // per 5th calc
                } else {
                    min3 =  sharps[i + minorThird]; // perfect fifth calculation
                }

            } else if (noteOrder == 3) {

                System.out.println(min3); // perfect 5th
            }

            noteOrder++;
        }



*/
        ArrayList<ArrayList<String>> allNotes = new ArrayList(); // add sharps and flats to it and make it random with slection statements
        //tonic plus 3 + 4 gets random major chord
        String[] sharps = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"}; //C-Am, G-Em, D-Bm, A-F#m, E-C#m, B, F#
        String[] flats = {"C", "Db", "D", "Eb", "E", "F", "Gb", "G", "Ab", "A", "Bb", "B"}; //F, Bb, Eb, Ab, Db

        //boolean noteInitialisation = false;

        //String tonic = "", semitone = "1", maj2 = "2", min3 = "3",maj3 = "4", per4 = "5", aug4 = "6", per5 = "7",
            //min6 = "8", maj6 = "9", min7 = "10", maj7 = "11", chord = "12";

        //initialisation

        int t = randomNote, maj3 = randomNote + 4, per5 = randomNote + 7;


        if ((sharps[t] == sharps[8]) || (sharps[t] == sharps[9]) || (sharps[t] == sharps[10]) || (sharps[t] == sharps[11])) {
            maj3 = t - 8; // major third
        }

        if ((sharps[maj3] == sharps[9]) || (sharps[maj3] == sharps[10]) || (sharps[maj3] == sharps[11])) {
            per5 =  maj3 - 9; // per 5th calc
        } else {
            per5 = maj3 + 3;
        }



        String tonic = sharps[t];
        String majorThird = sharps[maj3];
        String perfectFifth = sharps[per5];
        String chord = tonic + " " + majorThird + " " + perfectFifth;








        /*
        //loop to create major chord
        for (int i = randomNote; i < 12; i++) {

            String note = sharps[i]; //tonic

            if(i == 0) {
                tonic = note;
            }
            if(i == 1) {
                semitone = note;
            }
            else if(i == 2) {
                maj2 = note;
            }
            else if(i == 3) {
                min3 = note;
            }
            else if(i == 4) {
                maj3 = note;
            }
            else if(i == 5) {
                per4 = note;
            }
            else if(i == 6) {
                aug4 = note;
            }
            else if(i == 7) {
                per5 = note;
            }
            else if(i == 8) {
                min6 = note;
            }
            else if(i == 9) {
                maj6 = note;
            }
            else if(i == 10) {
                min7 = note;
            }
            else if(i == 11) {
                maj7 = note;
                noteInitialisation = true;
            }

            if(chordType.equalsIgnoreCase("Major") && noteInitialisation) {
                chord = tonic + " " + maj3 + " " + per5;
            }

            */

        return chord;
    }
}






