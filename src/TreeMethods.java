import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeMethods {
    /*
    *
    * @Param root
    * This method is used to create binary tree
    * */
    public Node createBTree(Node root)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter data or enter -1 for null");
        int data=scanner.nextInt();
        if(data==-1)
            return root;
        root=new Node(data);
        System.out.println("Enter left child of "+data);
        root.left=createBTree(root.left);
        System.out.println("Enter right child of "+data);
        root.right=createBTree(root.right);
        return root;
    }

    /*
    *
    * preOrdertraversal first visit the root node then it call the left of its root node and then right
    * PreOrderTraversal is work on NodeLeftRight principal
    *
    * @Param root
    * */
    public void preOrderTraversal(Node root)
    {
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    /*
    *
    *
    * LeftRightNode(first visit left then right after that node)
    * */

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
        {
            return ;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }


    public void levelOrderTraversal(Node root)
    {
        Queue<Node>queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            Node temp=queue.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
            queue.add(temp.left);}
            if(temp.right!=null){
            queue.add(temp.right);}
        }
    }



}
