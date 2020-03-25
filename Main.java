public class Main {

    public static void main(String[] args) {

        Dubbly_linked d = new Dubbly_linked();
        d.insertAtStart(120);
        d.insertAtStart(50);
        d.insertAtEnd(11);
        d.insertAtEnd(66);
        d.insertNth(25, 2);
        d.display();
        d.deleteFromStart();
        d.searchNode(120);
        d.display();
        d.deleteNode(d.head, d.head);
        d.display();
        d.isEmpty();
        System.out.println(d.isEmpty());

    }
}
