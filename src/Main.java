import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Объявляем класс Food
        Food[] burgers = new Burger[9];
        Food[] juices = new juice[1];

        // Заполнение класса
        System.out.println("Your order: ");
        for (int i = 0; i < burgers.length; i++){
            if(i < 3)
                burgers[i] = new Burger("The small burger");
            else if (i > 2 && i < 6)
                burgers[i] = new Burger("The average burger");
            else
                burgers[i] = new Burger("The big burger");

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Would you like a juice? ");
        String a = scanner.next();
        if(a.equals("Yes"))
            juices[0] = new juice("The big juice");
        System.out.println();

        // Вычисляем ккал
        System.out.println("Enter 'Yes' to know calories: ");
        String all = scanner.next();
        if(all.equals("Yes"))
            for(int i = 0; i < burgers.length; i++){
                ((Burger)burgers[i]).allCalories(((Burger)burgers[i]).getAmount());
                if(i == burgers.length - 1){

                    int result = ((Burger)burgers[i]).getAllcalories() + ((juice)juices[0]).getAllcalor();
                    System.out.println("Total calories " + result);
                    System.out.println();
                }
            }
            else
                System.out.println("You type 'NO' (calories)");

        // Сортируем продукты
        Comparate comparate = new Comparate();
        System.out.println("Enter 'Yes' to sort products: ");
        String sort = scanner.next();
        if(sort.equals("Yes")){
            burgers = comparate.sort(burgers);
            for(int i = 0; i < burgers.length; i++)
                System.out.println(((Burger)burgers[i]).getAmount());
        }
        else
            System.out.println("You type 'NO' (sort)");
    }
}