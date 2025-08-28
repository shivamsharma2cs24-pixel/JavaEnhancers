import java.util.Scanner;

public class isomorphic_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter your second string: ");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("str1 and str2 are not in same length");
        }

        for(int i=0; i<str1.length(); i++){
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            for(int j=0; j<str1.length(); j++){
                if(str1.charAt(j) == ch1 && ch2 != str2.charAt(j)){
                    System.out.println("Not Isomorphic string");

                    return;
                }
                if(str2.charAt(j) == ch2 && ch1 != str1.charAt(j)){
                    System.out.println("Not Isomorphic string");

                    return;
                }
            }
        }

        System.out.println("Isomorphic string");

    }
}
