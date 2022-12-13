import java.util.ArrayList;

public class TestPuzzle {
    
    public static void main(String[] args) {
        
        PuzzleJava puzzling = new PuzzleJava();

        ArrayList<Integer> testGetTenRolls = puzzling.getTenRolls(1,20);
        System.out.println(testGetTenRolls);

        String testGetRandomLetter = puzzling.getRandomLetter();
        System.out.println(testGetRandomLetter);

        String testGetRandomPassword = puzzling.generatePassword();
        System.out.println(testGetRandomPassword);

        ArrayList<String> testGetListPassword = puzzling.getNewPasswordSet(2);
        System.out.println(testGetListPassword);
    }
}
