public class Main {
    public static void main(String[] args) {
                System.out.println("Задание1.");
                Author ivan = new Author("Иван", "Иванович");
                Author andrey = new Author("Андрей", "Андреевич");

                Book book1 = new Book("Война и мир", ivan, 1998);
                System.out.println("Название = " + book1.getName());
                System.out.println("Автор = " + book1.getAuthor());
                System.out.println("Год издания = " + book1.getYear());
                book1.setYear(1888);
                System.out.println("Новый год издания = " + book1.getYear());
                System.out.println("-----------------");

                Book book2 = new Book("Унесенные ветром", andrey, 1655);
                System.out.println("Название = " + book2.getName());
                System.out.println("Автор = " + book2.getAuthor());
                System.out.println("Год издания = " + book2.getYear());
                System.out.println(book1.equals(book2));
                System.lineSeparator();
            }
        }