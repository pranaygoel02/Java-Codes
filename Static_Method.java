class A {
    void show() {
        System.out.println("Hello");
    }

    static int add(int a, int b) {
        return (a + b);
    }
}

class Static_Method extends A {
    public static void main(String a[]) {
        Static_Method s1 = new Static_Method();
        s1.show();
        new A().show();
        System.out.println("ADD -> " + A.add(2, 3));
    }

    void show() {
        System.out.println("hello world");
    }
}
