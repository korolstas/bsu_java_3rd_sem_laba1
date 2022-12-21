public class Burger extends Food implements Nitritious {
    private String Amount;

    private static int numSmall = 0;
    private static int numMedium = 0;
    private static int numBig = 0;

    private static int Allcalories = 0;

    private int colariesProduct;
    private final int calories = 200;

    Food food = new Food();

    public Burger(String Amount) {
        this.Amount = Amount;
        if (Amount.equals("The big burger")) {
            numBig++;
            System.out.println("The big burger " + numBig);
        } else if (Amount.equals("The average burger")) {
            numMedium++;
            System.out.println("The average burger " + numMedium);
        } else if (Amount.equals("The small burger")) {
            numSmall++;
            System.out.println("The small burger " + numSmall);
        }
    }

    public static int getAllcalories() {
        return Allcalories;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    public int getCalories() {
        return calories;
    }

    public static int coloriesNumber(String Amount) {
        int diff = 0;
        if (Amount.equals("The big burger")) {
            diff = 3;
        } else if (Amount.equals("The average burger")) {
            diff = 2;
        } else if (Amount.equals("The small burger")) {
            diff = 1;
        } else {
            System.out.println("No such size");
        }
        return diff;
    }

    @Override
    public int calculateCalories() {
        this.colariesProduct = getCalories() * coloriesNumber(getAmount());
        return this.colariesProduct;
    }

    public void allCalories(String size) {
        Allcalories += getCalories() * coloriesNumber(getAmount());
    }
}
