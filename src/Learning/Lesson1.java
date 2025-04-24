package Learning;

import java.util.ArrayList;

public class Lesson1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0, 1);
        arrayList.add(1, 10);

        System.out.println(arrayList);
        System.out.println("size: "+arrayList.size());


        for (Integer i : arrayList) {
            System.out.println(i);
        }
    }
}
