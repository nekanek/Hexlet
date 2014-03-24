package Hexlet.BTree;

public interface IBTree<T extends Comparable<T>> {
    
    public IBTree getLeft();
    public IBTree getRight();
    public T getValue();
    public int getCount();
    public void forEach(Process<T> p);
    public void add(T value);
    
    public interface Process<T extends Comaparable<T>> {
        public void process (T value);
    }
    

    // public BTree (BTree left, BTree right) {
    //     this.left = left;
    //     this.right=right;
    // }

    

    // public static void main (String[] args) {
        

    // }
}


