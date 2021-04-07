/*
19. Remove Nth Node From End of List
    Medium

    Given the head of a linked list, remove the nth node from the end of the list and return its head.

    Follow up: Could you do this in one pass?

    

    Example 1:

    Input: head = [1,2,3,4,5], n = 2
    Output: [1,2,3,5]

    Example 2:

    Input: head = [1], n = 1
    Output: []

    Example 3:

    Input: head = [1,2], n = 1
    Output: [1]

    

    Constraints:

        The number of nodes in the list is sz.
        1 <= sz <= 30
        0 <= Node.val <= 100
        1 <= n <= sz

    Accepted
    829,294
    Submissions
    2,313,087

    
*/

public class _19_RemoveNthNodeFromEndofList {
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = length(head);
        if(n == length)
            return head.next;
        
        length -= n;
        ListNode current = head;
        ListNode previous = current;;
        while(length != 0) {
            previous = current;
            current = current.next;
            length--;
        }
        previous.next = current.next;
        return head;
    }
    
    public int length(ListNode head) {
        int count=0;
        ListNode current = head;
        while(current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

}
