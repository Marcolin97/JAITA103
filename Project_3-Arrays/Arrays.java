public class Arrays {
    public static void main (String[] args){
        int x = 5;
        int [] nums = new int[5];
        nums[0] = 27;
        nums[nums.length - 1] = 30;

        for(int i = 0; i < nums.length; i++){
            System.out.print(i + "->");
            System.out.println(nums[i]);
        }

        System.out.println("*********************************");

        //Task: Assegnare il numero dell'indice all'interno delle posizioni ad esso relative.

        for(int i = 0; i < nums.length; i++){
            nums[i] = i;
            System.out.println(nums[i]);
        }
        
        System.out.println("*********************************");

        //Task: Assegnare il doppio dell'indice alle posizioni pari
        //Assegnare il triplo dell'indice in quelle dispari
    
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                nums[i] = i * 2;
            } else {
                nums[i] = i * 3;
            }
        }
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        
        System.out.println("*********************************");
        
        //Task: Definire una variabile che stampata dia il valore massimo che è presente nell'array
    
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > max){
                max=nums[i];
            }
        }
        System.out.println(max);

        System.out.println("*********************************");

        //Task: Definire una variabile che stampata dia il valore minimo che è presente nell'array
    
        int min = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        System.out.println(min);
    
        System.out.println("*********************************");

        //Task: Definire una variabile sum che conterrà la somma dei valori nelle celle dell'array.

        double sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];         //Forma meno elegante: sum = sum + nums[i];
        }
        System.out.println(sum);

        System.out.println("*********************************");

        //Task: Stampare la media dei dati all'interno delle celle dell'array.

        System.out.println(sum / nums.length);

        System.out.println("*********************************");

        //Task: scrivere un codice che inverta i primi 2 valori all'interno delle rispettive celle dell'array.
        
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;
        System.out.println(nums[0]+ " <----> " +nums[1]);
        
        System.out.println("*********************************");
        
        //Task: Tramite forloop identificare la posizione di un valore target 
        //all'interno delle celle dell'array per poi stamparne la posizione
        
        boolean found=false;
        int target=4;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Sto Analizzando la posizione " + i);
            if (nums[i] == target) {
                found = true;
            }
        }   
        System.out.println(found);
    
        System.out.println("*********************************");

        //Task: Scrivere codice che identifichi i duplicati all'interno delle celle dell'array e ci segni quante volte vengono ripetuti.

        nums=new int [] {3, 9, 0, 9, 0};
        int repeated = 1;
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    repeated++;
                }
            }
            if (repeated > 1){
                break;
            }
        }
        System.out.println(repeated);
        
        System.out.println("*********************************");

        int mode=-1;
        int pos=-1;
        int howMany=1;
        int value=-1;
        nums=new int [] {3, 9, 0, 9, 0};
        for (int i=0; i<nums.length-1; i++){
            howMany=1;
            for (int j=i+1; j<nums.length; j++){
                if (nums[i]==nums[j]){
                    howMany++;
                }    
            }
            if (howMany>mode){
                mode=howMany;
                pos=i;
                value=nums[i];
            }
        }
        System.out.println(mode + "/" + pos +"/" + nums[pos] + "/" + value);
    }   
}
