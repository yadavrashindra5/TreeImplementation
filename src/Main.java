public class Main {
    public static void main(String args[])
    {
        Node root=null;
        BST treeNode=new BST();
        root=treeNode.createBST(root,9);
        root=treeNode.createBST(root,5);
        root=treeNode.createBST(root,90);
        treeNode.preOrderTraversal(root);
        System.out.println("Rashindra");
    }
}
