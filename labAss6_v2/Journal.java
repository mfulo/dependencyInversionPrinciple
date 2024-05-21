package labAss6_v2;

public class Journal implements Resource{
	private String title;
	
	public Journal (String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
    
    @Override
    public void borrow() {
        System.out.println("The journal \"" + title + "\" is now ready for check out.");
    }
}
