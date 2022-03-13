/*
    13 March '22

    https://app.codility.com/demo/results/trainingVVCS9B-A4H/
*/

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PermMissingElem {

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,2,3,4,6,7}));
        System.out.println(solution(new int[] {1,2,3,4,5,6,7,8,9,11,12,13,14,15,16}));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8

        List<Integer> fullList = IntStream.range(1, (A.length + 1)).boxed().collect(Collectors.toList());

        int result = A.length + 1;
        for(int i = 0; i < fullList.size(); i++){
            result ^= fullList.get(i);
            result ^= A[i];
        }

        return result;
    }
}
