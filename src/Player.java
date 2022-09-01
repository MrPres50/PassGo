import java.util.ArrayList;

public class Player {
	ArrayList<Card> hand = new ArrayList<Card>();
	ArrayList<Card> playPile = new ArrayList<Card>();
	ArrayList<ArrayList<Card>> storagePiles = new ArrayList<ArrayList<Card>>();
	String name;

	public Player(String n) {
		ArrayList<Card> pile1 = new ArrayList<Card>();
		ArrayList<Card> pile2 = new ArrayList<Card>();
		ArrayList<Card> pile3 = new ArrayList<Card>();
		ArrayList<Card> pile4 = new ArrayList<Card>();
		storagePiles.add(pile1);
		storagePiles.add(pile2);
		storagePiles.add(pile3);
		storagePiles.add(pile4);
		name = n;
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}

	public ArrayList<Card> getPlayPile() {
		return playPile;
	}

	public void setPlayPile(ArrayList<Card> playPile) {
		this.playPile = playPile;
	}

	public ArrayList<ArrayList<Card>> getStoragePiles() {
		return storagePiles;
	}

	public void setStoragePiles(ArrayList<ArrayList<Card>> storagePiles) {
		this.storagePiles = storagePiles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
