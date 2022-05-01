package baekjoon.backtracking;


import java.util.Scanner;

public class BOJ_15649 {

    public static int[] arr;
    public static boolean[] visit;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        arr = new int[M];
        visit = new boolean[N];
        dfs(N, M, 0);

    }

    public static void dfs(int N, int M, int depth) {
        if (depth == M) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(N, M, depth + 1);
                visit[i] = false;
            }
        }
    }

//    public static int[] arry;
//    public static boolean[] check;
//
//    public static void dfs(int n, int m, int depth){
//        if(depth == m){
//            for(int val : arry){
//                System.out.print(val + "구분");
//            }
//            System.out.println("");
//            return;
//        }
//
//        for(int i=0 ; i<n;i++){
//            if(!check[i]) {
//                check[i] = true;
//                arry[depth] = i + 1;
//                dfs(n, m, depth+1);
//                check[i]=false;
//            }
//        }
//    }

}
