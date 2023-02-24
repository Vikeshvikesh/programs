import java.io.*;

public class SerialDemo {
    public static void main(String[] args) throws Exception {

        Save s=new Save();
        s.i=4;
        File f=new File("obj.txt");
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(oos);

        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Save obj1=(Save ) ois.readObject();

    }
}
class Save implements Serializable{
int i;
}