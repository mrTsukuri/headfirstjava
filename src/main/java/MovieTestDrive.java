/**
 * Created by Wade on 22.08.2015.
 */
class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Проигрывание фильма");
    }
}

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Как прогореть на акциях";
        one.genre = "Транедия";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Потеряный в офисе";
        two.genre = "Комедия";
        two.rating = 5;
        two.playIt();
        Movie three = new Movie();
        three.title = "Байт-Клуб";
        three.genre = "Трагедия, но в целом веселая";
        three.rating = 127;
    }
}
