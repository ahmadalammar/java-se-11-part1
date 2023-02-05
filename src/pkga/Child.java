package pkga;

import pkgb.Parent;

public class Child extends Parent {
    static String name = "DEF";

    //**   Insert code here **//
//    private static String getName() {
//        return name;
//    }
//
//    public void testDefaultPackage() {
//         super.age; //compiler error bcoz age is default package...
//    }
    public static void main(String[] args) {
        System.out.println(new Child().getName());
    }
}
