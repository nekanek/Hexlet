package Hexlet.BTree;

public class ThreadExample {
    
    public static void main (String[] args) {
        final IBTree<Integer> bTree = new BTree<>(1);
        bTree.add(12);
        bTree.add(1);
        bTree.add(1);
        
        List<Thread> threads = new ArrayList<>(10000);
        for (int i = 0; i < 10000; i++) {
            threads.add(new Thread(){
                @Override
                public void run() {
                    bTree.add(100));
                }
            });
        }
        
        for (Thread t : threads) {
            t.start();
        }
        
        for (Thread t : threads) {
            t.join();
        }
        
        System.out.println("12");
        


// -------------------------        
        // ThreadShower1 t = new ThreadShower1();
        // t.start();
        // try {
        //     Thread.sleep(3000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        //     return;
        // }
        // t.stopShow();
// -------------------------
        // Thread t = new Thread("Hello threadExample") {

        //     @Override
        //     public void run() {
        //         System.out.println("thread 1");
        //     }
        // };

        // t.start();
        
        // t = new Thread(new Runnable() {
        //     @Override
        //     public void run() {
        //         System.out.println("thread 2 via runnable interface");
        //     }            
        // });

        // System.out.println("hello");

        // t.start();
        // // t.stop(); // deprecated
    }
}


