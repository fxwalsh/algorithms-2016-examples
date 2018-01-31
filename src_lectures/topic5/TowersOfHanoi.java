package topic5;

/**
 * Towers of Hanoi
 * Pole are labelled 1, 2,3
 * Each disk is also labelled 1 to numberOfDisks
 * @author Frank Walsh
 *
 */
public class TowersOfHanoi {
        public static void move(int numberOfDisks, int startPole, int tempPole, int endPole) {
                if (numberOfDisks> 0){  
                move(numberOfDisks-1, startPole, endPole, tempPole);
                System.out.println("Move disk " +numberOfDisks + " from pole " + startPole + " to pole " +endPole);
                move(numberOfDisks-1, tempPole, startPole, endPole);
                }
        }

        public static void main(String[] args) {
                move(10, 1, 2, 3);
        }
}