//<<자료구조(6077) 과제 #2 (60220435 김희윤)>>
public class Main {
    public static void main(String[] args) {
        System.out.println("<<자료구조(6077) 과제 #2 (60220435 김희윤)>>");
        System.out.println("---------------------------------------");
        SList<Integer> s = new SList<>();
        for(int i=100; i>=10; i = i - 10){
            s.insertFront(i);
        }
        System.out.print("정렬된 단순연결리스트 : ");
        s.print();s.insert(5);
        System.out.print("삽입 후: ");
        s.print();s.insert(75);
        System.out.print("삽입 후: ");
        s.print();s.insert(200);
        System.out.print("삽입 후: ");
        s.print();
        System.out.println("---------------------------------------");
        System.out.print("단순연결리스트 : ");
        SList<Integer> s2 = new SList<>();
        s2.insertFront(40);
        s2.insertFront(90);
        s2.insertFront(30);
        s2.insertFront(70);
        s2.insertFront(10);
        s2.insertFront(100);
        s2.insertFront(80);
        s2.insertFront(20);
        s2.insertFront(60);
        s2.insertFront(50);
        s2.print();
        s2.delete(50);
        System.out.print("삭제 후: ");s2.print();
        s2.delete(10);
        System.out.print("삭제 후: ");s2.print();
        s2.delete(40);
        System.out.print("삭제 후: "); s2.print();
        s2.delete(200);
        System.out.print("삭제 후: "); s2.print();
    }
}
