package lesson3;

public class Main {
    public static void main(String[] args) {
//        MyStack<Integer> stack = new MyStack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//
//        for (int i = 0; i <5 ; i++) {
//            System.out.println(stack.pop());
//        }

//        Expression e = new Expression("(4-6)+[{67+45} * {a / b}]");
//        System.out.println(e.checkBracket());


//        MyQueue<Integer> queue = new MyQueue<>();
//        queue.insert(1);
//        queue.insert(2);
//        queue.insert(3);
//
//        System.out.println(queue);
//
//        for (int i = 0; i < 3 ; i++) {
//            System.out.println(queue.remove());
//        }


       /* MyPriorityQueue<Integer> mpq = new MyPriorityQueue<>();

        mpq.insert(5);
        mpq.insert(1);
        mpq.insert(7);
        mpq.insert(4);
        mpq.insert(2);

        System.out.println(mpq);
        for (int i = 0; i < 5 ; i++) {
            System.out.println(mpq.remove());
        }
*/
        reverseSB("икортс еымидовв теавичаровереп яароток ,аммаргорП");

        Deque deq = new Deque(10);
        deq.insertRight(5);
        deq.insertLeft(1);
        deq.insertRight(7);
        deq.insertLeft(4);
        deq.insertRight(5);
        deq.insertLeft(1);
        deq.insertRight(7);
        deq.insertLeft(4);

        System.out.println(deq);

        for (int i = 0; i < 3 ; i++) {
            System.out.println(deq.removeRight());
        }

        System.out.println("Begin: " + deq.peekBegin() + ", End: " + deq.peekEnd());
        System.out.println();

    }

        public static void reverseSB(String s) {
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            System.out.println(sb.toString());
        }

}
