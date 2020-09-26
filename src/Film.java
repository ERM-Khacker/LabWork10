public class Film {
    //Создать класс Film. Описать поля: Название, продолжительность, жанр.
    private String name;
    private double duration; //в часах
    private String genre;
    final String SCIENCE_FICTION = "Фантастика";
    final String COMEDY = "Комедии";
    final String HORRORS = "Ужасы";

    //Добавить блок инициализации в котором вывести на экран сообщение: «Создается новый Фильм».
    static {
        System.out.println("Создается новый фильм!");
    }

    //Создать конструктор с параметрами, геттеры и сеттеры.
    //В конструкторе добавить вывод на экран сообщение: «Фильм “название”, успешно создана.»
    public Film(String nameFilm, String genre, double duration) {
        name = nameFilm;
        this.genre = genre;
        this.duration = duration;
        System.out.println("Фильм " + name + ", успешно создана.");
        System.out.println("Жанр: " + genre + ", Продолжительность: " + duration + " часа");
    }
    void genre(){
        System.out.println(SCIENCE_FICTION + " " + HORRORS + " " + COMEDY);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
/*
1  Создание класса с блоком инициализации

        1.1 Создать класс Film. Описать поля: Название, продолжительность, жанр. Создать
        конструктор с параметрами, геттеры и сеттеры.

        1.2 Добавить константные поля жанров, например: комедия, фантастика, ужасы.
        Примечание, для создания экземпляра класса Film, пользоваться этими константами.

        1.3 Добавить блок инициализации в котором вывести на экран сообщение: «Создается
        новый Фильм».
        В конструкторе добавить вывод на экран сообщение: «Фильм “название”, успешно
        создана.»*/
