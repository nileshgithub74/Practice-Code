import java.util.*;
public class RemoveCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        String replaceString = str.replaceAll("[0-9]","");
        System.out.println(replaceString);

    }
    
}
