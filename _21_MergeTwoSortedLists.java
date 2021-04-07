/*
21. Merge Two Sorted Lists
        Easy
        
        Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.
        
        
        
        Example 1:
        
        Input: l1 = [1,2,4], l2 = [1,3,4]
        Output: [1,1,2,3,4,4]
        
        Example 2:
        
        Input: l1 = [], l2 = []
        Output: []
        
        Example 3:
        
        Input: l1 = [], l2 = [0]
        Output: [0]
        
        
        
        Constraints:
        
            The number of nodes in both lists is in the range [0, 50].
            -100 <= Node.val <= 100
            Both l1 and l2 are sorted in non-decreasing order.


*/

public class _21_MergeTwoSortedLists {
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode current1 = l1;
        ListNode current2 = l2;
        ListNode result = new ListNode(-1);
        ListNode res = result;
        while(current1 != null && current2 != null) {
            if(current1.val <= current2.val) {
                res.next = current1;
                current1 = current1.next;
            } else {
                res.next = current2;
                current2 = current2.next;
            }
            res = res.next;
                
        }
        res.next = current1 != null ? current1 : current2;
        
        return result.next;
    }
}
