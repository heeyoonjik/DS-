import java.util.NoSuchElementException;
public class SList <E extends Comparable<E>>{
    protected Node<E> head;
    private int size;

    public boolean isEmpty(){
        if(getSize()==0)
            return true;
        else
            return false;
    }

    public SList(){
        head = null;
        size = 0;
    }

    public int search(E target){
        Node p = head;
        for(int k=0; k<size; k++){
            if(target == p.getItem()) return k;
            p = p.getNext();
        }
        return -1;
    }

    public void insertFront(E newItem){
        head = new Node(newItem, head);
        size++;
    }

    public void insertAfter(E newItem, Node p){
        p.setNext(new Node(newItem, p.getNext()));
        size++;
    }
    public void deleteFront() {
        if(isEmpty())throw new NoSuchElementException();
            head = head.getNext();
            size--;
    }

    public void deleteAfter(Node p) {
        if (p == null) throw new NoSuchElementException();
        Node t = p.getNext();
        p.setNext(t.getNext());
        t.setNext(null);
        size--;
    }

    public void insert(E target) {
        System.out.println("삽입할 항목 = "+target);
        Node<E> p = head;
        Node<E> prev = null;

        for (int k = 0; k < size; k++) {
            if (target.compareTo(p.getItem()) < 0){
                if(k==0){
                    insertFront(target);
                }else{
                    insertAfter(target, prev);
                }
                return;
            }
            prev = p;
            p = p.getNext();
        }
        insertAfter(target, prev);
    }


    public void delete(E target){
        System.out.println("삭제할 항목 = "+target);
        Node<E> p = head;
        Node<E> prev = null;

        for (int k = 0; k <= size; k++) {
            if (target.compareTo(p.getItem()) == 0){
                if(k==0){
                    deleteFront();
                }else{
                    prev.setNext(p.getNext());
                    p.setNext(null);
                }
                size--;
                return;
            }
            prev = p;
            p = p.getNext();
        }
        System.out.println(target+"이 연결리스트에 없다.");
    }


    public  void print(){
        for(Node<E> p = head; p!=null; p=p.getNext()){
            System.out.print(p.getItem()+" ");
        }
        System.out.println();
    }

    public int getSize(){
        return size;
    }
}
