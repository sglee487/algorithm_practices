public class solution {
    public static void main(String[] args){
        // 먼저 답에서 봤듯이 boolean 을 가지는 2차원 배열.
        boolean[][] areFriends = new boolean[10][10];
        System.out.println(areFriends[0][0]);
        areFriends[0][0] = true;
        System.out.println(areFriends[0][0]);
    }
}
