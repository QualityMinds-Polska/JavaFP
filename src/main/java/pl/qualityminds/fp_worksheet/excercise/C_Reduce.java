package pl.qualityminds.fp_worksheet.excercise;

import java.util.List;

public class C_Reduce {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int sum1 = 0;
        final int size = numbers.size(); // not to call size() in every iteration
        for (int i = 0; i < size; i++) {
            sum1 += numbers.get(i);
        }

        // for (Integer number : numbers) {
        //    sum1 += number;
        // }

        System.out.println(sum1);

        // TODO 1. do the same using streams methods

        // finish below
        // int sum2 = numbers.stream()

        // System.out.println(sum2);
        // Assertions.assertThat(sum1).isEqualTo(sum2);
    }
}
