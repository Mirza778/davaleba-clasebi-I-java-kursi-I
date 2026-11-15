public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("ვეფხისტყაოსანი", "შოთა რუსთაველი", 300);
        Book book2 = new Book("დათა თუთაშხია", "ჩაბუა ამირეჯიბი");

        book1.displayBookInfo();
        book2.displayBookInfo();

        Rectangle rect = new Rectangle(3.0, 4.0);
        System.out.println("პერიმეტრი" + rect.perimeter());
        System.out.println("ფართობი" + rect.area());
        System.out.println("დიაგონალი" + rect.diagonal());
        System.out.println("არის თუ არა კვადრატი " + rect.isSquare());

        Time time = new Time(14, 5, 9);
        time.printTime();}}

class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 0;
    }

    public void displayBookInfo() {
        System.out.println("სათაური " + title);
        System.out.println("ავტორი" + author);
        System.out.println("გვერდების რაოდენობა " + pages);
    }
}

class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public double area() {
        return length * width;
    }

    public double diagonal() {
        double sumOfSquares = (length * length) + (width * width);
        if (sumOfSquares == 0) {
            return 0;
        }

        double guess = sumOfSquares / 2.0;
        for (int i = 0; i < 20; i++) {
            guess = (guess + sumOfSquares / guess) / 2.0;
        }
        return guess;
    }

    public boolean isSquare() {
        return length == width;
    }
}

class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void printTime() {
        System.out.println(String.format("%02d:%02d:%02d", hour, minute, second));
    }
}