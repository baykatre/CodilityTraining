/*
    13 March '22

    https://app.codility.com/demo/results/trainingXC7BCQ-XYC/
*/

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        System.out.println(solution(new int[] {4,2,3,4,2,2,4,4,2}));
        System.out.println(solution(new int[] {9,2,2,2,7,9,2}));
        System.out.println(solution(new int[] {32456,1287,32456,32456,32456,1287,32}));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8

        int result = 0;

        for(int a : A){
            result ^= a;
        }

        return result;
    }
}
