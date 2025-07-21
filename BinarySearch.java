public class BinarySearch {
    


public static int binarySearch(int[] arr, int key){
        
      int low=0;
      int high=arr.length-1;
      int mid;

    while(low<=high){

      mid=(low+high)/2;

      if(key==arr[mid]){

        return mid;
      }

      else if(key<arr[mid]){

        high=mid-1;
      }

      else{

        low=mid+1;
      }

} 
return -1;

}
public static void main(String[] args) {
int[] arr={7,21,32,39,46,54,64,71};
int key=21;

int result =binarySearch(arr,key);

if(result!=-1){

    System.out.println("Element is found at index "+result);
}

else{

    System.out.println("Element is not found");
}


}


}
