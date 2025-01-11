package January;

public class Variable {

    static int b= 12;  //static variable inside class but outside method and its Not required Object.
    int c= 2000;     //instance Variable nside class but outside method and its required Object.


    public static void main(String[] args){
        System.out.println(Variable.b);


Variable v=new Variable();
v.Local();

Variable v1=new Variable();
v1.Instance();
    }

    void Local(){
        int a =24;   //Local Variable inside the method.
        System.out.println(a);


        }

    void Instance(){
        System.out.println(c);
    }

}
