import java.io.*;
import java.util.*;


public class Main {
    void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        out.print("The next number for the number ");
        out.print(a);
        out.print(" is ");
        out.print(a + 1);
        out.println(".");
        out.print("The previous number for the number ");
        out.print(a);
        out.print(" is ");
        out.print(a - 1);
        out.println(".");
    }

    void run() {
        try (
                Scanner in = new Scanner(new FileReader("INPUT.TXT"));
                PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"))
        ) {
            solve(in, out);
        } catch (IOException e) {
            throw new Error(e);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
