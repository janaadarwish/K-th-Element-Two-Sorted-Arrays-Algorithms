# K-th Element of Two Sorted Arrays (Java Implementation)

This project provides a robust Java implementation for finding the $k^{th}$ element of two combined sorted arrays. It explores both linear and logarithmic approaches, focusing on recursion, iterative logic, and boundary condition handling.

## 📁 Project Structure

The project is organized into a clean Java package structure:
* **Main.java**: The entry point for testing both algorithms with various edge cases.
* **Iterative.java**: Contains the iterative solution using a two-pointer approach.
* **Recursive.java**: Implements the optimized Binary Search approach.
  

## 👥 The Development Team

| Name | GitHub Profile |
| :--- | :--- |
| **Haidi** | [@HAIDI-A](https://github.com/HAIDI-A) |
| **Nour Ehab** | [@nour-ehab](https://github.com/nour-ehab) |
| **Noha Emad** | [@Nohaemad19](https://github.com/Nohaemad19) |
| **Jana Amin** | [@janaadarwish](https://github.com/janaadarwish) |
| **menna mohamed** | [@mennamohamed4](https://github.com/mennamohamed4) |

---

## 🚀 Algorithms

### 1. Iterative Approach (`findKth`)
This implementation uses the **Two-Pointer** technique. We maintain two indices (`i` and `j`) and "merge" the arrays virtually. The loop continues until the `count` matches `k`.
* **Efficiency**: $O(k)$ time complexity.
* **Best use case**: Simple to implement and efficient for small values of $k$.

### 2. Recursive Approach (`kthElementRecursive`)
The optimized version uses **Binary Search** logic to partition the arrays into two parts. By ensuring $L_1 \leq R_2$ and $L_2 \leq R_1$, we find the exact cut where the $k^{th}$ element resides.
* **Efficiency**: $O(\log(\min(n_1, n_2)))$ time complexity.
* **Best use case**: High-performance requirements and very large datasets.

## 🛠️ Getting Started

### Prerequisites
* Java Development Kit (JDK) 8 or higher.

### How to Run
1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/janaadarwish/K-th-Element-Two-Sorted-Arrays-Algorithms.git](https://github.com/janaadarwish/K-th-Element-Two-Sorted-Arrays-Algorithms.git)
    ```
2.  **Compile the classes:**
    ```bash
    javac main.java Iterative.java Recursive.java
    ```
3.  **Run the application:**
    ```bash
    java main
    ```

## 🧪 Example Output
When running the provided test cases, you should see:
```text
The 5-th element using iterative approach is: 6
The 5-th element using recursive approach is: 6
The 7-th element using iterative approach is: 256
The 7-th element using recursive approach is: 256
