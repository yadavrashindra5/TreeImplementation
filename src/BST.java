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

    public boolean searchNode(Node root,int data)
    {
        if(root==null)
            return false;
        if(root.data==data)
        {
            System.out.println("data found");
            return true;
        }
        if(data<root.data)
        {
            return searchNode(root.left,data);
        }

        return searchNode(root.right,data);
    }

    public Node deleteNode(Node root,int data)
    {
        if(data<root.data)
            root.left=deleteNode(root.left,data);
        else if(data>root.data)
            root.right=deleteNode(root.right,data);
        else if(root.left!=null && root.right!=null)
        {
            Node temp=findLargestNode(root.left);
            root.data=temp.data;
            root.left=deleteNode(root.left,temp.data);
        }
        else{
            if(root.left==null && root.right==null)
            {
                return null;
            }
            else if(root.left!=null)
            {
                return root.left;
            }
            else
                return root.right;
        }
        return root;
    }


    public Node findLargestNode(Node root)
    {
        if(root.left==null&&root.right==null)
        {
            return root;
        }
        else if(root.right==null)
        {
            return root;
        }
        return findLargestNode(root.right);
    }

    public Node findSmallestNode(Node root)
    {
        if(root.left==null && root.right==null)
        {
            return root;
        }
        else if(root.left==null)
            return root;
        return findSmallestNode(root.left);
    }


    public int height(Node root)
    {
        if(root==null)
            return 0;

        int lHeight=height(root.left);
        int rHeight=height(root.right);

        return lHeight>rHeight?lHeight+1:rHeight+1;

    }

    public int totalNode(Node root)
    {
        if(root==null)
            return 0;
        int left=totalNode(root.left);
        int right=totalNode(root.right);
        return left+right+1;
    }

    public int internalNode(Node root)
    {
        if(root==null)
            return 0;
        else if(root.left==null && root.right==null)
            return 0;
        return internalNode(root.left)+internalNode(root.right)+1;
    }

    public int externalNode(Node root)
    {
        if(root==null)
            return 0;
        else if(root.left==null && root.right==null)
            return 1;
        return externalNode(root.left)+externalNode(root.right);
    }


    public Node mirrorImage(Node root)
    {
        if(root==null)
            return root;
        else if(root.left==null && root.right==null)
            return root;
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        root.left=mirrorImage(root.left);
        root.right=mirrorImage(root.right);
        return root;
    }


}
