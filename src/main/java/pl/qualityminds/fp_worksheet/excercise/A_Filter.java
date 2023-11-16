package pl.qualityminds.fp_worksheet.excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A_Filter {

    private static final List<String> myList = Arrays.asList("a", "b", "c", "aa", "bb", "cc");
    private static final List<String> myList2 = Arrays.asList("a", "b", "c", "aa", "bb", "cc");

    // filter out all elements containing "b"

    public static void main(String[] args) {

        List<String> newList1 = new ArrayList<>();

        final int size = myList.size(); // not to call size() in every iteration
        for (int i = 0; i < size; i++) {
            if (myList.get(i).contains("b")) {
                newList1.add(myList.get(i));
            }
        }

        // an alternative approach using enhanced for loop
        // for (String s : myList) {
        //    if (s.contains("b")) {
        //        newList1.add(s);
        //    }
        // }

        System.out.println(newList1);

        // TODO 1. do the same using streams methods

        // finish below
        // List<String> newList2 = myList.stream()
        // System.out.println(newList2);
        // Assertions.assertThat(newList1).isEqualTo(newList2);

        // TODO 2. do the same using removeIf, use myList2 // bonus

        // finish below
        // myList2.

        // System.out.println(myList2);
    }
}
