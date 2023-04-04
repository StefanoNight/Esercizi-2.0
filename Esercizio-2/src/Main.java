import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Inserisci il tuo nome: ");
        String nome=in.nextLine();

        System.out.println("Inserisci il tuo cognome: ");
        String cognome=in.nextLine();

        System.out.println("Ciao " + nome +" " + cognome + " come sei bello oggi!");


}
}