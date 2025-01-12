package January;

public class MethodOverride {

    void name(){
        System.out.println("Don't Know");
    }
    }
class MethodOverride1 extends MethodOverride{
@Override
    void name (){
    super.name();
        System.out.println("My Name is Pratik");
    }
}

class Test{


    public static void main(String[] args){
        MethodOverride1 mor=new MethodOverride1();
        mor.name();

    }
}
