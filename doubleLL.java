public class doubleLL {
    Node head;
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.prev = currNode;
    }

    public void printDLL(){
        if (head == null){
            System.out.print("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    public void reverseDLL(){
        Node temp=null;
        Node curr=head;
        while(curr!=null){
            temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;
            curr=curr.prev;
        }
        if(temp!=null)head=temp.prev;
    }

    public static void main(String[] args) {
        doubleLL dll = new doubleLL();
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(5);
        dll.addLast(2);
        dll.addLast(1);
        dll.reverseDLL();
        dll.printDLL();
    }

}
