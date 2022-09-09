package dataStructureAndAlgorithm;

// in binary search array must be sorted
public class BinnarySearch {
    public static void main(String[] args){
    int[] array = {1,2,3,4,5,6,7,8,9,10}; // give the sorted array as input
    int target = 12;                       // target
    int ans = bs(array, target);          // call the array
    System.out.println(ans);
    }
    
    // function create for find the number in array
    static int bs(int[] array, int target){

        // first declare the  variable start which shows the first index of array
        int start = 0;            
        
        // second declare the variable end which shows the last index of array
        int end = array.length - 1;

        // while loop for iterate through the array
        while(start <= end){

            // first we find the mid element ie. first mid element is (0 + 9)/2 = 4.5 ie. 4 
            int mid = start + (end - start)/2;

            // it check if target is greater than mid element
            if(target > array[mid]){

                // if yes then the start index is increase by mid + 1
                // because now we do not have to check the value of the left side of mid index
                start = mid + 1;

            }
            
            // check if the target is less than mid element 
            else if(target < array[mid]){

                
                // if no then the end index is decreace by mid - 1
                // because now we do not have to check the value of the right side of mid index   
                end = mid - 1;

            // if target is equal to mid then return mid index
            }else{
                return mid; 
            }
        }

        // if target is not present in the  array return -1
        return -1;
    }
}
