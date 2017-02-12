import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class AlgEx {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("input.txt"));
        FileWriter writer = new FileWriter("output.txt");
        int vertexNum = scanner.nextInt();
        int[] parents = new int[vertexNum];
        int u;
        int v;
        for (int i = 0; i < vertexNum - 1; i++) {
            u = scanner.nextInt();
            v = scanner.nextInt();
            parents[v - 1] = u;
        }
        for(int i = 0; i < vertexNum - 1; i++){
            writer.write(parents[i] + " ");
        }
        writer.write(parents[vertexNum - 1] + "");
        writer.close();
        scanner.close();
    }
}
