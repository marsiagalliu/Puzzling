import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava{

    Random randMachine = new Random();

    public ArrayList<Integer> getTenRolls(int min, int max){

        
        ArrayList<Integer> randArray = new ArrayList<Integer>();
        for (int i = 0; i <10; i++) {
            int randInt =  randMachine.nextInt(max) + min;
            randArray.add(randInt);
        }
        return randArray;
        
    }

    public String getRandomLetter(){

        String[] letterArray = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j" , "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "w", "z"};
       
        int randIndex = randMachine.nextInt(letterArray.length);

        return letterArray[randIndex];
    }

    public String generatePassword(){
        String randPassword = "";
        for (int i = 0; i < 8; i++) {
            String randLetter = getRandomLetter();
            randPassword = randPassword + randLetter;
        }
        return randPassword;
    }

    public ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> passwordList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            String password = generatePassword();
            passwordList.add(password);
        }
        
        return passwordList;
    }

}