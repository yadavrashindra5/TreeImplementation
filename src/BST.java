public class BST{

    public Node createBST(Node root,int data)
    {
        if(root==null)
        {
            root=new Node(data);
            return root;
        }
        else if(data<root.data)
        {
            root.left=createBST(root.left,data);
        }
        else if(data>root.data){
        root.right = createBST(root.right, data);}
        return root;
    }

    public void preOrderTraversal(Node root)
    {
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void postOrderTraversal(Node root)
    {
        if(root==null)
            return;

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");

    }

    public void inOrderTraversal(Node root)
    {
        if(root==null)
            return;
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }

}
