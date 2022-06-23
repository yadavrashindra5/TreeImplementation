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
}
