import java.io.*;

public class FileRead {
    public static void main(String[] args) {
        FileReader fin = null;
        try {
            fin = new FileReader("c:\\windows\\system.ini");
            int c;
            while ((c = fin.read()) != -1) System.out.println((char)c);
            fin.close();
        } catch (IOException e) {System.out.println("IO Error");}
    }
}
