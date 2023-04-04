import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Inserisci la base del triangolo rettangolo: ");
        double base = Double.parseDouble(br.readLine());

        System.out.println("Inserisci l'altezza del triangolo rettangolo: ");
        double altezza = Double.parseDouble(br.readLine());

        Triangolo triangolo= new Triangolo(base,altezza);
        System.out.println("L'area del triangolo è di " + triangolo.getArea() );
        System.out.println("Il perimetro del trinagolo è di " + triangolo.getPerimetro());

    }
}