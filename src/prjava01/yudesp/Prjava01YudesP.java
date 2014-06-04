
package prjava01.yudesp;
import java.awt.Desktop;
import java.io.*;

public class Prjava01YudesP {
    public static void main(String[] args) throws IOException{
        File f = new File("prjava01-YudesP.html");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))){
            bw.write("<html>");bw.newLine();
            bw.write("<head>");bw.newLine();
            bw.write("<title>");bw.newLine();
            bw.write("DAW2 M4");bw.newLine();
            bw.write("</title>");bw.newLine();
            bw.write("</head>");bw.newLine();
            bw.write("<body>");bw.newLine();
            bw.write("<Nova p&agrave;gina web de Paco Yudes>");bw.newLine();
            bw.write("</body>");bw.newLine();
            bw.write("</html>");bw.newLine();
            bw.close();
        }
    }
    
}
