package MyClass;

import MyInterface.MyInterfaceImp.FlyWithWings;
import MyInterface.MyInterfaceImp.Quack;

//綠頭鴨
public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
