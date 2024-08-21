// public class ReverseString{
//     public static void main(String[] args){
//         String str = "madam";
//         String Original = str.toLowerCase();
//         String rev ="";

//         char[] ch = str.toCharArray();
//         for(int i=ch.length-1 ;i>=0; i--){
//             System.out.println(ch[i]);
//            rev = rev + ch[i];
            
//         }
//         String reverseArr = new String(rev);
//         System.out.println(reverseArr);

//         if(Original.equals(rev)){
//             System.out.println("Palindrome");

//         }else{
//             System.out.println("Not a palindrome");
//         }
       
       
        


//     }
// }






//    <<<-------- SECOND METHOD TO REVERSE AN STRING .
// import java.util.*;
// public class ReverseString{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the String : ");

//         String str = sc.nextLine();
//         String str = "Nilesh";
        
//         String Original = str.toLowerCase();
//         String revString ="";
//         if(str==null || str.length()==0){
//             System.out.println("invalid ");
//         }

//         for(int i =Original.length()-1; i>=0; i--){
//             revString = revString +  Original.charAt(i);
//         }
//         System.out.println(revString);







//         sc.close();
        
//     }
// }


// <<<<<<--- 3rs method to reverse String-->
// import java.util.*;
// public class ReverseString {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String str =sc.nextLine();

//         StringBuilder sb = new StringBuilder(str);
//         StringBuffer sb = new StringBuffer(str);
//         sb.reverse();
//         System.out.println(sb);


//     }
// }