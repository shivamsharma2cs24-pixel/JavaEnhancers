public class String_To_lower_upper_case_code {
    public static void main(String[] args) {
        String str="amIt kuMar";
        for(int i=0;i<str.length();i++){
            StringBuffer sb =new StringBuffer();
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                ch=(char)(ch-32);
                sb.append(ch);
            }
            else{
                sb.append(ch);
            }
            System.out.print(sb);

        }
    }
}
// string buffer methods---> insert append