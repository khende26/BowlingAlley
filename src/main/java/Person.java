import java.util.Scanner;

public class Person {
    private String playerName;
    private String playerName1;
    private String playerName2;
//    String playerName3;

    public Person() {

    }
    public String createPerson() {
        Scanner playerInput = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String userName = playerInput.next();
        this.playerName = userName;
        return playerName;
    }
    public String createPerson1() {
        Scanner playerInput = new Scanner(System.in);
        System.out.println("Please enter Player 1's name: ");
        String userName = playerInput.next();
        playerName1 = userName;
        return playerName1;
    }
    public String createPerson2() {
        Scanner playerInput = new Scanner(System.in);
        System.out.println("Please enter Player 2's name: ");
        String userName = playerInput.next();
        playerName2 = userName;
        return playerName2;
    }

    public Person(String playerName) {
        this.playerName = playerName;
    }

    public Person(String playerName1, String playerName2) {
        this.playerName1 = playerName1;
        this.playerName2 = playerName2;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getPlayerName1() {
        return playerName1;
    }

    public String getPlayerName2() {
        return playerName2;
    }
}
