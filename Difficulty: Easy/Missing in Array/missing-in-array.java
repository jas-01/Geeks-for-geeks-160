class Solution {
    long missingNum(int arr[]) {
        //jas01
        int n=arr.length+1;
        long max=(long)n*(n+1)/2,s=0;
    for(int num:arr){
        s+=num;
    }
    return max-s;
    }
}