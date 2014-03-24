package Hexlet.BTree;

public class BTree<T extends Comparable<T>> implements IBTree<T> {
    
    private  IBTree<T> left = null;
    private  IBTree<T> right = null;
    private  T value;
    
    private int count = 1;

    public BTree (T value) {
        //this.left = left;
        //this.right= right;
        this.value= value;
    }

    public IBTree getLeft() {
        return left;
    }
    
    public IBTree getRight(){
        return right;
    }

    public T getValue(){
        return value;
    }

    public int getCount(){
        return count;
    }

    private void increment() {
        int count = getCount();
        count++;
        if (count>1000) {
            count = 0;
        }
        setCount(count);
    
    }
    
    private void setCount(int count) {
        this.count = count;
    }
    
    
    public void add(T value){
        if (value.equals(getValue()))
            increment();
        else if (value.compareTo(getValue()) < 0) 
            addLeft(value);
        else 
            addRight(value);
    }

    private void addLeft(T value)    {
            if (getLeft() == null)
                setLeft(new BTree<>(value));
            else 
                getLeft().add(value);
    }

    private void addRight(T value)   {
            if (getRight() == null)
                setRight(new BTree<>(value));
            else 
                getRight().add(value);
    }

    private void setLeft(IBTree<T> left) {
        this.left = left;
    }
    private void setRight(IBTree<T> right) {
        this.right = right;
    }
    
    public void forEach(final Process<T> process) {
        new Thread() {
            @Override
            public void run() {
                process.process(getValue());
            }
        };
        if (getLeft != null)
            getLeft().forEach(process);
        if (getRight != null)
            getRight().forEach(process);        
    }


    // public static void main (String[] args) {
        

    // }
}


