public class main {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 6, 7, 9};
        int[] array2 = {1, 4, 8, 10};
        int k = 5; 

        Iterative iterativeObj = new Iterative();
        int resultIterative = iterativeObj.KthElementLinear(array1, array2, k);
        System.out.println("The " + k + "-th element using iterative approach is: " + resultIterative);

        int low = Math.max(0, k - array1.length);
        int high = Math.min(k, array2.length);

        int resultRecursive = Recursive.kthElementRecursive(array1, array2, array1.length, array2.length, k, low, high);
        System.out.println("The " + k + "-th element using recursive approach is: " + resultRecursive);

        int[] array3 = {100, 112, 256, 349, 770};
        int[] array4 = {72, 86, 113, 119, 265, 445, 892};
        int k2 = 7;

        int res1Iterative = iterativeObj.KthElementLinear(array3, array4, k2);
        System.out.println("The " + k2 + "-th element using iterative approach is: " + res1Iterative);

        int res2Recursive = Recursive.kthElementRecursive(array3, array4, array3.length, array4.length, k2, 0, k2);
        System.out.println("The " + k2 + "-th element using recursive approach is: " + res2Recursive);


    }

    
}
