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
    public ListNode middleNode(ListNode head) {
        ListNode nd=new ListNode();
        ListNode n=new ListNode();
          nd=head;
          int i=1;
          while(nd.next!=null){
              i++;
              nd=nd.next;
          }
n=head;
for(int j=0;j<i/2;j++){
    n=n.next;
}
 head=n; 
 return head;     
    }
    
}