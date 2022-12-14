public class Main {
    public static void main(String[] args) {
        Author tolstoyLN = new Author("Lev", "Tolstoy");
        Author dostoevskyFM = new Author("Fedor", "Dostoevsky");
        Book idiot = new Book (1867, "Idiot", dostoevskyFM);
        Book warAndPeace = new Book(1877, "War and peace", tolstoyLN);
        warAndPeace.setYear(1863);
        System.out.println(dostoevskyFM);
        System.out.println(warAndPeace);
    }
}