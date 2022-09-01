import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainRunner {

	static ArrayList<ArrayList<Card>> allPiles = new ArrayList<ArrayList<Card>>();
	static int numberOfPlayers = 0;
	static ArrayList<Player> playerList = new ArrayList<Player>();
	static Scanner keyboardReader = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Card> pile1 = new ArrayList<Card>();
		ArrayList<Card> pile2 = new ArrayList<Card>();
		ArrayList<Card> pile3 = new ArrayList<Card>();
		ArrayList<Card> pile4 = new ArrayList<Card>();

		allPiles.add(pile1);
		allPiles.add(pile2);
		allPiles.add(pile3);
		allPiles.add(pile4);

		ArrayList<Card> hand1 = new ArrayList<Card>();

		gameLoop();
	}

	public static void gameLoop() {
		ArrayList<Card> draw = new ArrayList<Card>();
		ArrayList<Card> discard = new ArrayList<Card>();
		Deck deck1 = new Deck(draw, discard);

		draw = deck1.generateDeck();
		deck1.shuffle(draw);
		deck1.printDeck(draw);
		numberOfPlayers = getPlayerCount();
		for (int i = 0; i < numberOfPlayers; i++) {
			String name = getPlayerName();
			playerList.add(new Player(name));
			deck1.dealHand(playerList.get(playerList.size() - 1).getHand(), draw);
			deck1.dealPile(playerList.get(playerList.size() - 1).getPlayPile(), draw);
		}
		boolean gameContinue = true;
		while (gameContinue == true) {
			
		}
	}

	public static void printHand(ArrayList<Card> hand) {
		System.out.println("Your hand is:");
		for (int i = 0; i < hand.size(); i++) {
			System.out.println(hand.get(i).getName());
		}
	}

	public static void printGame() {
		for (int i = 0; i < 4; i++) {
			int pileNum = i + 1;
			System.out.print("[P" + pileNum + "] ");
			for (int j = 0; j < allPiles.get(i).size(); j++) {
				System.out.print(allPiles.get(i).get(j).getNumberValue() + " ");
			}
			System.out.println("");
		}

	}

	public static int getPlayerCount() {
		boolean validInputRecieved = false;
		int playerNumInput = 0;
		while (validInputRecieved == false) {
			System.out.println(
					"Welcome to PassGo! How many players will be playing today? You can have as little as two or as many as 6 players.");
			playerNumInput = keyboardReader.nextInt();
			if (playerNumInput < 2 || playerNumInput > 6) {
				System.out.println("Unfortunately that is an invalid amount of players, please try again.");
			} else {
				System.out.println("You have selected " + playerNumInput + " players, is this correct? (Y/N)");
				String answer = keyboardReader.next();
				answer = answer.toUpperCase();

				if (answer.equals("Y")) {
					System.out.println("Excellent, then we can begin!");
					validInputRecieved = true;
				} else if (answer.equals("N")) {
					System.out.println("Gotcha, lets send you back to the top then. We'll get it right this time!");
				} else {
					System.out.println("Invalid input recieved, please try again.");
				}
			}
		}
		return playerNumInput;
	}

	public static String getPlayerName() {
		Boolean validNameFound = false;
		String playerName = "";
		while (validNameFound == false) {
			System.out.println("What is the name of this player?");
			playerName = keyboardReader.next();
			System.out.println("Is " + playerName + " correct? (Y/N)");
			String userChoice = keyboardReader.next();
			userChoice = userChoice.toLowerCase();
			if (userChoice.equals("y")) {
				System.out.println("Player name is set.");
				validNameFound = true;
			} else {
				System.out.println("We'll try that again then.");
			}
		}
		return playerName;
	}
	
	public static void playCard(ArrayList<Card> hand, int cardIndex, ArrayList<Card> pile) {
		if (pile.size() < 12 && hand.get(cardIndex).getNumberValue() == 13) {
			pile.add(hand.get(cardIndex));
			hand.remove(cardIndex);
			printGame();
		} else if (hand.get(cardIndex).getNumberValue() == pile.size() + 1 && pile.size() < 12) {
			pile.add(hand.get(cardIndex));
			hand.remove(cardIndex);
			printGame();
		} else {
			System.out.println("You can't play that card there.");
		}
	}
	
	public static void turnLoop () {
		
	}

}
