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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null)
        {
            return null;
        }
        if(head.next==null)
        {
            return null;
        }
        ListNode slow= head;
        ListNode fast=head;
        ListNode current=head;
        while(fast!=null && fast.next!=null)
        {
            current=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        
        current.next=slow.next;
        return head;
    }
}