# **Bubble Sort Algorithm**

* This is one of the most straightforward sorting algorithms; the core idea is to keep swapping adjacent elements of an array if they are in an incorrect order until the collection is sorted.
* As sorting is performed by swapping, we can say it performs in-place sorting.
* If two elements have same values, resulting data will have their order preserved – which makes it a stable sort.

Implementation

we iterate through it while comparing adjacent elements, and swapping them if necessary. For an array of size n, we perform n-1 such iterations.

Complexity:

* Time Complexity: O(n^2) as there are two nested loops.
* Auxiliary Space: O(1)

# **Selection Sort Algorithm**

* Selection Sort begins with the element in the 1st position of an unsorted array and scans through subsequent elements to find the smallest element. Once found, the smallest element is swapped with the element in the 1st position.
* Then moves on to the element in the 2nd position and scans through subsequent elements to find the index of the 2nd smallest element. Once found, the second smallest element is swapped with the element in the 2nd position.
* This process goes on until we reach the n-1th element of the array, which puts the n-1th smallest element in the n-1th position. The last element automatically falls in place, in the n-1th iteration, thereby sorting the array.
* The largest element instead of the smallest element to sort the array in descending order.

Complexity:

Time Complexity: O(n^2) as there are two nested loops.

* One loop to select an element of Array one by one = O(n)
* Another loop to compare that element with every other Array element = O(n)
* Therefore overall complexity = O(n) * O(n) = O(n*n) = O(n^2)

Auxiliary Space: O(1) as the only extra memory used is for temporary variables while swapping two values in Array. The selection sort never makes more than O(N) swaps and can be useful when memory writing is costly.

# **Merge Sort Algorithm**

Merge sort is a “divide and conquer” algorithm, wherein we first divide the problem into subproblems. When the solutions for the subproblems are ready, we combine them together to get the final solution to the problem.

We can easily implement this algorithm using recursion, as we deal with the subproblems rather than the main problem.

* Divide: In this step, we divide the input array into 2 halves, the pivot being the midpoint of the array. This step is carried out recursively for all the half arrays until there are no more half arrays to divide.
* Conquer: In this step, we sort and merge the divided arrays from bottom to top and get the sorted array.

Implementation 

* we’ll write a mergeSort function that takes in the input array and its length as the parameters. This will be a recursive function, so we need the base and the recursive conditions.
* The base condition checks if the array length is 1 and it will just return. For the rest of the cases, the recursive call will be executed.
* For the recursive case, we get the middle index and create two temporary arrays, l[] and r[]. Then we call the mergeSort function recursively for both the sub-arrays.
* Next, we call the merge function, which takes in the input and both the sub-arrays, as well as the start and end indices of both the sub arrays.
* The merge function compares the elements of both sub-arrays one by one and places the smaller element into the input array.
* When we reach the end of one of the sub-arrays, the rest of the elements from the other array are copied into the input array, thereby giving us the final sorted array.

Complexity

Time Complexity -> T(n) = 2T(n/2) + O(n) - 2times half halves + merge
                    O(nlogn) - worst, average and best

Space Complexity -> O(n) - creating temporary array for every recursive call. 