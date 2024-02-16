public class Question_2 {
    //    insert element at k
    public static void main(String[] args) {
        int k = 2;
        int x = 25;
        Node head = new Node(3);
        Node temp = head;
        int[] arr = {2, 6, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        head = insetAtK(head, k, x);
        Question_1.printLinkedList(head);
    }

    static Node insetAtK(Node head, int k, int x) {
        Node newNode = new Node(x);
        if(k==0){
            newNode.next = head;
            return newNode;
        }else if(k>Question_1.size(head)){
            return head;
        }
        Node temp = head;
        for (int i = 1; i < k; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
}
