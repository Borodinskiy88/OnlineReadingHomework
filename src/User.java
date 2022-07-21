public class User {
    public String email;
    public String name;
    public String surename;
    public static int totalOnline = 0;

    public User(String email, String name, String surename) {
        this.email = email;
        this.name = name;
        this.surename = surename;
        this.totalOnline ++;
    }
}
