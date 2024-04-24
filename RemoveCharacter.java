import java.util.*;
public class RemoveCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        // String replaceString = str.replaceAll("[0-9]","");
        // System.out.println(replaceString);

        // String trimString = str.trim();  /// it will remove leading and back space not the space btw word.
        // System.out.println(trimString);

        System.out.println(str.replaceAll("\\s",""));

    }
    
}
