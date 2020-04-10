package bridge;

abstract class icon{
    protected implementation impl;
    protected icon(implementation impl){
        this.impl=impl;
    }
    public void display(){
        
    }
}
class file_icon extends icon{
    int size;
    public file_icon(int size,implementation impl) {
        super(impl);
        this.size=size;
    }
    @Override
    public void display(){
        impl.type();
        System.out.println("This is a file.\n ");
    }
}
class picture_icon extends icon{
    int size;
    public picture_icon(int size,implementation impl) {
        super(impl);
        this.size=size;
    }
    @Override
    public void display(){
        impl.type();
        System.out.println("This is a picture \n");
    }
}

interface implementation{
    public void type();
}
class win_impl implements implementation{
    String type;
    @Override
    public void type(){
        this.type="windows";
        System.out.println("OS type is "+this.type);
    }
}
class linux_impl implements implementation {
    String type;
    @Override
    public void type(){
        this.type="linux";
        System.out.println("OS type is "+this.type);
    }
}
public class Bridge {
    public static void main(String[] args) {
        win_impl w = new win_impl();
        linux_impl l = new linux_impl();
        icon i1 = new file_icon(12,w);
        icon i2 = new file_icon(23,l);
        icon i3 = new picture_icon(34,w);
        icon i4 = new picture_icon(45,l);
        i1.display();
        i2.display();
        i3.display();
        i4.display();
    }   
}
