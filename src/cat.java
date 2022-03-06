import com.sun.org.apache.xml.internal.security.utils.XMLUtils;

abstract class Dog {
    public abstract void Catch();
}
class Cat{
    public void CatchMouse(){
        System.out.println("抓老鼠");
    }
}
class Adapter extends Dog {
    private Cat cat;
    public Adapter (){
        cat=new Cat() ;
    }

    @Override
    public void Catch() {
        cat.CatchMouse() ;
    }
}
