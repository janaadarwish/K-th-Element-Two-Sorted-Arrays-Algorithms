public class Recursive {
    public static int kthElementRecursive(int[] A, int[] B, int n1, int n2, int k, int low, int high){
        if(n1 > n2){
            return kthElementRecursive(B, A, n2, n1, k, low, high);   
        }
        if(low > high){
            return -1;
        }
        int mid1 = (low + high)/2;
        int mid2 = k - mid1;

        int l1 = (mid1 <= 0)? Integer.MIN_VALUE : A[mid1-1];
        int l2 = (mid2 <= 0)? Integer.MIN_VALUE : B[mid2-1];
        int r1 = (mid1 >= n1)? Integer.MAX_VALUE : A[mid1];
        int r2 = (mid2 >= n2)? Integer.MAX_VALUE : B[mid2];

        if(l1 <= r2 && l2 <=r1){
            return Math.max(l1,l2);
        }
        else if(l1 > r2){
            return kthElementRecursive(A, B, n1, n2, k, low, mid1-1);
        }
        else{
            return kthElementRecursive(A, B, n1, n2, k, mid1+1, high);
        }
    }
}