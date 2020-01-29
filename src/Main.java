public class Main {

    public static void main(String[] args) {
        int [] numbers = {2, 4, 6, 15, 9, 8, 19};
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

