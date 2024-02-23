package MYAVL;

public class Main {

    public static void main(String[] args) {
        AVLTree<Integer> tree = new AVLTree<>();

        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);

        System.out.println("Preorder traversal of constructed AVL tree is : ");
        tree.preOrder(tree.root);
    }
}
