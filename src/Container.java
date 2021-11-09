//контейнер на связном списке
public class Container<T> {

    //узел списка
    public class Node {

        T data; //информация
        Node next; //след. элемент списка

        //конструктор
        public Node(T data) {
            this.data = data;
            next = null;
        }
    }

    private Node head; //голова списка
    private Node tail; //хвост списка
    private int size; //размер контейнера

    //конструктор
    public Container() {
        head = tail = null;
        size = 0;
    }

    //добавление
    public void add(T data) {
        Node t = new Node(data);
        if (head != null) {
            tail.next = t;
            tail = t;
        } else {
            head = tail = t;
        }
        size++;
    }

    //вывод контейнера
    public void print() {
        Node ptr = head;
        while (ptr != null) {
            System.out.println(ptr.data + " ");
            ptr = ptr.next;
        }
    }

    //размер контейнера
    public int getSize() {
        return size;
    }

    //извлечение по индексу
    public T get(int i) {
        if (i >= 0 && i < size) {
            Node ptr = head;
            for (int k = 0; k < size && k != i; k++) {
                ptr = ptr.next;
            }
            return ptr.data;
        } else {
            System.out.println("Выход за пределы контейнера!");
            return null;
        }
    }

    //удаление элемента
    public void remove(T data) {
        Node cur = head;
        Node prev = head;
        while (cur != null) {
            if (cur.data.equals(data) && cur == prev) {
                head = head.next;
                cur = prev = head;
                size--;
            } else if (cur.data.equals(data)) {
                if (cur == tail) {
                    tail = prev;
                    tail.next = null;
                } else {
                    cur = cur.next;
                    prev.next = cur;
                }
                size--;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
    }

    //очистить контейнер полностью
    public void clear() {
        head = tail = null;
        size = 0;
    }
}
