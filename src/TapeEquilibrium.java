import java.util.stream.IntStream;

/*
    ** thanks for @karimhamdanali
    13 March '22

    https://app.codility.com/demo/results/trainingXC7BCQ-XYC/
*/

public class TapeEquilibrium {

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,2,3,4,5,6,7}));
        System.out.println(solution(new int[] {25,28,46,98,24,6,7}));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8

        int result = Integer.MAX_VALUE;
        int total = IntStream.of(A).sum();

        int prev = 0;
        int next;

        for(int p = 1; p < A.length; p++) {
            prev += A[p-1];
            next = total - prev;
            result = Math.min(result, Math.abs(next - prev));
        }

        return result;
    }
}
