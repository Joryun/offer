package demo03;

/**
 * Created by joryun on 2017/4/25.
 *
 * 单链表类
 */
public class LinkList {

    public ListNode first;  //头结点
    private int pos = 0;    //节点的位置

    public LinkList() {
        this.first = null;
    }

    /**
     * 插入一个头节点
     */
    public void addFirstNode(int data) {
        ListNode node = new ListNode(data);
        node.next = first;
        first = node;
    }

    /**
     * 删除一个头结点，并返回头结点
     */
    public ListNode deleteFirstNode() {
        ListNode tempNode = first;
        first = tempNode.next;
        return tempNode;
    }


}
