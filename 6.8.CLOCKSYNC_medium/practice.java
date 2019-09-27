/*
스위치 번호      연결된 시계들     스위치 번호        연결된 시계들
    0             0,1,2               5                0,2,14,15
    1             3,7,9,11            6                3,14,15
    2             4,10,14,15          7                4,5,7,14,15
    3             0,4,5,6,7           8                1,2,3,4,5
    4             6,7,8,10,12         9                3,4,5,9,13
 */
/*
예제 입력
2
12 6 6 6 6 6 12 12 12 12 12 12 12 12 12 12
12 9 3 12 6 6 9 3 12 9 12 9 12 12 6 6


예제 출력
2
9
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class practice {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter());
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        int[] clock = new int[16];

        for (int i = 0; i < q; i++) {
            String[] containerRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < containerRowItems.length; j++) {
                int containerItem = Integer.parseInt(containerRowItems[j]);
                clock[j] = containerItem;
            }

            // 지금 생각하는 거는
            // 입력값 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 이 정답? 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 이 정답? 다 한다음
            // 정답이면 기존의 정답과 총 값 비교해서 최소 출력하게.
            // 즉 완전탐색 방법을 생각중..

            int result = calculate_start(clock);


            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }

    static int calculate_start(int[] clock){


        return 0;
    }


}
