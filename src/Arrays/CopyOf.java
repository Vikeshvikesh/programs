package Arrays;

import java.lang.reflect.AnnotatedArrayType;

public class CopyOf {
    public void add() {
        String s1 = "vikesh";
        String s2 = "vikesh";
        String s3 = s1 + s2;
        System.out.println(s3);;
    }

    public static void main(String[] args) {
        CopyOf x=new CopyOf();
        x.add();

        int[] y={1,2,3,4,5};
        for (int i:y){
            System.out.println(i);
        }
        x.load(2,3);
        x.load(2,3,4);

    }
   public void load(int i, int j){
        int m=i+j;
       System.out.println(m);
   }
   public void load(int i, int j, int k){
        int m=i+j+k;
       System.out.println(m);
   }

    public void divide(){
        int x=2;
        int y=0;
        try {
            int z=x/y;
            System.out.println(z);
        }
        catch ( Exception e){
            System.err.println(e);
        }
    }


}
  class XYZ extends CopyOf{
      public static void main(String[] args) {
          XYZ x=new XYZ();
          x.load(4,5,6);
      }

}
interface A{
    private void add(){

    }
}
class B implements A{
    B b=new B();

}






