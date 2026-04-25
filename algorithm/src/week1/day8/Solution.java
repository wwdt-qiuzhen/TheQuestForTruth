package src.week1.day8;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        int index = 0;
        Map<ListNode, Integer> map = new HashMap<>();

        while (head != null) {

            if (map.containsKey(head.next)) {
                return map.get(head.next);
            }
            set.put(head, index);
            head = head.next;
            index++;
        }

        return null;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}