import  java.util.*;
public class ArrayListDemo{
    public static void main(String[] args){

        ArrayList<Integer> arr = new ArrayList<>(20);

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
      //  System.out.println(arr);
      //  System.out.println(arr.contains(30));

      for(int i=0; i<arr.size(); i++){
        System.out.println(arr.get(i));
      }



    }
}