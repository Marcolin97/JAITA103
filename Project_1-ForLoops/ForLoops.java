public class ForLoops {
    public static void main(String[] args){
        
        //Utilizziamo for per iniziare un for loop, una funzione che ci permette di ripetere più volte la stessa azioen di codice all'interno dello stesso ciclo

        for(int i = 0; i < 4; i++) {
            System.out.println("Siamo i campioni del mondo!");
            if(i == 1){
                System.out.println("Qui finisce il ciclo for");
                break;
            }                        
        }
        
        System.out.println("*********************************");
        
        //Task: Stampare tutti i numeri interi da 10 a 0.
        
        for(int i=10; i>=0; i--){
            System.out.println(i);
        }
        
        System.out.println("*********************************");
        
        //Task: Stampare tutti i numeri interi da 10 a 0 usando solo i numeri pari.
        
        for(int i = 10; i >= 0; i = i-2){ //In forma contratta i=i-2 si può scrivere come i-=2
            System.out.println(i);
        }

        System.out.println("*********************************");
        
        //La scrittura più giusta per la seguente task è questa;
        
        for(int i=10; i>=0; i--){
            if(i%2==0){
                System.out.println(i);
            }
        }
        
        //Task: creare una regola per cui i numeri pari verranno stampati con una dicitura che li identifichi, e i numeri dispari con la stessa.
        
        for(int i = 1; i <= 10; i++){
            if(i%2 == 0){
                System.out.println(i + " è pari ");
            }else{
                System.out.println(i + " è dispari ");
            }    
        }
    }   
}

