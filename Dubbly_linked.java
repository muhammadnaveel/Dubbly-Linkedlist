public class Dubbly_linked {
    D_Node head;
    D_Node tail;
    int size;

    public Dubbly_linked()
    {
        head=null;
        tail=null;
        size=0;
    }

    public void insertAtStart(int value)
    {
        D_Node new_Node = new D_Node(value);
        if(head==null)
        {
            head = new_Node;
            tail=new_Node;
        }
        else
        {
           new_Node.next=head;
            head.prev = new_Node;
            head = new_Node;
        }
        size ++;
    }
    public void insertAtEnd(int value)
    {
        D_Node new_node= new  D_Node(value);
        if(head==null)
        {
            head=new_node;
        }
        else {
            tail.next=new_node;
            new_node.prev=tail;
        }
        tail= new_node;
        size++;
    }

    public void insertNth(int data, int position) {

        D_Node new_node = new D_Node();
        new_node.data = data;
        new_node.next = null;

        if (this.head == null) {

            if (position != 0) {
                return;
            } else {
                this.head = new_node;
            }
        }

        if (head != null && position == 0) {
            new_node.next = this.head;
            this.head = new_node;
            return;
        }

        D_Node current = this.head;
        D_Node previous = null;

        int i = 0;

        while (i < position) {
            previous = current;
            current = current.next;

            if (current == null) {
                break;
            }

            i++;
        }

        new_node.next = current;
        previous.next = new_node;
    }

    public void deleteFromStart() {

        if(head == null) {
            return;
        }
        else {

            if(head != tail) {

                head = head.next;

                head.prev = null;
            }

            else {
                head = tail = null;
            }
        }
    }
    public void searchNode(int value) {
        int i = 1;
        boolean flag = false;

        D_Node current = head;


        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {
            //Compare value to be searched with each node in the list
            if(current.data == value) {
                flag = true;
                break;
            }
            current = current.next;
            i++;
        }
        if(flag)
            System.out.println("Node is present in the list at the position : " + i);
        else
            System.out.println("Node is not present in the list");
    }

   public void deleteNode(D_Node head_r, D_Node del)
    {


        if (head == null || del == null) {
            return;
        }


        if (head == del) {
            head = del.next;
        }

        if (del.next != null) {
            del.next.prev = del.prev;
        }


        if (del.prev != null) {
            del.prev.next = del.next;
        }

        return;
    }


    public void display() {
        D_Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {

            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }

        else{
            return false;
        }
    }

//
}


