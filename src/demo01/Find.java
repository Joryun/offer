package demo01;

/**
 * Created by joryun on 2017/4/12.
 *
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Find {

    public boolean find(int target, int [][] array) {
        int len = array.length - 1;     //控制行
        int i = 0;     //控制列

        while((len >= 0) && (i < array[0].length)){
            if(array[len][i] > target){
                len--;
            }else if (array[len][i] < target) {
                i++;
            }else {
                return true;
            }
        }

        return false;
    }

}
