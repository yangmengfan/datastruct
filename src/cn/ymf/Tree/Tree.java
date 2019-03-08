package cn.ymf.Tree;



import java.util.List;

/**
 * @Auther: ymfa
 * @Date: 2019/3/8 09:57
 * @Description:
 */
public interface Tree<V> {

    public int insert(V v);
    public int remove(V v);//删除左子树

    /**
     * 深度遍历
     * @return
     */
    public List DFS();
    public List BFS();//广度优先遍历



}
