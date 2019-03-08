package cn.ymf.Tree.binarytree;

import java.util.List;

/**
 * @Auther: ymfa
 * @Date: 2019/3/8 17:15
 * @Description:
 */
public abstract class Tree{
    private Node root;
    public Tree(){
        root = null;
    }

    abstract public int insert(Object o);

    abstract public int remove(Object o);

    public List DFS() {
        if (root != null) {
            recursionDFS(root);
        }
        return null;
    }

    public void recursionDFS(Node root){
        if (root != null) {
            System.out.println(root.data);
            Node temp = root;
            root = temp.left;
            recursionDFS(root);
            root = temp.right;
            recursionDFS(root);
        }
    }

    public List BFS() {
        if(root != null){
            System.out.println(root.data);
            recursionBFS(root);
        }
        return null;
    }


    public void recursionBFS(Node root){
        if (root.left != null){
            System.out.println(root.left.data);
        }
        if (root.right != null){
            System.out.println(root.right.data);
        }
        if (root.left != null){
            recursionBFS(root.left);
        }
        if (root.right != null){
            recursionBFS(root.right);
        }
    }

    public int getDeep(Node root) {
        return 0;
    }

    public int getLeaf(Node root) {
        return 0;
    }
}
class Node{
    public int data;
    public Node left;
    public Node right;
    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}