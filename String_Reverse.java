public class String_Reverse {
    public static void main(String[] args) {
        StringBuffer strbfr=new StringBuffer("aman");
        int st=0;
        int end =strbfr.length()-1;
        while(st<end){
            char temp=strbfr.charAt(end);
            strbfr.setCharAt(end,strbfr.charAt(st));
            strbfr.setCharAt(st,temp);
            st++;
            end--;
        }
        System.out.println(strbfr);

    }
}
