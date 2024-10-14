
import java.util.*;


public class Search{
  
  static void searhElement(int[] arr,int n ){
    for(int i=0; i<arr.length; i++ ){
      if(arr[i] == n){
        System.out.println("yes it is in the arrray ");
        return;
      }
    }

  }
  public static void main(String[] args){

    

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array : ");
    int size = sc.nextInt();

    int[] arr = new int[size];

    for(int i=0; i< size; i++){
      arr[i] =sc.nextInt();
    }

    System.out.println("Array element are : ");
    
    for(int i=0; i< size; i++){
      System.out.print(arr[i]+" ");
    }

    System.out.println();

    searhElement(arr, 5);





  }
}