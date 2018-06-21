public class BinarySearch {
    public static int RecrusiveBinarySearch(int[] arr, int num){
        return recrusiveBinarySearch(arr,0,arr.length,num);
    }

    private static int recrusiveBinarySearch(int[] arr, int start, int end, int num) {
        if(start>=end){
            return -1;
        }
        int mid = (start+end)/2;
        if(arr[mid]==num){
            return mid;
        }
        else if(arr[mid]<num){
            return recrusiveBinarySearch(arr,mid+1,end,num);
        }
        else {
            return recrusiveBinarySearch(arr,start,mid-1,num);
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,8,11,15,17,18,66};
        System.out.println(RecrusiveBinarySearch(arr,12));
        System.out.println(RecrusiveBinarySearch(arr,11));
        System.out.println(RecrusiveBinarySearch(arr,8));
        System.out.println(RecrusiveBinarySearch(arr,66));
    }
}
