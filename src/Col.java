import java.util.ArrayList;
import java.util.Stack;

public class Col {

    public static void main(String[] args) {

        Stack s=new Stack();
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.pop();
        s.peek();
        s.search(4);
        s.capacity();
        s.indexOf(3);
       for (int i=0; i<=s.size(); i++){
           System.out.println(i);
       }
    }
}
