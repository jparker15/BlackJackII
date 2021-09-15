package company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CheaterDeck implements Deck{

    Scanner scanner = new Scanner(System.in);

    public final String[] SUITS ={
            "CLUBS", "HEARTS", "DIAMONDS", "SPADES"
    };

    public final int[] VALUES = {
            1,2,3,4,5,6,7,8,9,10,11,12,13
    };

    public CheaterDeck(){

    }

    public Card deal(){
        System.out.println(Arrays.toString(SUITS));
        System.out.println("Which suit? (1-4)");
        int suitIndex = Integer.parseInt(scanner.nextLine()) - 1;

        System.out.println(Arrays.toString(VALUES));
        System.out.println("Which rank? (1 - 13) (A - K)");
        int valueIndex = Integer.parseInt(scanner.nextLine()) - 1;

        return new Card(SUITS[suitIndex],VALUES[valueIndex]);
    }

    @Override
    public void shuffle() {

    }

    public Card draw() {
        return null;
    }

}
