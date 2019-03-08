package cn.ymf.Tree.binarysortree;

import cn.ymf.Tree.binarytree.Tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: ymfa
 * @Date: 2019/3/8 15:11
 * @Description:
 */
public class BinaryTree extends Tree {


    private Node root;
    public BinaryTree(){
        root = null;
    }

    @Override
    public int insert(Object o) {
        return 0;
    }

    @Override
    public int remove(Object o) {
        return 0;
    }

    //将data插入到排序二叉树中
    public void insert(int data){
        Node newNode = new Node(data);
        if(root == null)
            root = newNode;
        else{
            Node current = root;
            Node parent;
            while (true) {    //寻找插入的位置
                parent = current;
                if(data < current.data){
                    current = current.left;
                    if(current == null){
                        parent.left = newNode;
                        return;
                    }
                }
                else{
                    current = current.right;
                    if(current == null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

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

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(3);
        bt.insert(2);
        bt.insert(4);
        bt.insert(1);
        bt.insert(7);
        bt.insert(6);
        bt.DFS();
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