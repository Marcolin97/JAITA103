public class WhileLoops{   
    public static void main(String[] args){

    //Con i WhileLoops a differenza dei ForLoops,l'iteratore "i" viene posto all'esterno del ciclo.
        
        //Task: Stampre tutti i numeri dal nostro i = 0 a 4.    

        int i = 0;
        while(i < 5){
            System.out.println(i);
            i += 1;
        }
        
        System.out.println("*********************************");    
 
        //Task: Utilizzando il "While" stampio un numero maggiore di 0.5 che verrà dato randomicamente dalla funzione Mat.random. 
        
        double randNum = Math.random();
        while(randNum < 0.5){
            randNum = Math.random();
        }
        System.out.println(randNum);

        System.out.println("*********************************");
        
        //Task: Utilizzando la funzione "do while" stampa numeri randomici da 0 a 1 finchè non stamperà un numero maggiore di 0.5
        
        double randN;
        do{
            randN = Math.random();
            System.out.println(randN);
        }while(randN < 0.5);
    }
}