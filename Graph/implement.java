package Graph;

import java.util.Scanner;

public class implement {
    public static void dfsTraversal(int adj[][]){
         
    }
    public static int[][] CreateGraph(){
        Scanner s=new Scanner(System.in);
        int n =s.nextInt();
        int e=s.nextInt();
        int adj[][]=new int[n][n];
        for(int i=0;i<e;i++){
                int v1=s.nextInt();
                int v2=s.nextInt();
                adj[v1][v2]=1;
                adj[v2][v1]=1;
        }
        return adj;
    }
    public static void main(String[] args) {
       
        CreateGraph();

    }
}
