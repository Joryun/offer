package demo02;

/**
 * Created by joryun on 2017/5/9.
 * <p>
 * Problem：
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * <p>
 * Solve：
 * （1）在原来的字符串上做替换：
 * 从前往后替换，后面的字符要不断往后移动，多次移动导致效率低下，时间复杂度为O(n^2);  //涉及内存覆盖问题
 * 从后往前，可先计算需要多少空间，然后从后往前移动，则每个字符只移动一次，效率更高，时间复杂度O(n)
 * <p>
 * （2）新开辟一个字符串做替换
 */
public class ReplaceSpace02 {

    public static String replaceSpace(StringBuffer str) {

        int spaceNum = 0;   //空格数
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceNum++;
            }
        }

        int indexOld = str.length() - 1;    //替换前字符串下标
        int newLength = str.length() + spaceNum * 2;    //替换空格后的字符串长度
        int indexNew = newLength - 1;       //替换后字符串下标

        //使str的长度扩大到替换后的长度，防止下标越界
        str.setLength(newLength);

        for (; indexOld>=0 && indexOld < newLength; --indexOld){

            if (str.charAt(indexOld) == ' '){
                str.setCharAt(indexNew--, '0');
                str.setCharAt(indexNew--, '2');
                str.setCharAt(indexNew--, '%');
            }else {
                str.setCharAt(indexNew--, str.charAt(indexOld));
            }
        }


        return str.toString();
    }


    public static void main(String[] args) {

        String s = "We are happy.";
        System.out.println(s);

        StringBuffer str = new StringBuffer(s);
        String newStr = replaceSpace(str);
        System.out.println(newStr);

    }


}
