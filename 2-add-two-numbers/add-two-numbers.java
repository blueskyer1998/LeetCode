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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // 創建虛擬頭節點
        ListNode current = dummy;
        int carry = 0; // 進位變數

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0; // 取 l1 的值，若為 null 則為 0
            int val2 = (l2 != null) ? l2.val : 0; // 取 l2 的值，若為 null 則為 0
            int sum = val1 + val2 + carry; // 計算當前位的和

            carry = sum / 10; // 計算新的進位
            current.next = new ListNode(sum % 10); // 只保留個位數
            current = current.next; // 移動指針

            // 移動 l1 和 l2 到下一個節點
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next; // 返回結果鏈表的頭節點
    }
}