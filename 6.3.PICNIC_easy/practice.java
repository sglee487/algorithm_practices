import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class main{
    public static void main(String[] args){


        Scanner keyboard = new Scanner(System.in);

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

            // 우선 학생들을 짝 짓고 남는 학생들을 짝 짓고.. 하는걸 반복하는 쪽으로 만들자.
            // 하고 남고 하고 남고 하니까 재귀가 좋을듯.
            int student_number = 0;
            int result = find_tuples(student_number,PeopleArray);
        }

    }

    static int find_tuples(int student_number,List<Integer> PeopleArray){
        
        return 9;
    }


}
