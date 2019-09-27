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


        /*
        // 무식하게 풀어보자....
        for (int i_0  = 0; i_0 < clock.length;i_0++){
            for (int i_1  = 0; i_1 < clock.length;i_1++){
                for (int i_2  = 0; i_2 < clock.length;i_2++){
                    for (int i_3  = 0; i_3 < clock.length;i_3++){
                        for (int i_4  = 0; i_4 < clock.length;i_4++){
                            for (int i_5  = 0; i_5 < clock.length;i_5++){
                                for (int i_6  = 0; i_6 < clock.length;i_6++){
                                    for (int i_7  = 0; i_7 < clock.length;i_7++){
                                        for (int i_8  = 0; i_8 < clock.length;i_8++){
                                            for (int i_9  = 0; i_9 < clock.length;i_9++){
                                                for (int i_10  = 0; i_10 < clock.length;i_10++){
                                                    for (int i_11  = 0; i_11 < clock.length;i_11++){
                                                        for (int i_12  = 0; i_12 < clock.length;i_12++){
                                                            for (int i_13  = 0; i_13 < clock.length;i_13++){
                                                                for (int i_14  = 0; i_14 < clock.length;i_14++){
                                                                    for (int i_15  = 0; i_15 < clock.length;i_15++){

                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
         */

        return 0;
    }

    static boolean isAllTwenty(int[] clock){
        for (int i=0;i < clock.length;i++)
            if (clock[i] != 12)
                return false;
        return true;
    }

    static void pushSwitch(int PushNumber, int[] clock){
        switch (PushNumber){
            case 0:
                clock[0] = (clock[0] + 3)%12+1;
                clock[1] = (clock[1] + 3)%12+1;
                clock[2] = (clock[1] + 3)%12+1;
                break;
            case 1:
                clock[3] = (clock[3] + 3)%12+1;
                clock[7] = (clock[7] + 3)%12+1;
                clock[9] = (clock[9] + 3)%12+1;
                clock[11] = (clock[11] + 3)%12+1;
                break;
            case 2:
                clock[4] = (clock[4]+ 3)%12 + 1;
                clock[10] = (clock[10] + 3)%12 + 1;
                clock[14] = (clock[14] + 3)%12 + 1;
                clock[15] = (clock[15] + 3)%12 + 1;
                break;
            case 3:
                clock[0] = (clock[0] + 3)%12+1;
                clock[4] = (clock[4] + 3)%12+1;
                clock[5] = (clock[5] + 3)%12+1;
                clock[6] = (clock[6] + 3)%12+1;
                clock[7] = (clock[7] + 3)%12+1;
                break;
            case 4:
                clock[6] = (clock[6] + 3)%12+1;
                clock[7] = (clock[7] + 3)%12+1;
                clock[8] = (clock[8] + 3)%12+1;
                clock[10] = (clock[10] + 3)%12+1;
                clock[12] = (clock[12] + 3)%12+1;
                break;
            case 5:
                clock[0] = (clock[0] + 3)%12+1;
                clock[2] = (clock[2] + 3)%12+1;
                clock[14] = (clock[14] + 3)%12+1;
                clock[15] = (clock[15] + 3)%12+1;
                break;
            case 6:
                clock[3] = (clock[3] + 3)%12+1;
                clock[14] = (clock[14] + 3)%12+1;
                clock[15] = (clock[15] + 3)%12+1;
                break;
            case 7:
                clock[4] = (clock[4] + 3)%12+1;
                clock[5] = (clock[5] + 3)%12+1;
                clock[7] = (clock[7] + 3)%12+1;
                clock[14] = (clock[14] + 3)%12+1;
                clock[15] = (clock[15] + 3)%12+1;
                break;
            case 8:
                clock[1] = (clock[1] + 3)%12+1;
                clock[2] = (clock[2] + 3)%12+1;
                clock[3] = (clock[3] + 3)%12+1;
                clock[4] = (clock[4] + 3)%12+1;
                clock[5] = (clock[5] + 3)%12+1;
                break;
            case 9:
                clock[3] = (clock[3] + 3)%12+1;
                clock[4] = (clock[4] + 3)%12+1;
                clock[5] = (clock[5] + 3)%12+1;
                clock[9] = (clock[9] + 3)%12+1;
                clock[13] = (clock[13] + 3)%12+1;
                break;
        }
    }


}
