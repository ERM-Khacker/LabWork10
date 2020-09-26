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
        System.out.println();

        //Declaration and create object films
        Film film2 = new Film("Harry Potter", "Fantasy", 3.20);
        //Create new object class of Library
        Library fav = new Library("Favorites"); //В методе main создать экземпляр класса Library.
        //Create a new array films
        Film[] filmsA = new Film[3];
        filmsA[0] = film1;
        filmsA[1] = film2;
        // answer with this incomplete array: your film was added to cell with index: 2
        // if i will to add next string code, a.i. will add to array a new film
        // then the following output is displayed:
        filmsA[2] = film;
        // Вы достигли лимита

        //Повторить шаги 4.1 - 4.2, пока не будет достигнут лимит
        //Implement check filling of array with movies
        System.out.println(fav.implementCheck(filmsA, film));


    }
}
