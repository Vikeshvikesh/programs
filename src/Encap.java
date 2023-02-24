public class Encap {
    private int i;
    private  int j;
    public void setI(int i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public Encap(int i, int j) {
        this.i = i;
        this.j = j;
    }
    public void add(int i,int j)
    {
        int a=i+j;
        System.out.println(a);

    }

    public static void main(String[] args) {
        Encap x=new Encap(2,3);
       x.add(2,3);
    }
}
