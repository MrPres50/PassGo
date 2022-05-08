
public class Card {
    int numberValue;
    boolean isWild;
    String name;
    
    public Card (int n, boolean w, String na ) {
        numberValue = n;
        isWild = w;
        name = na;
    }

    public int getNumberValue() {
        return numberValue;
    }

    public void setNumberValue(int numberValue) {
        this.numberValue = numberValue;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean isWild) {
        this.isWild = isWild;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
