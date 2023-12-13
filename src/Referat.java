public class Referat extends Document implements Cloneable {
    Author name = new Author();
    String theme;
    int pages;

    @Override
    public String toString() {
        return super.toString();
    }

    public Author getName() {
        return name;
    }

    public void setName(Author name) {
        this.name = name;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Referat(Author name, String theme, int pages) {
        this.name = name;
        this.theme = theme;
        this.pages = pages;
    }

    public Referat() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    String submit() {
        return "Submitted ";
    }


}
