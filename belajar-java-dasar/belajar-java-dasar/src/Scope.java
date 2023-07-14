public class Scope {
    public static void main(String[] args) {
    sayHello("Anggara");
    sayHello("");
    }

    static void sayHello(String name){
        String hello = "Hello " + name;

        if(!name.isBlank()){
            String Woey = "Woey " + name;
            System.out.println(Woey);
        }

        System.out.println(hello);
    }
}
