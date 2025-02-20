import java.util.*;
public class LinkedList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void printLinkedList(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        // Linked List
//        ListNode head = new ListNode(1);
//        ListNode second = new ListNode(2);
//        ListNode third = new ListNode(3);
//        head.next = second;
//        second.next = third;
//        third.next = null;
//        printLinkedList(head);

        // Input Linked List
        Scanner sc = new Scanner(System.in);
        ListNode head = null;
        ListNode current = null;
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();
            ListNode node = new ListNode(val);
            if (head == null) {
                head = node;
                current = head;
            } else {
                current.next = node;
                current = current.next;
            }
        }
        printLinkedList(head);

        sc.close();
    }
}
