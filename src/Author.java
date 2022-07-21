public class Author {
    public String author;
    public String country;
    public String language;

    public Author(String author, String country, String language) {
        this.author = author;
        this.country = country;
        this.language = language;
    }
    public String toString() {
        return author + ", " + country + ", " + language;
    }
}