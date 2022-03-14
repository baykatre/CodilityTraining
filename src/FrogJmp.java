/*
    13 March '22

    https://app.codility.com/demo/results/training8DPUCX-A5N/
*/

public class FrogJmp {

    public static void main(String[] args) {
        System.out.println(solution(10, 85, 30));
        System.out.println(solution(1, 8000, 80));
        System.out.println(solution(100, 50000, 100));
        System.out.println(solution(8, 8, 8));
    }

    public static int solution(int X, int Y, int D) {
        return ((Y - X) + D - 1) / D;
    }
}
