// 2. Add Two Numbers
//       Medium

//       You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

//       You may assume the two numbers do not contain any leading zero, except the number 0 itself.



//       Example 1:

//       Input: l1 = [2,4,3], l2 = [5,6,4]
//       Output: [7,0,8]
//       Explanation: 342 + 465 = 807.

//       Example 2:

//       Input: l1 = [0], l2 = [0]
//       Output: [0]

//       Example 3:

//       Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//       Output: [8,9,9,9,0,0,0,1]



//       Constraints:

//           The number of nodes in each linked list is in the range [1, 100].
//           0 <= Node.val <= 9
//           It is guaranteed that the list represents a number that does not have leading zeros.



public class AddTwoNumber {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode current1 = l1;
        ListNode current2 = l2;
        ListNode result = new ListNode(-1);
        ListNode resCurr = result;
        int carry=0;
        while(current1 != null || current2 != null)
        {
            int num1 = current1 != null ? current1.val : 0;
            int num2 = current2 != null ? current2.val : 0;
            int sum = carry + num1 + num2;
            carry = sum / 10;
            resCurr.next = new ListNode(sum % 10);
            resCurr = resCurr.next;
            if(current1 != null) 
            {
                current1 = current1.next;
            }
            if(current2 != null) 
            {
                current2 = current2.next;
            }
        }
        if(carry == 1) 
        {
            resCurr.next = new ListNode(carry);
        }
        return result.next;
        
    }
}   
}
