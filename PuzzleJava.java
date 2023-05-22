import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava{
   
    public ArrayList<Integer> getTenRolls(){
       ArrayList<Integer> random10 = new ArrayList<Integer>(); 
        Random rolls = new Random();

        for( int i = 1 ; i <=10; i++){
            random10.add(rolls.nextInt(20));
        }

        return(random10);
    } 

    public String getRandomLetter(){
        String letters = "abcdefghijklmnopqrstuvwxyz";
        Random index = new Random();

        char random = letters.charAt(index.nextInt(26));

        return String.valueOf(random);
    }

     public String generatePassword() {

        String password = "";

        for(int i = 0; i < 8; i++) {
            password = password + getRandomLetter();
        }
        return password;

    }

    public ArrayList<String> getNewPasswordSet(int length) {

        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i = 0; i < length; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }
}