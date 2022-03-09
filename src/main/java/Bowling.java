import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bowling {
    private int pins;
    private int turn;
    int totalOfPins = 10;
    int totalScore = 0;
    List<Integer> countOfPins = new ArrayList<>();
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


    public void roll() {
        for (int i = 0; i < 10; i++) {
            int roll1 = countOfPins.get(rand.nextInt(countOfPins.size()));
            System.out.println("On roll 1 you knocked over " + roll1 + " pins");
            int leftOverPins = totalOfPins - roll1;
            int roll2 = countOfPins.get(rand.nextInt(leftOverPins));
            System.out.println("On roll 2, you knocked over " + roll2 + " pins");
            int framescore = roll1 + roll2;
            System.out.println("Your total Frame Score is " + framescore);
            totalScore += framescore;
        }
    }

    public int getTotalScore() {
        System.out.println("Your total score is " + totalScore);
        return totalScore;
    }

}


