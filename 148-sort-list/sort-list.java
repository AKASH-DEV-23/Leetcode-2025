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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)   return head;
        List<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(list);
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for(int i=0;i<list.size();i++){
            curr.next=new ListNode(list.get(i));
            curr=curr.next;
        }
        // new
        return dummy.next;
    }
}