public class Book {
    // classe Livro
        public String title;
        public String author;
        public boolean avaliable;
        private int isbnBook;
        public String publisher;
        public String translatter; //if the book isn't from our home country

        //constructor
        public Book(String title, String author){
            this.title = title;
            this.author = author;
        }

        //check if the book is avaliabe
        public boolean isAvaliable(boolean avaliable){
            this.avaliable = avaliable;
            return avaliable;
        }
}
