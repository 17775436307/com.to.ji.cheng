package cheng.ji.to.com.animal;

public class Dog extends Animal {
//要想创建一个子类，则在创建好类后，在类的后面加上extends 再加父类的 类名；
        private double  weight;
    public int temp=300;//5.
        public void setWeight(double weight){
            this.weight=weight;
        }
       public double getWeight(){
            return weight;
       }

       public Dog(){

       }
   /* public void eat(){
         // super.run();//2.super.run();这样直接可以调用父类的方法，而run();这样只能用自己重写的方法
         System.out.println("it won't to eat！");

    }*/

    public void run(){
        //super.eat();调用父类方法
        System.out.println("一只名叫"+this.getName()+"的"+this.getSpecies()+"正在快速的跑");

    }
//1.在子类可以直接调用父类的其它成员（用this.+ 得到成员的方法），
/*
    private  String run(String name ,int age){
      return "";
    }
    private  String  run(int age,String name){
        return "";
    }
    private  String  run(int species,String month){
        return "";后两个只是类型的名字不相同，但是也不能相互构成重载
    }
*/  //方法重载指的是在一个类中，方法名必须相同，参数个数，类型不相同，但访问修饰符，返回类型可以不同
    //3.方法重写：在有继承的类中写，重写方法名，参数列表相同（参数个数，顺序，类型）,还有方法的返回值相同
    //还有但是与方法的参数名无关（即可以修改参数名）
    //还有可以修改重写方法的修饰访问符，但是修饰访符必须大于等于父类中被重写方法修饰符的访问范围

    //子类方法重写
    public void  eat(){
        System.out.println("eat many food");
    }
    //4..给父类创建一个下面这个方法，再给子类创建一个下面这个方法，只不过把参数的名给改了也行；也可以不给父类创建一个下面这个方法，只给子类自己创建，就相当于重载
  /* public void  eat(String month){
        System.out.println( month+" eat many food");

   }*/
}
