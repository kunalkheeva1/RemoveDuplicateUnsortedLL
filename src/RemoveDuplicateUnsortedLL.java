//now the list is unsorted.
//One thing can be done is that sort the list first and then remove the duplicates by breaking connection,(nlogN)
//Other method is when nodes are added in HashSet and if it is same then skip that one


import java.util.HashSet;

public class RemoveDuplicateUnsortedLL {
    //first create a Node
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node removeDuplicateUnsortedLL(Node head){
        if(head==null||head.next==null){
            return null;
        }
        HashSet<Integer> hs = new HashSet<>();
        hs.add(head.data);
        Node prev = head;
        Node current = head.next;
        while(current!= null){
            if(hs.contains(current.data)){
                prev.next = current.next;
                current = current.next;
            }
            else{
                hs.add(current.data);
                prev=current;
                current = current.next;
            }
        }return head;
    }
    public static void main(String[] args) {

    }
}
