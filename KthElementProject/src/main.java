public class main {
    public static void main(String[] args) {
        
        Iterative solver1 = new Iterative();

        // Example 1
        int[] arr1 = {2, 3, 6, 7, 9};
        int[] arr2 = {1, 4, 8, 10};
        int k1 = 5;

        // Example 2
        int[] arr3 = {100, 112, 256, 349, 770};
        int[] arr4 = {72, 86, 113, 119, 265, 445, 892};
        int k2 = 7;

        // Output
        System.out.println("Test Case 1 of non-recursive algorithm (Expected 6): " + solver1.findKth(arr1, arr2, k1));
        System.out.println("Test Case 2 of non-recursive algorithm (Expected 256): " + solver1.findKth(arr3, arr4, k2));
    }

    
}
