package pkgb;

public class Parent{

    protected static String name = "ABC";
    static int age=12;

    protected void printName() {
        System.out.println(name);
    }
    protected static String getName() {
        return name;
    }
}