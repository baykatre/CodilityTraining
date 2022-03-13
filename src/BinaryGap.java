import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    12 March '22

    https://app.codility.com/demo/results/training7WR4BW-Y9E/
*/

public class BinaryGap {

    public static void main(String[] args) {
        System.out.println(solution(34));
        System.out.println(solution(45));
        System.out.println(solution(34298));
        System.out.println(solution(Integer.MAX_VALUE));
    }

    public static int solution(int N) {
        final String bits = Integer.toBinaryString(N);
        System.out.println(bits);

        Pattern pattern = Pattern.compile("1");
        Matcher matcher = pattern.matcher(bits);

        List<Integer> positionList = new ArrayList<>();
        while (matcher.find()) {
            positionList.add(matcher.end());
        }
        int lastResult = 1;
        for(Integer p : positionList){
            if(positionList.indexOf(p) == positionList.size() - 1){
                break;
            }
            Integer nextPosition = positionList.get(positionList.indexOf(p) + 1);
            if((nextPosition - p) > lastResult){
                lastResult = nextPosition - p;
            }
        }

        return lastResult - 1;
    }
}
