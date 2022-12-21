public class juice extends Food implements Nitritious {
    private String Amount;
    private static int num = 0;
    private int colariesProduct;
    private static int calories = 250;

    Food food = new Food();

    public juice(String Amount) {
        this.Amount = Amount;
        num++;
        System.out.println(Amount + num);
    }

    public static int getAllcalor() {
        return calories;
    }

    public String getAmount1() {
        return Amount;
    }

    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public int calculateCalories() {
        this.colariesProduct = getCalories();
        return this.colariesProduct;
    }

}