package January;

public class StaticMethod {
    public static void main(String[] args){
        String name= "DHARITRI";
        String name1= "pratik";
        String name2="nanu";
        String name3= "jena6";


        System.out.println(name.toLowerCase());
        System.out.println(name1.toUpperCase());
        System.out.println(name.length());
        System.out.println(name1.replace("pratik","jena"));
        System.out.println(name.concat(name1).trim());
        System.out.println(name1.trim());
        System.out.println(name2.isEmpty());
        System.out.println(name2.charAt(2));
        System.out.println(name.indexOf('A'));
        System.out.println(name3.toString());
        System.out.println(name3.hashCode());


    }
}
