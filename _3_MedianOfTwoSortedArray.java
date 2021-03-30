// 4. Median of Two Sorted Arrays
//       Hard

//       Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.



//       Example 1:

//       Input: nums1 = [1,3], nums2 = [2]
//       Output: 2.00000
//       Explanation: merged array = [1,2,3] and median is 2.

//       Example 2:

//       Input: nums1 = [1,2], nums2 = [3,4]
//       Output: 2.50000
//       Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

//       Example 3:

//       Input: nums1 = [0,0], nums2 = [0,0]
//       Output: 0.00000

//       Example 4:

//       Input: nums1 = [], nums2 = [1]
//       Output: 1.00000

//       Example 5:

//       Input: nums1 = [2], nums2 = []
//       Output: 2.00000



//       Constraints:

//           nums1.length == m
//           nums2.length == n
//           0 <= m <= 1000
//           0 <= n <= 1000
//           1 <= m + n <= 2000
//           -106 <= nums1[i], nums2[i] <= 106

public class _3_MedianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int[] mergedArray = new int[len];
        for(int i=0; i<nums1.length; i++) {
            mergedArray[i] = nums1[i];
        }
        for(int i=0; i<nums2.length; i++) {
            mergedArray[nums1.length + i] = nums2[i];
        }
        Arrays.sort(mergedArray);
        int mid = len/2;
        if(len%2 == 0)
            return (double)(mergedArray[mid-1] + mergedArray[mid])/2;
        else
            return (double)(mergedArray[mid]);
    }
}