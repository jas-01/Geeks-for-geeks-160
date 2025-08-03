class Solution {
    public static int largest(int[] arr) {
        if(arr.length==1) return arr[0];
     int max=arr[0];
     for(int i=1;i<arr.length;i++){
         if(arr[i]>=max){
             int temp=arr[i];
             arr[i]=max;
             max=temp;
     }
    }return max;
    }
}
