# Remove Duplicates from an Array in Java

## Overview
This project demonstrates two approaches to removing duplicate elements from integer arrays in Java:
1. Removing duplicates from a sorted array using two pointers.
2. Removing duplicates from an unsorted array using nested loops without using `HashSet`.

## Program 1: Remove Duplicates from a Sorted Array

### Approach
- Use two pointers, `i` and `j`.
- Initialize `j = 0` to track the position of the last unique element.
- Traverse the array using `i`, starting from index `1`.
- When `arr[i] != arr[j]`, increment `j` and copy `arr[i]` to `arr[j]`.
- Print the unique elements from index `0` to `j`.

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

**Note:** The array must be sorted for this approach to work correctly.

## Program 2: Remove Duplicates from an Unsorted Array

### Approach
- Traverse the array using an outer loop.
- Use an inner loop to compare the current element with all previous elements.
- If a match is found, mark the element as a duplicate and stop checking.
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

**Note:** This approach preserves the order of the first occurrences and does not use an extra data structure.

## Comparison

| Feature | Sorted Array | Unsorted Array |
|---|---|---|
| Technique | Two pointers | Nested loops |
| Requires sorted input | Yes | No |
| Time complexity | `O(n)` | `O(n²)` |
| Auxiliary space | `O(1)` | `O(1)` |
| Preserves original order | Yes | Yes |

## Concepts Learned
- Java arrays and loops
- Two-pointer technique
- Nested loops
- Duplicate detection
- Time and auxiliary space complexity
- In-place array modification

## Conclusion
Both approaches remove duplicate elements while preserving the order of their first occurrences. The two-pointer approach is more efficient for sorted arrays, while nested loops provide a simple solution for unsorted arrays without using additional data structures.
