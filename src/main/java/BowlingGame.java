import java.util.Scanner;

public class BowlingGame {
    public static void main(String[] args) {
    Bowling newGame = new Bowling();

    Person singlePlayer = new Person("Elissa");
    Person multiPlayer = new Person("Collin" ,"Karri");

        System.out.println("Welcome to bowling! Please select number of players: 1) for Single Player " + "\n" +
                        "2) for Multiplayer");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        boolean setPlayers = true;
        do {
            if (userInput == 1) {
//                singlePlayer.createPerson();
                newGame.setUpPins();
                newGame.rollSinglePlayer();
                newGame.getTotalScore();
                break;
            } else if (userInput ==2) {
//                System.out.println("Please enter player 1's name: ");
//                String userName1 = scanner.next();
//                System.out.println("Please enter player 2's name: ");
//                String userName2 = scanner.next();
//                multiPlayer.createPerson1();
//                multiPlayer.createPerson2();
                newGame.setUpPins();
                newGame.rollMultiplayer1();
                newGame.getTotalScore1();
                System.out.println("---------------------------------------");
                newGame.rollMultiplayer2();
//                newGame.getTotalScore1();
                newGame.getTotalScore2();
                System.out.println("---------------------------------------");
                newGame.calcWinner();
                break;
            } else {
                System.out.println("Invalid entry. Please try again.");
                userInput = scanner.nextInt();
            }
        } while(setPlayers);


//    newGame.setUpPins();
//    newGame.roll();
//    newGame.getTotalScore();

    }

}
