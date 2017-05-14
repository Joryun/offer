package demo02;

/**
 * Created by joryun on 2017/4/12.
 *
 * Problem：
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
 * Solve：
 * 首先将传过来的字符串变为字符数组，接着创建一个StringBuffer对象。若遇到空格，则该对象append替换
 * 的字符；否则将该字符append进该对象，最后将该对象toString并返回即可。
 *
 * 时间复杂度：O(n^2)
 */
public class ReplaceSpace {

    public static String replaceSpace(StringBuffer str) {

        String sti = str.toString();

        char[] strChar = sti.toCharArray();
        StringBuffer sb = new StringBuffer();

        for (int i=0; i<strChar.length; i++){
            if (strChar[i] == ' '){
                sb.append("%20");
            } else {
                sb.append(strChar[i]);
            }
        }

        return sb.toString();

    }

    public static void main(String[] args) {

        String str = "We are happy";

        StringBuffer sb = new StringBuffer(str);

        String newStr = replaceSpace(sb);

        System.out.println(newStr);
    }

}
