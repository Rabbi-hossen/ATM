package week3.exercises;

public class BookShop {
    public String tital;
    public String  author;
    public int id ;
    BookShop(String name, int id){
        this.author=name;
        this.id=id;
    }
    public void setTital(String tital1){
        this.tital=tital1;
    }
    public void setAuthor(String author){
        this.author=author;
    }

    public String getAuthor() {
        return author;
    }
    public String getTital(){

        return tital;
    }
    public void detail(){
        System.out.println(" book id :"+id);
        System.out.println("author name :"+author );
        System.out.println("BOOK TITAL :"+tital);

    }

    public static void main(String[] args) {
         BookShop b= new BookShop("sakawat",111);
         b.setTital("advance java");
         b.detail();
    }

}
