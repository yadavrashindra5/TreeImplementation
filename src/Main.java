import java.util.*;

public class Main {
    public static void main(String[] args) {

        TreeMethods tree=new TreeMethods();
        Node root=null;
        root=tree.createBTree(root);
        tree.preOrderTraversal(root);
        System.out.println();
        tree.postOrderTraversal(root);
    }
}

