public class solution_cpp {
    private static int n; // 총 학생 수
    private static boolean[][] areFriends = new boolean[10][10]; // boolean을 2차원 배열로 한다는건 상상도 못했다.
//    areFriends = [[3],[2]];
    public static void main(String[] args){
        boolean[] taken =  new boolean[10];
        int result = countPairings(taken);
        // 기저 사례: 모든 학생이 짝을 찾았으면 한 가지 방법을 찾았으니 종료한다.

    }

    // taken[i] = i번째 학생이 짝을 이미 찾았으면 true, 아니면 false
    static int countPairings(boolean[] taken){
        // 남은 학생들 중 가장 번호가 빠른 학생을 찾는다.
        int firstFree = -1;
        for (int i = 0 ; i < n; ++i) {
            if(!taken[i]) {
                firstFree = i;
                break;
            }
        }
        // 기저 사례: 모든 학생이 짝을 찾았으면 한 가지 방법을 찾았으니 종료한다.
        if (firstFree == -1) return 1;
        int ret = 0;
        // 이 학생과 짝지을 학생을 결정한다.
        for(int pairWith = firstFree+1; pairWith < n; ++pairWith){
            if(!taken[pairWith] && areFriends[firstFree][pairWith]) {
                taken[firstFree] = taken[pairWith] = true;
                ret += countPairings(taken);
                taken[firstFree] = taken[pairWith] = false;
            }
        }

        return ret;
    }
}
