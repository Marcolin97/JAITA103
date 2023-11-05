public class HelloWorld{
    
    // public static int x;  //fuori da ogni metodo si chiama variabile o attributo globale o di classe          
    //                       //protected, private, public servono per definire la visibilità
    

    public static void main(String[] args){
        System.out.println("Hello world");
        String hello="Hello world";
        System.out.println(hello);

        String x1="pippo";

        int x=3160;
        x=3;
        System.out.println(x);
        
        double y=3.14;
        y=3.14;
        System.out.println(y);

        System.out.println(x+y);
        //nella riga sopra èwd indicato come fare addizione.
        System.out.println(x+" "+y);
        //nella riga sopra è indicato come scrivere accanto 2 valori, possono essere uniti anche da un valore che non sia uno spazio.
        System.out.println(x+"\n"+y);
        //nella riga sopra è indicato come scrivere 2 valori stampandoli poi su 2 righe differenti.

        //in aggiunta se java non fosse intelligente dovremmo scrivere System.out.println(System.valueOf(x)+"\n"+System.valueOf(y));

        //String indica un gruppo in cui sono presenti solo stringhe, mentre int racchiude solo interi,
        //double invece indica un gruppo di decimali. Verrà presa tra le variabili l'ultima che gli viene assegnata.

        /*x=true;
        lo usiamo per fare un controllo booleano.*/

        int z=9;
        double w=z;
        System.out.println(w);

        //nella riga sopra ci viene mostrato come ponendo un intero in una regola con double l'intero verrà trasformato in un double, senza darci un errore.

        /*int z=9;
        double w=(double)9;
        System.out.println(w);*/
    
        //nella riga double w=(double)9; il (double) è un cast, che ci aggiunge un operazione che ci farà il calcolatore.

        z=(int)3.14;
        System.out.println(z);
        //così facendo trasformiamo un double in un int con un cast.
        
        final int b=3;
        //final ci da la possibilità di assegnare a una variabile una costante, che ci servirà per evitare sminchiate in corso d'opera del codice.
        
        boolean h=true;
        //boolean ci aiuta a ricevere un risultato in caso di presenza del dato

        //variabili reference sono per oggetti più semplici
    
        /*variabili primitive, per le variabili devono essere alfanumeriche, dove la lettera andrà sempre prima del numero, e dovranno essere uniti, i caratteri speciali non sono accettati eccetto alcune eccezioni
        le variabili in java vanno scritte in minuscolo, per separare le parole in alcuni linguaggi si può usare il "_", ma in java si usa il camelCase esempio: double clienteBalance */

        byte b1=8;
        /*un byte è una cellula di memoria con 8 bit signed disponibili, come valori che possono essere accesi o spenti, ogni bit può avere 2 valori, acceso o spento, all'aumentare dei bit avremmo più risultati ancora.
        fino ad arrivare a 256. applicati però da -128 a 127 come range*/

        short s1=200;
        //lo short invece è composto da 16 bit signed

        int i1=1_000_000_000; //recentemente è stato aggiunto che usando l' "_", possiamo segnare più facilmente i numeri
        // int è invece per 32 bit signed

        long l1=10_000_000_000L; 
        //64 bit signed

        char c1='a'; /*per la scrittura di caratteri all'interno dell'informatica viene utilizzata una codificazione, una delle più famose e l'ASCII e UNICODE usata da java quest'ultima, la quale utilizza
        16 bit unsigned*/

        float f1=3.14F; //32 bit signed 
        double d1=3.14; //64 bit signed
        //meglio utilizzare double per noi in quanto più preciso

        boolean b2=false; //i booleani possono avere solo true e false come valore

        boolean isBalanceNegative=false;
        //if(isBalanceNegative==true); questo è un passaggio non utile in quanto essendo vero o falso sappiamo già che è vero
        if(isBalanceNegative) {
            System.out.println("sei un barbone");
            System.out.println("sei un grosso barbone");
        }    

        double height=170;
        boolean isVeryTall=height>=200;
        double weight=98.7;
        if(height>200)  {
            System.out.println("sei altissimo");
            if (weight>110) {
                System.out.println("potresti giocare a basket ma sei chiatto");
            }   else {
                System.out.println("vai a giocare a basket");
            }

        } else if (height>170 && weight>90)  {
            System.out.println("sei di altezza media e anche cicciottello");
        } else if (height>=180 && weight<=90) {
            System.out.println("sei alto e magro");
        } else {
            System.out.println("tappo");
        }

        //i condizionali if, else e else if sono costruitti per eseguire determinate parti di codice in determinati casi definiti dalla condizione all'interno di parentesi tonde all'interno di una variabile booleana
        


        boolean isSunny=false;
        double temperature=26.5;
        if (isSunny || temperature>25) {
            System.out.println("andiamo tutti al mare");
        }
    } 
}