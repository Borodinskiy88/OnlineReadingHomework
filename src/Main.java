public class Main {

    public static void main(String[] args) {
        System.out.println();

        Author author1 = new Author("Достоевский", "Россия", "язык произведений русский");
        Author author2 = new Author("Хэмингуэй", "США", "язык произведений английский");
        Author author3 = new Author("Пушкин", "Россия", "язык произведений русский");
        Author author4 = new Author("Оруэлл", "США", "язык произведений английский");

        Book book = new Book("Идиот", author1, "проза", 1886);
        System.out.println(book);
        book.yearsBook(book.year);
        System.out.println();

        Book book2 = new Book("Старик и море", author2, "проза", 1952);
        System.out.println(book2);
        book.yearsBook(book2.year);
        System.out.println();

        Book book3 = new Book("Евгений Онегин", author3, "стихи", 1833);
        System.out.println(book3);
        book.yearsBook(book3.year);
        System.out.println();

        Book book4 = new Book("1984", author4, "проза", 1949);
        System.out.println(book4);
        book.yearsBook(book4.year);
        System.out.println();

        User user1 = new User("gandi@mail.ru", "Махатма", "Ганди");
        User user2 = new User("mandela@mail.ru", "Нельсон", "Мандела");
        User user3 = new User("solghenicyn@mail.ru", "Александр", "Солженицын");
        System.out.println("Пользователей в библиотеке: " + User.totalOnline);

    }
}