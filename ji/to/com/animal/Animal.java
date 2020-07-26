package cheng.ji.to.com.animal;
//5.6.7.
/*访问修饰符的访问权限
* 1.public :没有限制哪都可以访问
* 2.private : 只能在本类中被访问
* 3.默认（即什么都不添加）：允许在本类，同包的子类和非子类被访问；不允许在跨包的子类和非子类被访问
* 4.protected:允许在本类，同包的子类和非子类；不允许在跨包的非子类被访问
* */
/*关键字final的使用
* 1.在类的前面用时，表示这个类不允许有子类了， 可以这样写 final puclic class  或  public final class
*2. 在类内的方法面前使用时，表示这个普通方法不允许被重写，但是可以被子类正常使用
*3.在类内的成员属性前用时，表示这个成员属性不允许被修改,只需在被具体使用前初始化就行（也可以直接初始化可以）：有两个使用地方1.一个是在方法内局部变量使用，那所定义的值只能在方法内存在
*                                                                                                       2.就是在内类的成员属性位置使用，在这种情况下只有两个地方可以进行赋值操作
*                                                                                                         第一是在构造方法内赋值，二是在构造代码块内赋值，但是两种只能选其一，要么
*                                                                                                           在所有的构造方法内给予赋值，要么在构造代码块内赋值
*4.用final修饰实例化对象后，不允许再次实例化对象但是可以修改里面的内容
* final Animal animal=new Animal("fafa","狗类");
  //animal=new Animal();用final修饰实例化对象后，不允许再次实例化对象但是可以修改里面的内容，例如下面
    animal.name="doudou";
    animal.species="猫类";
*
* 5.final 不可以去修饰构造方法
* 6.如果要使方法或成员属性使之不能改变其内容 用static 加上fianl 一起修饰就可以了，且位置可以前后互换 an an2可以看出来0
* */
public class Animal {
    private String name;
    protected  String species;//7.
    int age;//6.
    public final int shit;//5.
    public  final static int an=22;
    protected  static final int an2=23;
    static{
        System.out.println("我是父类的静态构码块");
    }
          /* final   */   public  Animal(){

            shit=56;
        System.out.println("我是父类的无参构造方法");
    }//父类的构造方法不允许被继承，和重写

    public Animal(String name ,String species){
       final Animal animal=new Animal("fafa","狗类");
       //animal=new Animal();用final修饰实例化对象后，不允许再次实例化对象但是可以修改里面的内容，例如下面
        animal.name="doudou";
        animal.species="猫类";
              shit=10;
              //this.name=name;
              //this.species=species;
        System.out.println("我是父类带参构造方法");
    }
    {
       // shit=56;
        System.out.println("我是父类的构造代码块");
    }

    public void  eat(){
        this.species="";
        this.age=10;
        System.out.println("eat many food");
    }
    //4.
   final  public void  eat(String name){
        System.out.println(name+"eat many food");
    }
   /*public void  run(){
        System.out.println("it run quikly");
    }*/
 /*
    private  String  eat(String name ,int age){
      return "";
    }
    private  String  eat(int age,String name){
        return "";
    }
    private  String  eat(int species,String month){
        return "";后两个只是类型的名字不相同，但是也不能相互构成重载
    }
*/  //方法重载指的是在一个类中，方法名必须相同，参数个数，类型不相同，但访问修饰符，返回类型可以不同
    /*3.方法重写：1.在有继承的类中写，重写方法名，参数列表相同（参数个数，顺序，类型）,返回值可以相同也可以不相同
     * 2.修饰访问符要大于等于父类方法的修饰访问符范围
     * 3.与方法的参数名无关（即可以修改）
     *
     * */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//重写后equals方法后就可以只比较两个内的值了
//   第一个只是进行了重写，而没有规定传入的参数范围，导致后面还要转换一下参数使之与所实例化对象类型相同才可以进行下面的比较
    //第二个直接在参数的传入出做了范围限定，只需判断传入的参数
public boolean equals(Object obj){
    if(obj==null){
        return false;}
        Animal temp=(Animal)obj;
    if((this.getName()==temp.getName())&&(this.getSpecies()==temp.getSpecies())){
        return true;
    }else
        return false;
}//第一个

    public boolean equals(Animal obj){
        if(obj==null){
            return false;}
            if((this.getName()==obj.getName())&&(this.getSpecies()==obj.getSpecies())){
               return true;
            }else
                return false;

    }//第二个
//toString 的测试
   public String toString(){
        return "name:"+this.getName()+",species:"+this.getSpecies();
    }
    //重新定义个父类的方法，看看子类的重写方法（在Cat)
    public Animal create(){
       return new Animal();
    }

}
