package q1;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
public class MyBook extends Book {
    public void setTitle(String s) {
        this.title = s;
    }
}