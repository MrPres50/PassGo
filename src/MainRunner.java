import java.util.ArrayList;
import java.util.Collections;

public class MainRunner {

    public static void main(String[] args) {
        Card one = new Card(1, false, "One");

        System.out.println("This card is a " + one.getName());

        Card two = new Card(2, false, "Two");

        ArrayList<Card> draw = new ArrayList<Card>();
        ArrayList<Card> discard = new ArrayList<Card>();
        Deck deck1 = new Deck(draw, discard);

        draw = deck1.generateDeck();
        deck1.shuffle(draw);
        ArrayList<Card> hand1 = new ArrayList<Card>();
        deck1.dealHand(hand1, draw);
        printHand(hand1);
    }

    public static void printHand(ArrayList<Card> hand) {
        System.out.println("Your hand is:");
        for (int i = 0; i < hand.size(); i++) {
            System.out.println(hand.get(i).getName());
        }
    }

    public static void printGame(ArrayList<Card> cardsPlayed, int pile1Size,
            int pile2Size, int pile3Size, int pile4Size) {
        
        System.out.println("[P1] [P2] [P3] [P4]");
        System.out.println("");
    }

}
