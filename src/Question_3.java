public class Question_3 {
//    To Do : Remove kth Position From Linked List
    public static void main(String[] args) {
        Node head = new Node(3);
        int[] arr = {2, 6, 8, 9, 10};
        Node temp = head;
        for(int i=0;i< arr.length;i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        int k = 0;
        head = removeAtK(head,k);
        Question_1.printLinkedList(head);
    }
    static Node removeAtK(Node head,int k){
        if(k==0){
            head = head.next;
            return head;
        }else if(k>Question_1.size(head)){
            return head;
        }
        Node temp = head;
        for(int i=1;i<k;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
