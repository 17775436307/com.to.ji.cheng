package cheng.ji.to.ceshi;
import  cheng.ji.to.com.animal.*;
public class ThreeTest {
    public   static  void main(String []args ){
        Animal one=new Animal("花花","狗类");
        Animal two=new Animal("花花","狗类");
        /*equals测试：
         *  1.继承object 中的equals方法时，比较的是两个引用的是否指向同一个对象   第一组是对的     第二组因为在Aniaml的类中重写了一个带两参构造的方法所以用equals的比较方法时
         *   只比较里面的内容
         *   2.子类可以通过重写equals 方法来改变比较的内容
         * */
        boolean flag=one.equals(two);
        System.out.println("flag 的值："+flag);
        System.out.println((one==two));
        String str1=new String("hello");//因为Animal中有带参构造的方法所以可以直接实例化对象 第一组
        String str2=new String("hello");
         flag=str1.equals(str2);
        System.out.println("flag 的值："+flag);//第二组
        System.out.println((str1==str2));
       /*toString 测试
        * 1.输出对象名时，默认会调用类中的toString(即继承Object 的toString方法)，这样输出对象的就为字串符的表现形式：类型的信息+ @+地址信息
        *2.通过重写toString 方法就可以改变输出内容了
        * */
        System.out.println(one);
        System.out.println(one.toString());
        System.out.println(str1);
    }
}
