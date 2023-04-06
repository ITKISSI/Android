package ma.eheio.exercice2;

public class MyLinkedList<T> {

    private MyNode<T> head;
    private int size;

    public MyLinkedList()
    {
        this.head=null;
        this.size=0;
    }


    public void addElement(T t)
    {
        MyNode<T> node= new MyNode<>(t);
        node.setNextElement(this.head);
        this.head=node;
        size++;
    }

    public void showElements()
    {
        for(int i=0;i<this.size;i++)
        {
            System.out.println(this.head.toString());
        }



    }
}
