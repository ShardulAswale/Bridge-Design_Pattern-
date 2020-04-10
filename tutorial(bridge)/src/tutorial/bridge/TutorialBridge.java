package tutorial.bridge;

import java.util.Scanner;

abstract class vehicle {

    protected implementation p;
    protected implementation a;

    protected vehicle(implementation p,implementation a) {
        this.p = p;
        this.a = a;
    }

    public void display() {

    }
}

class bus extends vehicle {
    public bus(implementation p,implementation a) {
        super(p,a);
        
    }

    @Override
    public void display() {
        p.process();
        a.process();
        System.out.println("\nYour bus is ready.\n \n");
    }
}

class bike extends vehicle {
    public bike(implementation p,implementation a) {
        super(p,a);
    }

    @Override
    public void display() {
        p.process();
        System.out.println("\nYour bike is ready.\n \n");
    }
}
class cycle extends vehicle {
    public cycle(implementation p,implementation a) {
        super(p,a);
    }

    @Override
    public void display() {
        a.process();
        System.out.println("\nYour cycle is ready.\n \n");
    }
}

interface implementation {

    public void process();
}

class produce implements implementation {

    @Override
    public void process() {
        System.out.println("\nThis is production process. ");
        System.out.println("Loading please wait");

        System.out.println("Production process complete.");
    }
}

class assemble implements implementation {

    String process;

    @Override
    public void process() {
        System.out.println("\nThis is assembly process. ");
        System.out.println("Loading please wait");
        System.out.println("assembly process complete.");
    }
}

public class TutorialBridge {

    public static void main(String[] args) {
        produce p;
        assemble a;
        vehicle v;
        Scanner s = new Scanner(System.in);
        boolean f = true;
        while (f==true) {
            System.out.println("what kind of product do you want to buy.\n1.Bike \n2.Bus\n3.Cycle\n4.Exit");
            int x = s.nextInt();
            switch (x) {
                case 1:
                    p = new produce();
                    a = null;
                    v = new bike(p,a);
                    v.display();
                    break;
                case 2:
                    p = new produce();
                    a = new assemble();
                    v= new bus(p,a);
                    v.display();
                    break;
                case 3:
                    p = null;
                    a = new assemble();
                    v= new cycle(p,a);
                    v.display();
                    break;
                case 4:
                    System.out.println("Thank you for shopping please visit again");
                    f=false;
                    break;
                default:
                    System.out.println("invalid choice");
            }

        }
    }
}
