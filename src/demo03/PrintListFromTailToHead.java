package demo03;

import java.util.ArrayList;

/**
 * Created by joryun on 2017/4/25.
 *
 * 输入一个链表，从尾到头打印链表每个节点的值。
 */

public class PrintListFromTailToHead {

    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        if (listNode != null) {
            this.printListFromTailToHead(listNode.next);
            arrayList.add(listNode.val);
        }

        return arrayList;
    }

}
