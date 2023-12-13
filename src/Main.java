public class Main {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        Referat referat = new Referat();
        referat.name = new Author();
        referat.theme = "Theme";
        referat.pages = 10;


    }
}