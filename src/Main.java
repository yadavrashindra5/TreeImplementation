import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Main {
    public static void main(String args[])
    {
        Node root=null;
        BST treeNode=new BST();
        root=treeNode.createBST(root,45);
        root=treeNode.createBST(root,39);
        root=treeNode.createBST(root,78);
        root=treeNode.createBST(root,54);
        root=treeNode.createBST(root,79);
        root=treeNode.createBST(root,55);
        root=treeNode.createBST(root,80);
        System.out.println(treeNode.height(root));
        System.out.println(treeNode.totalNode(root));
        System.out.println(treeNode.internalNode(root));
        System.out.println(treeNode.externalNode(root));
        root=treeNode.mirrorImage(root);
        treeNode.preOrderTraversal(root);

    }
}
