import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> drawPile = new ArrayList<Card>();
    ArrayList<Card> discardPile = new ArrayList<Card>();

    public Deck(ArrayList<Card> draw, ArrayList<Card> discard) {
        drawPile = draw;
        discardPile = discard;
    }

    public ArrayList<Card> generateDeck() {
        ArrayList<Card> newDeck = new ArrayList<Card>();
        for (int i = 0; i < 12; i++) {
            newDeck.add(new Card(1, false, "One"));
            newDeck.add(new Card(2, false, "Two"));
            newDeck.add(new Card(3, false, "Three"));
            newDeck.add(new Card(4, false, "Four"));
            newDeck.add(new Card(5, false, "Five"));
            newDeck.add(new Card(6, false, "Six"));
            newDeck.add(new Card(7, false, "Seven"));
            newDeck.add(new Card(8, false, "Eight"));
            newDeck.add(new Card(9, false, "Nine"));
            newDeck.add(new Card(10, false, "Ten"));
            newDeck.add(new Card(11, false, "Eleven"));
            newDeck.add(new Card(12, false, "Tweleve"));
        }

        for (int i = 0; i < 18; i++) {
            newDeck.add(new Card(13, true, "PassGo"));
        }
        return newDeck;

    }

    public ArrayList<Card> shuffle(ArrayList<Card> deck) {
        Collections.shuffle(deck);
        return deck;
    }

    public void printDeck(ArrayList<Card> deckTest) {
        if (deckTest.size() < 1) {
            System.out.println("Empty Deck");
        } else {
            for (int i = 0; i < deckTest.size(); i++) {
                System.out.println(deckTest.get(i).getName());
            }
        }
    }

    public void dealPile(int pileSize, ArrayList<Card> deck,
            ArrayList<Card> playPiles) {
        for (int i = 0; i < pileSize; i++) {
            playPiles.add(deck.get(0));
            deck.remove(0);
        }
    }

    public void dealHand(ArrayList<Card> hand, ArrayList<Card> deck) {
        int cardsDealt = 0;
        while (hand.size() < 5) {
            hand.add(deck.get(0));
            deck.remove(deck.get(0));
            cardsDealt++;
        }
        System.out.println(cardsDealt + " cards dealt to your hand.");
    }

    public ArrayList<Card> getDrawPile() {
        return drawPile;
    }

    public void setDrawPile(ArrayList<Card> drawPile) {
        this.drawPile = drawPile;
    }

    public ArrayList<Card> getDiscardPile() {
        return discardPile;
    }

    public void setDiscardPile(ArrayList<Card> discardPile) {
        this.discardPile = discardPile;
    }
}
