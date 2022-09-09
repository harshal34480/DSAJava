package dataStructureAndAlgorithm;

public class linearSearch{
    public static  void main(String[] args){
     int[] array = {34,56,32,45,78,42,98,90}; // we give the sorted or unsorted array
     int target  = 32;                        // enter the number we want to find in array
     int ans = ls(array, target);             // call the function 
     System.out.print(ans);
    }
    
    // create the function that find the number in array
    static int ls(int[] array, int target){

        // loop that iterate through the array
        for (int i = 0; i < array.length; i++){

            // if the number in array is equal to target then it return the index of that number.
            if (array[i] == target){
                return i;
            }
        }

        // if the element is not present in the array it return -1.
        return -1;
    }
}