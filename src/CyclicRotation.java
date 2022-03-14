/*
    13 March '22

    https://app.codility.com/demo/results/trainingEMKTFR-ZEB/
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CyclicRotation {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}, 2)));
        System.out.println(Arrays.toString(solution(new int[]{34, 22, 31, 49, 51, 98, 24, 43}, 3)));
    }

    public static int[] solution(int[] A, int K) {
        // write your code in Java SE 8

        List<Integer> rotatedList = IntStream.of(A).boxed().collect(Collectors.toList());
        Collections.rotate(rotatedList, K);

        return rotatedList.stream().mapToInt(Integer::intValue).toArray();
    }
}
