class Aps {
    static int a;
}

class Static_Variable {
    static int b = 5;

    public static void main(String args[]) {
        // Aps a1 = new Aps();
        System.out.println(Aps.a);
        System.out.println(b);
    }
}
