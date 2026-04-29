public class Iterative {
    public int KthElementLinear(int[] arr1, int[] arr2, int k) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0;  
        int count = 0; 
        int answer = 0;

        
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                answer = arr1[i];
                i++;
            } else {
                answer = arr2[j];
                j++;
            }
            count++;
            if (count == k) return answer;
        }

        
        while (i < n1) {
            answer = arr1[i];
            count++;
            if (count == k) return answer;
            i++;
        }

        while (j < n2) {
            answer = arr2[j];
            count++;
            if (count == k) return answer;
            j++;
        }

        return answer;
    }
    
}
