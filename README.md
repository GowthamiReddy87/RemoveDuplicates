# Remove Duplicates from an Array in Java

## Overview
This project demonstrates three approaches to removing duplicate elements from integer arrays in Java.

1. Using two pointers for a sorted array.
2. Using nested loops for an unsorted array without `HashSet`.
3. Using `HashSet` for an unsorted or sorted array.

## Program 1: Remove Duplicates from a Sorted Array

### Approach
- Initialize two pointers, `i` and `j`.
- Set `j = 0` to track the last unique element.
- Traverse the array using `i`, starting from index `1`.
- If `arr[i] != arr[j]`, increment `j` and copy `arr[i]` to `arr[j]`.
- Print elements from index `0` to `j`.

### Example

**Input:**
```text
[1, 2, 2, 3, 3]
```

**Output:**
```text
1 2 3
```

### Complexity
- Time Complexity: `O(n)`
- Auxiliary Space: `O(1)`

**Note:** This approach requires a sorted array.

---

## Program 2: Remove Duplicates from an Unsorted Array Without HashSet

### Approach
- Use an outer loop to select each element.
- Use an inner loop to compare it with all previous elements.
- If a duplicate is found, mark it and stop checking.
- Print the element only if it has not appeared before.

### Example

**Input:**
```text
[3, 1, 2, 3, 1, 4]
```

**Output:**
```text
3 1 2 4
```

### Complexity
- Time Complexity: `O(n²)`
- Auxiliary Space: `O(1)`

**Note:** This approach preserves the order of first occurrences and does not use an additional data structure.

---

## Program 3: Remove Duplicates Using HashSet

### Approach
- Import `java.util.HashSet`.
- Create a `HashSet<Integer>`.
- Traverse the array and add every element to the set.
- The set automatically ignores duplicate values.
- Iterate through the set and print its elements.

### Example

**Input:**
```text
[1, 2, 2, 3, 3]
```

**Output:**
```text
1 2 3
```

### Complexity
- Time Complexity: `O(n)` average
- Auxiliary Space: `O(n)`

**Note:** A `HashSet` does not guarantee insertion order.

---

## Comparison of All Three Approaches

| Feature | Two Pointers | Nested Loops | HashSet |
|---|---|---|---|
| Input | Sorted array | Any order | Any order |
| Time Complexity | `O(n)` | `O(n²)` | `O(n)` average |
| Auxiliary Space | `O(1)` | `O(1)` | `O(n)` |
| Preserves first-occurrence order | Yes | Yes | No guarantee |
| Uses an extra data structure | No | No | Yes |

## Concepts Learned
- Java arrays and loops
- Two-pointer technique
- Nested loops
- HashSet and automatic duplicate removal
- In-place array modification
- Time and auxiliary space complexity

## Conclusion
The best approach depends on the input and memory requirements. Two pointers are efficient for sorted arrays, nested loops work for unsorted arrays without extra data structures, and `HashSet` provides average `O(n)` time when extra memory is acceptable.
