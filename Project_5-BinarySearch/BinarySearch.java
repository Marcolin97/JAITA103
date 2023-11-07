public class BinarySearch {
    public static void main(String[] args) {
        int[]   arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40};
        int     target = 10;
        int     left = 0;
        int     right = arr.length - 1;
        int     mid;
        boolean isFound = false;
        
        while (!isFound && left <= right) {
            mid = (left + right) / 2;

            if (arr[mid] == target) {
                System.out.println("L'obiettivo è stato trovato nella cella " + mid); 
                isFound = true;
            } else if (arr[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }   
        if (isFound == false){
            System.out.println("L'obiettivo non è presente all'interno dell'array"); 
        }            
    }
}                                                                                   