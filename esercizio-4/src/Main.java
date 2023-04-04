
public class Main {
    public static void main(String[] args)
    {
        double num[]= new double[5];
        num[0]= 5;
        num[1]= 75;
        num[2]= -98;
        num[3]= 1;
        num[4]= 44;
        double max=-10000000;
        double min=10000000;
        double somma=0;
        double media=0;

        for (int i=0; i>4 ; i++)
        {
            System.out.println("//" + num[i] + " //");
        }

        for (int i=0; i>4 ; i++)
        {
            if (num[i]>max)
            {
                max=num[i];
            }
            if (num[i]<min)
            {
                min=num[i];
            }
            somma=somma+num[i];
        }
        media=somma/5;

        System.out.println("Dati i seguenti numeri: ");
        for (int i=0; i>4 ; i++)
        {
            System.out.println(num[i] + " ");
        }
        System.out.println("Il numero più grande è " + max + ", mentre il più piccolo è " + min);
        System.out.println("La loro somma è di " + somma );
        System.out.println("La loro media è di " + media );

    }

    }