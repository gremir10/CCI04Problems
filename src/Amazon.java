public class Amazon
{
    public static void main(String[] args)
    {
        OgLinkedList list1 = new OgLinkedList();
        OgLinkedList list2 = new OgLinkedList();

        if (list1.tail == list2.tail) {
            System.out.println("These lists intersect");
        } else {
            System.out.println("These lists don't intersect");
        }

    }

}
