import java.util.Arrays;
public class Comparate {
    public Food[] sort(Food[] burgers){
        String[] arr = new String[burgers.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = ((Burger)burgers[i]).getAmount();
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                // Используя встроенную функцию сравнениея строк (compareTo())
                // мы сортируем значения, если значения > Значит нужно менять
                if(arr[i].compareTo(arr[j]) > 0){
                    String pum = arr[i];
                    arr[i] = arr[j];
                    arr[j] = pum;
                }
            }
        }
        for(int i = 0; i < burgers.length; i++){
            ((Burger)burgers[i]).setAmount(arr[i]);
        }
        return burgers;
    }
}