package demo03;

/**
 * Created by joryun on 2017/4/25.
 *
 * 节点类
 */

public class ListNode {

    int val;    //数据域
    ListNode next = null;   //指针域

    ListNode(int val) {
        this.val = val;
    }

    //显示此节点
    public void display() {

        System.out.print(val + " ");
    }

}