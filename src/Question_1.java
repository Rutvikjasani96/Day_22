public class Question_1 {
//    Create a Linked list & add n Nodes
//    find the size of Node
    public static void main(String[] args) {
        int n=10;
        Node head = new Node(1);
        Node temp = head;
        for(int i=2;i<=n;i++){
            temp.next = new Node(i);
            temp = temp.next;
        }
        printLinkedList(head);
        int size_list = size(head);
        System.out.println("\nLinked List size : "+size_list);
    }
    static int size(Node head){
        Node temp = head;
        int size =0 ;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        return size;
    }
    static void printLinkedList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(" "+temp.data);
            temp = temp.next;
        }
    }
}
