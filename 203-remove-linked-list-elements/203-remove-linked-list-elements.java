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
    public ListNode removeElements(ListNode head, int val) {
//         ListNode current= head;
//         ListNode previous=head;
//         while(current!=null)
//         {
//             if(current.val==val)
//             {
//                 previous.next=current.next;
//             }
//             current=current.next;
//             previous=current;
//         }
//         return head;
        
        
        
        if(head==null){
        return head;
    }
    
    ListNode current=head;
    ListNode pre=null;
    
    while(current!=null){
        if(current.val==val){
            if(pre==null){
                current=current.next;
                head=current;
            }
            else{
                pre.next=current.next;
                current.next=null;
                current=pre.next;
            }
        }
        else{
            pre=current;
            current=current.next;
        }
    }
    
    return head;
    }
}