import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bowling {
    private int pins;
    private int turn;
    int totalOfPins = 10;
    int totalScore = 0;
    int totalScore1 = 0;
    int totalScore2 = 0;
    Person newPerson;
    Person newPerson1;
    Person newPerson2;
    List<Integer> countOfPins = new ArrayList<>();


//    public Bowling(String playerName) {
//        super(playerName);
//    }
//
//    public Bowling(String playerName1, String playerName2) {
//        super(playerName1, playerName2);


//    List<Integer> totalScore = new ArrayList<>();

    public int getPins() {
        return pins;
    }

    public void setPins(int pins) {
        this.pins = pins;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public void setUpPins() {
        countOfPins.removeAll(countOfPins);
        countOfPins.add(0);
        countOfPins.add(1);
        countOfPins.add(2);
        countOfPins.add(3);
        countOfPins.add(4);
        countOfPins.add(5);
        countOfPins.add(6);
        countOfPins.add(7);
        countOfPins.add(8);
        countOfPins.add(9);
        countOfPins.add(10);
    }


    Random rand = new Random();


    public void rollSinglePlayer() {
        for (int i = 0; i < 10; i++) {
            int roll1 = countOfPins.get(rand.nextInt(countOfPins.size()));
            System.out.println("On roll 1, You knocked over " + roll1 + " pins");
            if (roll1 == 10) {
                System.out.println("You got a strike! \n");
                int left0verPins = 0;
                int roll2 = 0;
                int framescore = roll1;
                System.out.println("Your total Frame Score is " + framescore + "\n");
                totalScore += framescore;
                            } else {
                int leftOverPins = totalOfPins - roll1;
                int roll2 = countOfPins.get(rand.nextInt(leftOverPins));
                System.out.println("On roll 2, You knocked over " + roll2 + " pins \n");
                int framescore = roll1 + roll2;
                System.out.println("Your total Frame Score is " + framescore + "\n");
                totalScore += framescore;
            }
        }
    }

    public void rollMultiplayer1() {
        for (int i = 0; i < 10; i++) {
            int roll3 = countOfPins.get(rand.nextInt(countOfPins.size()));
            System.out.println("On roll 1, Player 1 knocked over " + roll3 + " pins");
            if (roll3 == 10) {
                System.out.println("You got a strike! \n");
                int left0verPins = 0;
                int roll4 = 0;
                int framescore1 = roll3;
                System.out.println("Player 1's total Frame Score is " + framescore1 + "\n");
                totalScore1 += framescore1;

            } else {
                int leftOverPins = totalOfPins - roll3;
                int roll4 = countOfPins.get(rand.nextInt(leftOverPins));
                System.out.println("On roll 2, Player 1 knocked over " + roll4 + " pins \n");
                int framescore1 = roll3 + roll4;
                System.out.println("Player 1's total Frame Score is " + framescore1 + "\n");
                totalScore1 += framescore1;
            }
        }
    }
        public void rollMultiplayer2 () {

            for (int j = 0; j < 10; j++) {
                int roll5 = countOfPins.get(rand.nextInt(countOfPins.size()));
                System.out.println("On roll 1, Player 2 knocked over " + roll5 + " pins");
                if (roll5 == 10) {
                    System.out.println("You got a strike! \n");
                    int left0verPins = 0;
                    int roll6 = 0;
                    int framescore2 = roll5;
                    System.out.println("Player 2's total Frame Score is " + framescore2 + "\n");
                    totalScore2 += framescore2;

                } else {
                    int leftOverPins1 = totalOfPins - roll5;
                    int roll6 = countOfPins.get(rand.nextInt(leftOverPins1));
                    System.out.println("On roll 2, Player 2 knocked over " + roll6 + " pins \n");
                    int framescore2 = roll5 + roll6;
                    System.out.println("Player 2's total Frame Score is " + framescore2 + "\n");
                    totalScore2 += framescore2;
                }
            }
        }

            public int getTotalScore () {
                System.out.println("Your total score is " + totalScore);
                return totalScore;
            }

            public int getTotalScore1 () {
                System.out.println("Player1's total score is " + totalScore1);
                return totalScore1;
            }
            public int getTotalScore2 () {
                System.out.println("Player2's total score is " + totalScore2);
                return totalScore2;
            }
            public void calcWinner () {
                if (totalScore1 > totalScore2) {
                    System.out.println("Player 1 wins!");
                } else if (totalScore2 > totalScore1) {
                    System.out.println("Player 2 wins!");
                } else {
                    System.out.println("It's a tie!");
                }
            }

        }


