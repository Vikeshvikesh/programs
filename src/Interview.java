public class Interview {
    public static void main(String[] args) {

        String reverse= "";
        String r="";
        String s = "vikesh";

        for (int i = s.length() - 1; i >= 0; i--) {

           r=reverse+s.charAt(i);
            System.out.print(r);
        }



    }
}