# K-th Element of Two Sorted Arrays

## Project Description
This repository contains the implementation of the **K-th Element of Two Sorted Arrays** problem for the *Algorithms Practical Tasks 2026*. The objective is to identify the element that would occupy the $k$-th position in a combined sorted array of two separate sorted arrays ($m$ and $n$), optimized for performance.

## Deliverables
* **Implementation:** Dual approach featuring Iterative and Recursive solutions.
* **Documentation:** Detailed pseudo-code and complexity analysis.
* **Analysis:** Comparison of performance metrics between linear and logarithmic approaches.

---

## 1. Iterative Algorithm (Non-Recursive)

### Logic
The iterative version utilizes a **Two-Pointer** technique. We maintain pointers for both arrays and "walk" through them $k$ times, always picking the smaller of the two elements to simulate a merge without creating a new array.

### Pseudo-code
```text
FUNCTION findKthIterative(arr1, arr2, k):
    ptr1 = 0, ptr2 = 0, count = 0
    current_element = -1

    WHILE count < k:
        IF ptr1 < arr1.length AND (ptr2 >= arr2.length OR arr1[ptr1] < arr2[ptr2]):
            current_element = arr1[ptr1]
            ptr1++
        ELSE:
            current_element = arr2[ptr2]
            ptr2++
        count++
    
    RETURN current_element
```

---

## 2. Recursive Algorithm (Divide & Conquer)

### Logic
This approach uses **Binary Search** logic. By comparing the $k/2$-th elements of both arrays, we can determine which section of which array cannot possibly contain the $k$-th element. We then "discard" that section and recurse on the remaining parts.

### Pseudo-code
```text
FUNCTION findKthRecursive(arr1, start1, arr2, start2, k):
    // Base Cases
    IF start1 >= arr1.length: RETURN arr2[start2 + k - 1]
    IF start2 >= arr2.length: RETURN arr1[start1 + k - 1]
    IF k == 1: RETURN min(arr1[start1], arr2[start2])

    // Partitioning
    mid = k / 2
    val1 = (start1 + mid - 1 < arr1.length) ? arr1[start1 + mid - 1] : INFINITY
    val2 = (start2 + mid - 1 < arr2.length) ? arr2[start2 + mid - 1] : INFINITY

    IF val1 < val2:
        RETURN findKthRecursive(arr1, start1 + mid, arr2, start2, k - mid)
    ELSE:
        RETURN findKthRecursive(arr1, start1, arr2, start2 + mid, k - mid)
```

---

## 3. Complexity Analysis & Comparison

| Feature | Iterative (Two-Pointer) | Recursive (Binary Search) |
| :--- | :--- | :--- |
| **Time Complexity** | $O(k)$ | $O(\log k)$ |
| **Space Complexity** | $O(1)$ | $O(\log k)$ |
| **Strategy** | Linear Scan | Divide & Conquer |

### Comparison Summary
* **Iterative:** Highly space-efficient with $O(1)$ auxiliary space. It is ideal for smaller values of $k$.
* **Recursive:** Superior performance for large-scale data. While it uses more stack space, the $O(\log k)$ time complexity makes it the standard for competitive programming and high-performance systems.

---

## Student Information
* **Name:** Jana Darwish
* **Course:** Algorithms (Practical Task)
* **Date:** April 2026
```

### Pro-Tip for your GitHub:
Since you’re using **DaVinci Resolve** for your vlogs, you could actually record a quick 30-second "demo" of your code running, export it as a GIF, and drop it into the `README` as well. It makes the repo look incredibly professional! 

Does this cover everything you need for the submission?
