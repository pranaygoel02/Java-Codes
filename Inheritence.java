class A {
    int a = 2;
}

class B extends A {
}

class C extends B {
}

class Inheritence {
    public static void main(String... ar) {
        C c = new C();
        System.out.println(c.a);
        c.a = 4;
        System.out.println(c.a);
    }
}
