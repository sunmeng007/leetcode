package leetcode;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
  public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode c1 = l1;
      ListNode c2 = l2;
      ListNode sentinel = new ListNode(0);
      ListNode d = sentinel;
      int sum = 0;
      while (c1 != null || c2 != null) {
          sum /= 10;
          if (c1 != null) {
              sum += c1.val;
              c1 = c1.next;
          }
          if (c2 != null) {
              sum += c2.val;
              c2 = c2.next;
          }
          d.next = new ListNode(sum % 10);
          d = d.next;
      }
      if (sum / 10 == 1)
          d.next = new ListNode(1);
      return sentinel.next;
  }
  
  public static void main(String[] args) {
    ListNode l1 = new ListNode(2);
    ListNode l11 = new ListNode(4);
    ListNode l111 = new ListNode(3);
    l1.next = l11;
    l11.next = l111;
    ListNode l2 = new ListNode(5);
    ListNode l22 = new ListNode(6);
    ListNode l222 = new ListNode(4);
    l2.next = l22;
    l22.next = l222;
    Solution s = new Solution();
    ListNode q = s.addTwoNumbers(l1,l2);
    while(q != null)
    {
      System.out.println(q.val);
      q = q.next;
    }
    
  }
}
