package MyClass;

import MyInterface.MyInterfaceImp.FlyNoWay;
import MyInterface.MyInterfaceImp.Quack;
import MyInterface.QuackBehavior;

//模型鴨
public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck.");
    }
}
