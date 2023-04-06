package ma.eheio.exercice2;

public class MyNode <T>{
    private T t;
    private MyNode<T> nextElement;

    public MyNode(T obj)
    {
        this.t=obj;
        this.nextElement=null;
    }


    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public MyNode getNextElement() {
        return nextElement;
    }

    public void setNextElement(MyNode nextElement) {
        this.nextElement = nextElement;
    }


    @Override
    public String toString() {
        return "MyNode["  + t.toString() + "]";
    }
}
