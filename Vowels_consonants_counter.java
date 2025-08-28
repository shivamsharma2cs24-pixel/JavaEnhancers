import java.util.Scanner;
public class Vowels_consonants_counter{
    public static void main(String[] args) {
        System.out.print("Enter the string : ");
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        int i=0;
        int vowels=0;
        int consonant=0;
        while(i<str.length()){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||
            str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'||
            str.charAt(i) == 'O' || str.charAt(i) == 'U'){
               vowels++;
            }
            i++;
       }
        System.out.println("vowels present in a string are : "+vowels);
        consonant=str.length()-vowels;
        System.out.println("consonants present in a string are : "+consonant);
    }

}
