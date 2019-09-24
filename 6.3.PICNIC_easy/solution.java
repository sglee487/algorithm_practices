import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 입력값
3
2 1
1 0
4 6
0 1 1 2 2 3 3 0 0 2 1 3
6 10
0 1 0 2 1 2 1 3 1 4 2 3 2 4 3 4 3 5 4 5

출력값
1
3
4
*/
public class solution {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        // 먼저 답에서 봤듯이 boolean 을 가지는 2차원 배열.
        boolean[][] areFriends = new boolean[10][10];
        int TestCase = keyboard.nextInt();
        int HowManyPeople, HowManyTuple;
        List PeopleArray = new ArrayList<Integer>();
        for (int i=0;i<TestCase;i++){
            HowManyPeople = keyboard.nextInt();
            HowManyTuple = keyboard.nextInt();
            for (int j=0;j<HowManyTuple;j++){
                PeopleArray.add(keyboard.nextInt());
                PeopleArray.add(keyboard.nextInt());
            }
            // 여기서부터 모든 정보가 들어있으니 계산

            System.out.println(TestCase);
            System.out.println(PeopleArray.get(0));
            System.out.println(PeopleArray.get(1));
        }
        System.out.println(areFriends[0][0]);
        areFriends[0][0] = true;
        System.out.println(areFriends[0][0]);
    }
}
