import MyClass.Duck;
import MyClass.MallardDuck;
import MyClass.ModelDuck;
import MyInterface.MyInterfaceImp.FlyRocketPowered;

public class MainProgram {

    public static void main(String[] args){
        System.out.println("Hello world");
        System.out.println("This is CH1. >> Strategy Pattern << .");
        System.out.println("=================================================");

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        System.out.println("-------------------------------------------------");

        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
