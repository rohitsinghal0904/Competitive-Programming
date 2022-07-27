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
    public int getDecimalValue(ListNode head) {
      String binaryValue="";
    while(head!=null) {
    	binaryValue+=Integer.toString(head.val);
    	head=head.next;
    }
    return (Integer.parseInt(binaryValue,2)); 
    }
}