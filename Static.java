// Java program to demonstrate static variable
public class Static {
    static int a = 10; // static variable
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(Static.a); // accessing static variable using class name
        Static obj = new Static();
        System.out.println(obj.a); // accessing static variable using object
    }
}
