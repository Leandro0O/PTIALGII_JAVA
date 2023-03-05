import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qauntos valores deseja armazenar:");
        int[] v = new int [ scanner.nextInt()];   
        for(int i = 0; i < v.length ; i++){
            System.out.printf("Informe o %d° valor:\n", i+1);
            v[i] = scanner.nextInt();
        }
        System.out.printf("A maior diferença é: %d\n", mDiferenca(v));
        System.out.printf("Esta em ordem crescente? %s", oCrescente(v));
        scanner.close();
    }
    public static int mDiferenca(int[] v){
        IntSummaryStatistics stat = Arrays.stream(v).summaryStatistics();
        return (stat.getMax() - stat.getMin());
    }
    public static Boolean oCrescente(int[] v){
        Boolean ordem = false;
        for(int i = 1 ; i < v.length; i++){
            ordem =  v[i] > v[i -1] ? true : false;
        }
        return ordem;
    }
}
