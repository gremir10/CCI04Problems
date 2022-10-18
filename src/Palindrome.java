/*Implement a function to check if a given singly linked list is a palindrome.*/
public class Palindrome
{
    public static void main(String[] args) {

        OgLinkedList first = new OgLinkedList();

        String storePalindrome = "";

        first.append("r");
        first.append("a");
        first.append("c");
        first.append("e");
        first.append("c");
        first.append("a");
        first.append("r");

        Node current = first.head;  //check size

        while (current.next != null) {
            if (storePalindrome.contains(current.data)) {
                storePalindrome.replaceFirst(current.next.data, "");
            } else {
                storePalindrome.concat(current.data);
            }
            current = current.next;
            System.out.println(storePalindrome);
        }
        //if more than one unique char in middle of string
        if (storePalindrome.length() > 1 )
        {
            System.out.println("list is not a palindrome");
    }
        else
        {
            System.out.println("list is a palindrome");
        }
    }
}
