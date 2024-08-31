package com.leetcode;

public class Solution2 {
    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean add1 = false;
        ListNode ln = null;
        ListNode lastLn = null;
        ListNode tempL1 = l1;
        ListNode tempL2 = l2;

        while (tempL1 != null || tempL2 != null) {
            int iTempL1Val = 0;
            int iTempL2Val = 0;

            if (tempL1 != null) {
                iTempL1Val = tempL1.val;
                tempL1 = tempL1.next;
            }

            if (tempL2 != null) {
                iTempL2Val = tempL2.val;
                tempL2 = tempL2.next;
            }

            int iVal = iTempL1Val + iTempL2Val;

            if (add1) {
                iVal = iVal + 1;
            }

            add1 = false;

            if (iVal > 9) {
                iVal = iVal - 10;
                add1 = true;
            }

            ListNode iLn = new ListNode(iVal);

            if (ln == null) {
                ln = iLn;
            } else {
                lastLn.next = iLn;
            }

            lastLn = iLn;
        }

        if (add1) {
            //last add one
            lastLn.next = new ListNode(1);
        }

        return ln;
    }

}
