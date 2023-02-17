import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите пять имен для списка 1  ");
        ArrayList<String>a = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            a.add(scanner.nextLine());

        }
        System.out.println("Список 1: "+a);
        System.out.println("Введите еще пять имен для списка 2");
        ArrayList<String>b=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            b.add(scanner.nextLine());

        }
        System.out.println("Список 2: "+b);

        ArrayList<String>c=new ArrayList<>();
        for (int y=0;y<a.size();y++) {
            int indexForB = b.size() - (y+1);
            c.add(a.get(y));
            c.add(b.get(indexForB));

        }
        System.out.println("Результат : " +c);

        Collections.sort(c, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println(c);



    }
}