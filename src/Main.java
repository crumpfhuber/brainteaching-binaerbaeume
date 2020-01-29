public class Main {

    public static void main(String[] args) {
        int [] numbers = {4,6,5,2,1,3,15,19,11,9,13,8};
        Tree tree = new Tree(7);

        for (int i : numbers) tree.insert(i);

        System.out.println("\nMin: " + tree.min());
        System.out.println("Max: " + tree.max());
        System.out.println("Exists 4: " + tree.exists(4));
        System.out.println("Exists 19: " + tree.exists(19));
        System.out.println("Exists 200: " + tree.exists(200));

        tree.print();

    }

}

