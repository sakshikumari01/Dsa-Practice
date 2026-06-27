/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            
            slow = slow.next;          // 1 step
            fast = fast.next.next;    // 2 steps

            if (slow == fast) {
                return true;           // cycle mil gaya
            }
        }

        return false;                  // cycle nahi hai
    }
}