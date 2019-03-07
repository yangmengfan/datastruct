package cn.ymf.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: ymfa
 * @Date: 2019/3/7 12:07
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i=0; i<1000000; i++){
            linkedList.add(i);
            arrList.add(i);
        }
        long start = System.currentTimeMillis();
        linkedList.indexOf(999999);
        long end = System.currentTimeMillis();
        System.out.println("链表查找时间"+ (end-start));
        long start1 = System.currentTimeMillis();
        arrList.indexOf(999999);
        long end1 = System.currentTimeMillis();
        System.out.println("数组查找时间"+ (end1-start1));
    }
}
