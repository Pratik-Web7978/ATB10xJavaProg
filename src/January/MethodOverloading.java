package January;

public class MethodOverloading {

    void sum(){
        int a=24, b=12;
        System.out.println(a+b);
    }

    void sum(int x, int y){

        System.out.println(x+y);

    }
    void sum(int x, double y){
        System.out.println(x+y);

    }
    public static void main(String[] args){

        MethodOverloading mol=new MethodOverloading();

        mol.sum(2002,2000);
        mol.sum(02,11.02);
        mol.sum();

    }

}
