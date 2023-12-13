public class Main {

    public static void main(String[] args) {
        Referat referat = new Referat();
        referat.name = new Author();
        referat.theme = "Theme";
        referat.pages = 10;

        referat.super.clone();

        for(int i=0; i<3; i++) {
            referat.Author().name.clone();
        }
    }
}