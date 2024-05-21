package labAss6_v2;

public class Library {

    public static void main(String[] args) {
	Student student = new Student("Kat");
    LibraryService libraryService = new LibraryService();
    
    Resource book = new Book("The Cat Who Could Read Backwards");
    Resource journal = new Journal("Journal of Feline Medicine and Surgery");

    libraryService.borrowResource(student, book);
    System.out.println();
    libraryService.borrowResource(student, journal);
    }
}


