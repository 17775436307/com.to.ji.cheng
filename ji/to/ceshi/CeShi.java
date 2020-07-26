package cheng.ji.to.ceshi;

import cheng.ji.to.com.animal.*;

public class CeShi {
    public static void main(String []args){
        Dog dog=new Dog();
       // Cat cat=new Cat();
        dog.setName("huahua");
        dog.setSpecies("小狗");

        //cat.setName("fanfan");
        //cat.setSpecies("小猫");
       // cat.eat();
        //cat.sleep();
        dog.eat( dog.getName());
       // dog.run();
         //Animal three=new Animal();
        /*Animal.sleep();
        Animal.run();*/  //不能用父类来调用子类的方法,成员。而子类却可以调用自己的方法
       // dog.eat("huahua");
         /*System.out.println(dog.temp);*/  /*5.当父类和子类同时定义同类型同名的不同变量值时，在子类的实例对象调用这个变量值时，调用的是子类自己的变量值，
        但如果去掉子类定义的变量，就是调用的父类的 */
        //three.age=23;
        //three.species="";





    }
}
