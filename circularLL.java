class circularLL{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
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
        head = newNode;
    }

    public void makeCL(){
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = head;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printLL(){
        Node currNode = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    public void printCL(){
        Node currNode = head;
        do{
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
        }while(currNode != head);
    }

    public void addFirstCL(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            head.next =head;
            return;
        }
        newNode.next = head.next;
        head.next = newNode;
        int x = head.data;
        head.data = newNode.data;
        newNode.data = x;
    }

    public void addLastCL(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            head.next = head;
            return;
        }
        newNode.next = head.next;
        head.next = newNode;
        int x = head.data;
        head.data = newNode.data;
        newNode.data = x;
        head = newNode;
    }

    public void deleteHead(){
        head.data = head.next.data;
        head.next = head.next.next;
    }

    public void deleteK(int k){
        if(k==0){
            return;
        }
        if(k == 1){
            deleteHead();
            return;
        }
        Node temp = head;
        for(int i=1; i<k-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        circularLL cl = new circularLL();
        cl.addFirst(3);
        cl.addLast(4);
        cl.makeCL();
        cl.addFirstCL(2);
        cl.addLastCL(5);
        cl.deleteHead();
        cl.deleteK(2);
        cl.printCL();
    }



}