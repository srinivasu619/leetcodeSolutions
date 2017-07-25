/*

QUESTION:

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

*/ 

//-------------------SOLUTION-------------------//
/**
 * Definition for singly-linked list.*/
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 public class problem2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode head=null,tail=null;
        while(l1 != null && l2!=null)
        {
            int sum = l1.val+l2.val+carry;
            int digit = sum%10;
            carry = sum/10;
            ListNode node =new ListNode(digit);
            if(head==null)
            {
               // ListNode node =new ListNode(digit);
                head=tail=node;
            }
            else
            {
                tail.next=node;
                tail=node;
            }
            System.out.print(node.val+" ");
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!= null)
        {
            int sum = l1.val+carry;
            int digit = sum%10;
            carry = sum/10;
            ListNode node =new ListNode(digit);
            tail.next=node;
            tail=node;
            l1=l1.next;
        }
        while(l2!=null)
        {
            int sum = l2.val+carry;
            int digit = sum%10;
            carry = sum/10;
            ListNode node =new ListNode(digit);
            tail.next=node;
            tail=node;
            l2=l2.next;
        }
        if(carry!=0)
        {
            ListNode node =new ListNode(carry);
            tail.next=node;
            tail=node;
        }
        return head;
    }
}