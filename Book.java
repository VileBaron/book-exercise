/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Zachary Johnson
 * @version (Insert today's date here.)
 */
class Book
{
    //The Fields    
    private String author;
    private int pages;
    private String title;
    private String refNumber;//2.88
    private int borrowed;//2.91
    boolean courseText;//2.91

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pageNumber, boolean course)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = pageNumber;
        refNumber = ""; //2.88
        courseText = course; //2.91
    }
    public int getpages()
    {
        return pages;
    }

    public String getAuthor()
    {
        return author;
    }//2.83

    public String getTitle()
    {
        return title;
    }//2.83

    public String getRefNumber(){
        return refNumber;
    }//2.88

    public int getBorrowed()
    {
        return borrowed;
    }//2.91

    public boolean isCourseText()
    {
        return courseText;
    }//2,92

    public void setRefNumber(String ref){
        if(ref.length()>3){
            refNumber = ref;
        }
        else
        {
            System.out.println("Please make your ref number large than 3 chars.");
        }
    }//2.90

    public void printAuthor()
    {
        System.out.println(author);
    }// 2.84

    public void printTitle()
    {
        System.out.println(title);
    }//2.84

    public void borrow()
    {
        borrowed = borrowed + 1;
    }//2.91

    public void printDetails() {
        System.out.println("Author: " + author + "\t Title: " + title + "\tNo of pages: " + pages + "\tNo of times borrowed: "+ borrowed + "\t Is this a course text? "+ courseText);
        if (refNumber.length() > 0)
        {
            System.out.print("Ref num: " + refNumber);
        }
        else
        {
            System.out.println("zzz");
        }
    }//2.87 & 2.89

    public static void main(String [] args)
    {
    Book book = new Book("Zachary", "Worm",50,true);
    book.setRefNumber("G00261150");
        for(int i=0;i<10;i++)
        {
        book.borrow();
        }
    }
}