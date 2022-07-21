public class Book {
    public String name;
    public Author author; // если оставить тип переменной String, то программа работает
    public String genre;
    public int year;

    public Book(String name, Author author, String genre, int year) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.year = year;

    }

    public String toString() {
        return name + ", " + author + ", " + genre + ", " + year;
    }
    public void yearsBook(int year) {
        if (year < 1900) {
            System.out.println("Классическое произведение");
        } else {
            System.out.println("Современное прозведение");
        }
    }
}
