public class Currency {
    private int coins;
    private int gems;

    public Currency() {
        this.coins = 0;
        this.gems = 0;
    }

    public int getCoins() {
        return coins;
    }

    public void addCoins(int amount) {
        if (amount > 0) {
            coins += amount;
        }
    }

    public void spendCoins(int amount) {
        if (amount > 0 && amount <= coins) {
            coins -= amount;
        }
    }

    public int getGems() {
        return gems;
    }

    public void addGems(int amount) {
        if (amount > 0) {
            gems += amount;
        }
    }

    public void spendGems(int amount) {
        if (amount > 0 && amount <= gems) {
            gems -= amount;
        }
    }

    @Override
    public String toString() {
        return "Currency{ coins=" + coins + ", gems=" + gems + " }";
    }
}