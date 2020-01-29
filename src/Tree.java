public class Tree {

    public int value;
    public Tree left;
    public Tree right;

    public Tree(int value, Tree left, Tree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Tree(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public void insert(int key) {
        insert(key, this);
    }

    private void insert(int key, Tree tree) {
        if (tree.value > key) {
            if (tree.left == null) tree.left = new Tree(key);
            else insert(key, tree.left);

        } else if (tree.value < key) {
            if (tree.right == null) tree.right = new Tree(key);
            else insert(key, tree.right);

        }
    }

    public void print() {
        print(this);
    }

    /*private void print(Tree tree) {
        if (tree == null) return;
        print(tree.left);
        System.out.print(tree.value + "\t");
        print(tree.right);
    }*/

    private void print(Tree tree) {
        if (tree == null) return;
        print(tree.left);
        System.out.print((tree.left == null ? "" : " ) ") + tree.value + (tree.right == null ? "" : " ( "));
        print(tree.right);
    }

    public int min() {
        return searchLeftTreeEnd(this).value;
    }

    public int max() {
        return searchRightTreeEnd(this).value;
    }

    private Tree searchLeftTreeEnd(Tree tree) {
        return tree.left == null ? tree : searchLeftTreeEnd(tree.left);
    }

    private Tree searchRightTreeEnd(Tree tree) {
        return tree.right == null ? tree : searchRightTreeEnd(tree.right);
    }

    public boolean exists (int key) {
        return exists(this, key);
    }

    private boolean exists(Tree tree, int key) {
        if (tree == null) return false;
        boolean ret = false;
        if (tree.value != key)
            if (tree.value > key) ret = exists(tree.left, key);
            else ret = exists(tree.right, key);
        else ret = true;
        return ret;
    }


}