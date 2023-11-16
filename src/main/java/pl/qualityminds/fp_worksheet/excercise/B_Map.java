package pl.qualityminds.fp_worksheet.excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B_Map {

    private static final List<String> myList = Arrays.asList("a", "b", "c", "aa", "bb", "cc");

    // convert all elements to upper case
    public static void main(String[] args) {

        List<String> newList1 = new ArrayList<>();

        final int size = myList.size(); // not to call size() in every iteration
        for (int i = 0; i < size; i++) {
            newList1.add(myList.get(i).toUpperCase());
        }

        // an alternative approach using enhanced for loop
        // for (String s : myList) {
        //    newList1.add(s.toUpperCase());
        // }

        System.out.println(newList1);

        // TODO 1. do the same using streams methods

        // finish below
        // List<String> newList2 = myList.stream()

        // System.out.println(newList2);
        // Assertions.assertThat(newList1).isEqualTo(newList2);
    }
}
