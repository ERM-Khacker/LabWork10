public class Library {
    private final String NAME_LIBRARIES;
    private String nameFilm;

    static {
        String[] films = {"The Matrix", "The Matrix Reloaded", "The Matrix Revolutions", "Saving private Ryan",
                "The King’s Speech"};
        System.out.println("Добавлены любимые фильмы");
        for (int i = 0; i < films.length; i++) {
           //System.out.println(films[i]);
            if (i != 0){
                System.out.println(films[i]);
                break;
            }else {
                System.out.println(-1);
            }

        }
    }


    public Library(String NAME_LIBRARIES) {
        this.NAME_LIBRARIES = NAME_LIBRARIES;
        System.out.println("Библиотека " + NAME_LIBRARIES + ", успешно создана");
    }

    public String getNAME_LIBRARIES() {
        return NAME_LIBRARIES;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }
}
    /*Создать класс Library.
        Описать поля: Массив из фильмов, название библиотеки.
        Добавить блок инициализации в котором создается массив (с размером 5) для поля
        списка фильмов.

        2.1 Поле экземпляра класса «имя» пометить модификатором final.

        2.2 Заполнить первые 2 элемента массива прямо в блоке инициализации. Создать 2 своих
        любимых фильма, и добавить в массив.

        2.3 Вывести сообщения на экран: “Добавлены любимые фильмы”

        2.4 Добавить конструктор для класса Library, который принимает и инициализирует имя
        библиотеки. Вывести сообщение на экран: «Библиотека “название”, успешно создана.»

        2.5  Создать геттеры для полей имя и список фильмов.

        3  Создать класс Main c методом main.
        В методе main создать экземпляр класса Library.
        Запустить программу, проверить порядок вывода сообщений.

        4  Написать метод, который находит первую пустую ячейку массива с фильмами и
        возвращает индекс, если массив полностью заполнен возвращает -1.

        4.1 В методе main реализовать проверку на наличие пустой ячейки и добавить в нее новый
        фильм, если пустой ячейки уже нет – вывести сообщение: «Вы достигли лимита».

        4.2 Запустить, проверить результат выполнения программы

        4.3 Повторить шаги 4.1 - 4.2, пока не будет достигнут лимит.*/
