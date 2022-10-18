/*You have 123 which is described in the linked list like 1->2->3.
 How do you increase the number by one and print.*/
public class Google
{
    public static void main(String[] args)
    {
        OgLinkedList first = new OgLinkedList();
        first.append("1");
        first.append("2");
        first.append("3");

        String firstNum = first.tail.data;
        int num2 = Integer.valueOf(firstNum) + 1;
        first.tail.data = String.valueOf(num2);
        first.printList();

    }

}
