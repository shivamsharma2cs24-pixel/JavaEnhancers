import java.util.Scanner;
public class String_lowenizer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String input=sc.nextLine();
        String upper=input.toUpperCase();
        System.out.println(upper);
        System.out.println(input);
    }
}
//home work --->understand the backend concept of toUpperCase();
//ek string input krani hai uske baad vowels and consonants ka count krna hai ki kitne vowels hai or kitne consonants hain
