package January;

public class StaticVariable {

    static int a= 24;
     void stac(){
         int b=12;
         System.out.println(a+""+b);
         ++a; ++b;
    }
    public static void main(String[] args){
        StaticVariable s=new StaticVariable();
        s.stac();
        s.stac();
    }

   }
