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
//method to delete the duplicates from ll without even sorting
    public static Node removeDuplicateUnsortedLL(Node head){
        if(head==null||head.next==null){
            return null;
        }

        HashSet<Integer> hs = new HashSet<>();
        //add the head data in hashset
        hs.add(head.data);
        Node prev = head;
        Node current = head.next;
        while(current!= null){
            //if hs contains the data of current, which is basically the second node
            if(hs.contains(current.data)){
                //then prev next will skip the current and point towards the current.next
                prev.next = current.next;
                //and current will move to current. next
                current = current.next;
            }
            else{
                //otherwise we will add more current data in map for comparison
                hs.add(current.data);
                //and move prev to current
                prev=current;
                //and current to current .next
                current = current.next;
            }
        }return head;           //at the end the head will be returned
    }
    public static void main(String[] args) {

    }
}
