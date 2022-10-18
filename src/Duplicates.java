/*Write code to remove duplicates from an unsorted linked list.
Follow-up: How would you solve this problem if a temporary buffer is not allowed?*/
public class Duplicates {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }

    //function made of two loops to remove duplicates
    void remove_duplicate()
    {
        Node ptr1 = null, ptr2 = null, dupe = null;
        ptr1 = head;

        //go through elements one at a time
        while (ptr1 != null && ptr1.next != null)
        {   //get next element
            ptr2 = ptr1;

            //compare each element with the rest
            //while next doesnt = tail
            while (ptr2.next != null)
            {

            //if it's a duplicate then delete it
            if (ptr1.data == ptr2.next.data)
            {
                ptr2.next = ptr2.next.next;
                //delete + use garbage collector to make space available for reuse
                System.gc();
            } else { //else get next element
                ptr2 = ptr2.next;
            }
        } //else get next element to compare
        ptr1 = ptr1.next;
    }
}

//method to print list
    void printNodes(Node node)
    { //while you havent reached the tail
    while (node != null)
    {
        System.out.print(node.data + " ");
        node = node.next;
       }
    }

    public static void main(String[] args)
    {
        Duplicates list = new Duplicates();
        list.head = new Node(1);
        list.head.next = new Node(1);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node (3);
        list.head.next.next.next.next = new Node(3);

        System.out.println("Original list: " );
        list.printNodes(head);

        //call function to remove duplicates
        list.remove_duplicate();
        System.out.println(" ");
        System.out.println("List after removing duplicates: ");
        list.printNodes(head);

    }
}