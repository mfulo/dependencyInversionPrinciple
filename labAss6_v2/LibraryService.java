package labAss6_v2;

public class LibraryService {
	public void borrowResource(Student student, Resource resource) {
        System.out.println(student.getName() + " would like to borrow: " + resource.getTitle());
        resource.borrow();
    }
}
