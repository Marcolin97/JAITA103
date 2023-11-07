import java.time.DayOfWeek;
import java.time.LocalDate;

public class Methods {
    public static int numero = 0;
    public static void main(String[] args){     //i metodi sono modi per il programma di ricordare set di istruzioni 
        System.out.println(4*3);
        int numero = multiply4by3();
        System.out.println(numero);
        chiediCosaVuoiFareOggi();
        //3000 righe dopo
        chiediCosaVuoiFareOggi();
        // LocalDate oggi = LocalDate.now();
        // DayOfWeek giorno = oggi.getDayOfWeek();
        DayOfWeek giorno = giornoSettimana();
        System.out.println(giorno);
        int z = 30;
        printNumber(z);
        printNumberAndReturnSum(10, 5);
        int s = 32;
        int risultato = printNumberAndReturnSum(20, 30);
        System.out.println(risultato);

    }
    
    public static int printNumberAndReturnSum(final int n, final int b){
        System.out.println("il primo valore passato è: " + n);
        System.out.println("il secondo valore passato è: " + b);
        return n+b;
    }
    
    public static void printNumber(int n){
        System.out.println("Il Valore passato è: "+ n);

    }

    public static DayOfWeek giornoSettimana(){
        LocalDate oggi = LocalDate.now();
        DayOfWeek giorno = oggi.getDayOfWeek();
        return giorno;
    }
    public static void chiediCosaVuoiFareOggi(){
        LocalDate giorno = LocalDate.now();
        System.out.println(giorno);
        System.out.println("Cosa desideri oggi?");
    }



    public static int multiply4by3(){     
                                          
        return 4*3;

    }
    public static void quadrato(){     
        //static rende i metodi globali per essere utilizzati in altri metodi 
        //con void non il metodo non rimanderà nulla                                    
        int numero1=multiply4by3();
        int numero2=multiply4by3();
        System.out.println(numero1 * numero2);
    }




}
