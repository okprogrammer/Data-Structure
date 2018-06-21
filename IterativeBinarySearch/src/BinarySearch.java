public class BinarySearch {
    public static int binarySearch(int[] arr, int num){
        //write your code here
        int start = 0;
        int end = arr.length,mid;
        while(start<end){
            mid = (start+end)/2;
            if(arr[mid]==num){
                return mid;
            }
            else if(arr[mid]<num){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,2,8,9,10,11,15,45};
        System.out.println(binarySearch(arr,15));
        System.out.println(binarySearch(arr,18));
        System.out.println(binarySearch(arr,1));

    }
}
