public class Main {
    public static void main(String[] args) {
        Author tolstoyLN = new Author("Lev", "Tolstoy");
        Author dostoevskyFM = new Author("Fedor", "Dostoevsky");
        Book idiot = new Book (1867, "Idiot", dostoevskyFM);
        Book warAndPeace = new Book(1870, "War and peace", tolstoyLN);
        warAndPeace.setYear(1863);
    }
}