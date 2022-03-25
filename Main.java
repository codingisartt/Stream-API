import java.util.ArrayList;
import java.util.Comparator;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(43);
        list.add(16);
        list.add(56);
        list.add(23);
        list.add(23);
        list.add(65);
        list.add(29);
        list.add(43);
        list.add(16);
        /* 2 way
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (Integer w : list) {
            System.err.println(w);
        }*/

        list.stream().forEach(w -> System.out.print(w+" "));//43 16 56 23 23 65 29 43 16
        System.out.println();
        list.forEach(w-> System.out.print(w+" "));//43 16 56 23 23 65 29 43 16

        System.out.println();
        list.stream().filter(num -> num>23).forEach(i-> System.out.print(i+" "));//43 56 65 29 43
        
        System.out.println();//if an element exist more than one, distinct() returns once
        list.stream().distinct().forEach(i-> System.out.print(i+" "));//43 16 56 23 65 29

        System.out.println();//sorting
        list.stream().sorted().forEach(i->System.out.print(i+" "));//16 16 23 23 29 43 43 56 65

        System.out.println();
        list.stream().sorted(Comparator.reverseOrder()).forEach(i->System.out.print(i+" "));//65 56 43 43 29 23 23 16 16 

        System.out.println();// 5 elements
        list.stream().limit(5L).forEach(i->System.out.print(i+" "));//43 16 56 23 23 

        System.out.println();
        list.stream().skip(3).limit(4).forEach(i->System.out.print(i+" "));//23 23 65 29 

        System.out.println();
        long c= list.stream().count();
        System.out.println(c);//9

        boolean control=list.stream().anyMatch(i->i==25);
        System.out.println(control);//false

        boolean contr=list.stream().anyMatch(i->i<0);
        System.out.println(contr);//false

        list.stream().map(i-> i*2).forEach(i-> System.out.print(i+" "));//86 32 112 46 46 130 58 86 32 

        System.out.println();
        list.stream().map(i-> Math.sqrt(i)).forEach(i-> System.out.print(i+" "));//6.557438524302 4.0 7.483314773547883 4.795831523312719 4.795831523312719 8.06225774829855 5.385164807134504 6.557438524302 4.0

    }
}