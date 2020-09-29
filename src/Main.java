import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] sArr = {"кошка", "resa", "asdq", "asdq", "grt","a" ,"a",
                         "b","c" ,"aqbb", "Dog", "jkbvjj", "tgj", "c", "Dog", "Dog"};

        getUniq(sArr);

        getCount(sArr);


        PhoneBook xBook = new PhoneBook();
        xBook.add(123133, "Петров");
        xBook.add(3442992, "Петров");
        xBook.add(987991133, "Сидоров");
        xBook.add(966444123, "Кузнецов");
        xBook.add(899111232, "Рахматов");

        xBook.get("Петров");
        xBook.get("Сидоров");
        xBook.get("Антонов");
        xBook.get("Кузнецов");
        xBook.get("Рахматов");



    }

    private static void getUniq(String[] sArr) {
        Set<String> xRes = new HashSet<String>(Arrays.asList(sArr));
        xRes.forEach(x-> System.out.println(x));
    }


    private static void getCount(String[] sArr) {
        Map<String,Integer> xMap = new HashMap<>();
        for (int i=0;i< sArr.length;i++){
                    int cnt = xMap.getOrDefault(sArr[i], 0);
                    xMap.put(sArr[i],cnt+1);
        }
        xMap.forEach((k, v)-> System.out.println(k + ": "+ v));
    }
}
