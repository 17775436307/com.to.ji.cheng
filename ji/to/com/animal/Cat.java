package cheng.ji.to.com.animal;



public class Cat extends Animal {
    private String sex;
    public int temp=10;
    public static int an3=22;
    protected  static int an4=23;
    public void setSex(String sex){
        this.sex=sex;
    }
    public String getSex(){
        return sex;
    }

    public Cat(){
        System.out.println("我是子类的无参构造方法");
    }
    //在调用子类的带参构造时如果没指定调用父类的哪个带参构造时(允许被访问的构造方法)，会默认调用父类的无参构造,用 super(类型及参数); 就可以访问父类的某些构造方法
    //但是子类的参数列表必须与父类所要调用的构造方法的参数列表一样，且必须放在放在第一行；但是如果子类构造方法中没有明确的表示要调用的父类有参构造方法，而父类也没有无参构造方法
    //程序就会出现报错
    public Cat(String name ,String species){ //子类可以用父类定义过的可以访问的非私有成员成员
        super(name,species);//第一行；
       // this();//会优先执行当前类的无参构造方法；   且this和super 不能同时出现在构造方法中调用方法（因为都要抢占第一行的位置），
        // 但能同时出现在普通方法中去调用成员属性以及同时调用子类自己的方法和调用父类的方法
        System.out.println("我是子类带参构造方法");
    }
    public static void fuct(){
       /* this.species="gougou";
        super.an=59;*/                 //this 和 super 都不能在静态方法中备用来调用
    }
    public void tiao(){
        System.out.println("kou de ");
    }
    public void sleep(){
        this.tiao();
        super.eat();
        // this.name="犬类";子类可以用父类定义过的非私有成员
       // super.species="";//表示可以调用父类被访问的方法，及成员
        //this.species="";//表示可以当前对象被访问的方法，及成员
        //super.an=25;//
       // this.an=26;//
        //this.age=20;
        //super.eat();调用父类方法
        System.out.println("一只名叫"+this.getName()+"的"+this.getSpecies()+"正在睡觉");
    }

    static{
        System.out.println("我是子类的静态代码块");
    }

    {
        System.out.println("我是子类的构造代码块");
    }
    //可以这样写（跟父类的返回值相同）
   /* public Animal create(){
        return super.create();
    }*/
   //可以这样写（跟父类的返回值不相同）
    public Cat create(){
        return new Cat();
    }
}
