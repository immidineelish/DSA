import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();

    int[] arr=new int[n];

    for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();
    }
     int data=scn.nextInt();


     int low=0;
     int high=arr.length-1;
     int ceil=0;
     int floor=0;

     while(low<=high){
         int mid=(low+high)/2;
         if(data<arr[mid]){
             high=mid-1;
             ceil=arr[mid];

         }
         else if(data>arr[mid]){
             low=mid+1;
             floor=arr[mid];
         }else{
             ceil=arr[mid];
             floor=arr[mid];
             break;
                      
        }
     }
     System.out.println(ceil);
     System.out.println(floor);

 }

}