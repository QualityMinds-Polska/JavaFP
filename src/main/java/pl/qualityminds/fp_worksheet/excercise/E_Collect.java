package pl.qualityminds.fp_worksheet.excercise;

import java.util.List;
import java.util.stream.IntStream;

public class E_Collect {

    private static final List<String> fruits = List.of("apple", "banana", "cherry");
    private static final List<Integer> numbers1 = List.of(1, 2, 3, 4, 5);
    private static final IntStream numbers2 = IntStream.range(1, 6);


    public static void main(String[] args) {

        // TODO 1. using collect method create a map where key is a fruit and value is a length of the fruit

        // finish below
        // Map<String, Integer> fruitmap = fruits.stream()

        // System.out.println(fruitmap);

        // TODO 2. using collect method create a map where key is a number and value is a boolean -
        // true if number is even, false otherwise
        // pick either numbers1 or numbers2 to solve this task

        // finish below
        // Map<Integer, Boolean> map =

        // System.out.println(map);
    }
}
