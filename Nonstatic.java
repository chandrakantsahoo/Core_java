// Java program to demonstrate non-static variable
public class Nonstatic {
    int a = 10; // non-static variable

    public static void main(String[] args) {
        Nonstatic obj = new Nonstatic();
        System.out.println(obj.a);// accessing non-static variable using object
    }
}
