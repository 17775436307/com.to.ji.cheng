package cheng.ji.to.ceshi;
import cheng.ji.to.com.animal.*;
public class TwoTest {
    public static void main(String []args){
    Cat cat=new Cat("huahua ","犬类");//在调用子类时，程序会先访问父类，在访问子类；程序的具体流程是：先访问父类的静态成员（即静态属性和静态代码块）；
                      // 再执行子类的静态成员；然后再执行父类的对象构造（即构造代码块和构造方法），最后执行子类的对象构造
          cat.sleep();
}
}
