class LinkedList
{
    Node head; // head of linked list 

    /* Linked list node */
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    /* Function to print middle of linked list */
    //Complete this function
    void printMiddle()
    {
        if (head == null) {
            System.out.println("The linked list is empty.");
            return;
        }
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next!= null)
        {
            slow = slow.next;      // move slow by one step   
            fast = fast.next.next; // move fast by two steps
        }
        System.out.println(("Middle element") + slow.data);
    }

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+"->");
            tnode = tnode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String [] args)
    {
        LinkedList llist = new LinkedList();
        for (int i=15; i>0; --i)
        {
            llist.push(i);
            llist.printList();
            llist.printMiddle();
        }
    }
} 
