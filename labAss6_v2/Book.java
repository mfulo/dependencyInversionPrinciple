package labAss6_v2;

public class Book implements Resource{
	private String title;
	
	public Book(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
    
    @Override
    public void borrow() {
        System.out.println("The book \"" + title + "\" is now ready for check out.");
    }
}
