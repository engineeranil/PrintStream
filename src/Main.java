import java.io.File;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        try{
            PrintStream output = new PrintStream("test.txt");
            output.print("213"+123);
            output.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
