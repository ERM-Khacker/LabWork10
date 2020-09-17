public class Main {
    public static void main(String[] args) {
        Film film = new Film("The Dark Tower", "Horrors, Fantasy, Western", 2.35);
        System.out.println();

        film.setName("The Hobbit: An Unexpected Journey! ");
        film.setGenre("Fantasy, Adventures, ");
        film.setDuration(2.49);
        System.out.println(film.getName() + film.getGenre() + film.getDuration() + " часа");
        System.out.println();

        Film film1 = new Film("The Hobbit: The Desolation of Smaug", "Fantasy, Adventures", 2.41);
        System.out.println();

        film1.setName("The Hobbit: The Battle of the Five Armies! ");
        film1.setGenre("Приключения, фентези ");
        film1.setDuration(2.44);
        System.out.println(film1.getName() + film1.getGenre() + film1.getDuration() + " часа");

        film1.genre();

        Library films = new Library("Favorites");
    }
}
