public class ForEach {
    public static void main(String[] args) {


        String[] names = {
                "Wahyu", "Anggara", "Sakti",
                "Calon", "Professional", "Programmer"
        };

        for (var i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("INI PAKE FOR EACH");

        for (var name: names){
            System.out.println(name);
        }

    }
}
