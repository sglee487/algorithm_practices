https://www.hackerrank.com 사이트에서 데이터 인풋 아웃풋 방법을 가져왔다.

입력에는 두가지 방법을 알아냈는데, 첫번째 방법은 BufferRearder를 이용하는 방법임.\
그래서 입출력 방식은 이렇게 된다.\
(Compare_the_Triplets 코드 참조)\
<code>

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        bufferedReader.close();
        bufferedWriter.close();
        
</code>

또 다른 입력 방식은 Scanner를 이용하는 것이다.\
(Organizing_Containers_of_Balls 코드 참조)

<code>

        private static final Scanner scanner = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        
                int q = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
                for (int qItr = 0; qItr < q; qItr++) {
                    int n = scanner.nextInt();
                    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
                    int[][] container = new int[n][n];
        
                    for (int i = 0; i < n; i++) {
                        String[] containerRowItems = scanner.nextLine().split(" ");
                        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
                        for (int j = 0; j < n; j++) {
                            int containerItem = Integer.parseInt(containerRowItems[j]);
                            container[i][j] = containerItem;
                        }
                    }
        
                    String result = organizingContainers(container);
        
                    bufferedWriter.write(result);
                    bufferedWriter.newLine();
                }
        
                bufferedWriter.close();

</code>

입출력 방식은 코드마다 상황마다 다르다. 그러니 위 예제 코드를 직접 들어가서 확인 한 후에 어떻게 입출력을 해야 할 지 판단하자.

위 방식을 적용 할 경우, 프로그램을 실행한 뒤 예제 입력 부분을 클립보드에 복사 붙여넣기 하고 엔터 몇번 눌러주면 된다.