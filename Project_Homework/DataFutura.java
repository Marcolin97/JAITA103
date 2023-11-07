import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class DataFutura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di giorni da aggiungere: ");
        int giorniDaAggiungere = scanner.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, giorniDaAggiungere);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Data tra " + giorniDaAggiungere + " giorni: " + sdf.format(cal.getTime()));

        scanner.close();
    }
}