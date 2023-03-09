import java.util.Arrays;
public class rotatedArray{
    public static void rotate(int arr, int d){
        int i=0;int j=0;
        int k=d;int n=arr.length;
        int arr2[]=new int [n];
        while(k<arr.length){
               arr2[i++]=arr[k++];
        }
        while(i<arr.length&&j<d){
            arr2[i++]=arr[j++];
        }
        for(int a=0;a<arr2.length;a++){
            arr[a]=arr2[a];
        }
       for(int a =0;a<arr.length;a++){
         System.out.print(arr[a]+" ");
    }
}   
    public static void main(String[]args){
        int arr []={1,3,6,11,12,17};
        int s=4;
        rotate(arr, s);
    }
}
