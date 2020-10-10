public class Library {
    //Создать класс Library.
    //Описать поля: Массив из фильмов, название библиотеки.
    private final String nameLibraries;
    public Film[] films;

    //Добавить блок инициализации в котором создается массив (с размером 5) для поля списка фильмов.
    {
        //Заполнить первые 2 элемента массива прямо в блоке инициализации. Создать 2 своих
        //любимых фильма, и добавить в массив. Вывести сообщения на экран: “Добавлены любимые фильмы”
        films = new Film[5];
        films[0] = new Film("The Matrix", "Cyberpunk", 2.30);
        films[1] = new Film("The Matrix Reloaded", "Cyberpunk", 2.35);
        System.out.println("Добавлены любимые фильмы");
        System.out.println(returnCell());
        System.out.println();
        //Повторить шаги 4.1 - 4.2, пока не будет достигнут лимит
        //Implement check filling of array with movies
        System.out.println(implementCheck(new Film("The Matrix Revolution","Cyberpunk",3.20)));
        System.out.println(implementCheck(new Film("Some film","some genre",2.23)));
        System.out.println(implementCheck(new Film("Some film","Some Genre",3.10)));
        System.out.println(implementCheck(new Film("Some film","any genre",2.20)));
    }

    //Добавить конструктор для класса Library, который принимает и инициализирует имя
    //библиотеки. Вывести сообщение на экран: «Библиотека “название”, успешно создана.»
    public Library(String nameLibraries) {
        this.nameLibraries = nameLibraries;
        System.out.println("Библиотека " + nameLibraries + ", успешно создана");
    }

    // we are checking this method is it filled array or non filled
    public int returnCell(){
        for (int i = 0; i < films.length; i++) {
            if (films[i] == null)
                return i;
        }
        return -1;
    }

    // using this method i am implement of check for an availability empty cell. If cell in array is
    // empty then method return index, if in array all cells occupied then method return:
    // Вы достигли лимита
    public String implementCheck(Film film) {
        int indexOfArray = returnCell();
        if (indexOfArray == -1) {
            return "Вы достигли лимита";
        } else {
            films[indexOfArray] = film;
            return "your film was added to cell with index: " + indexOfArray;
        }
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
