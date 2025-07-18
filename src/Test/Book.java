package Test;

public class Book {
    int isbn;
    String bookName;
    String genreString;
    String writer;
    public Book(int isbn, String bookName, String genreString, String writer) {

        this.isbn = isbn;
        this.bookName = bookName;
        this.genreString = genreString;
        this.writer = writer;
    }
}
//<Book>가능
//포문활용? 리스트가 열개있으면 하나씩 불러오는데 포문을 쓰면 하나씩 꺼내서 쓸수 있음
//향상된 포문 다시보기
//일반적으로 '상태' 값을 부여하는 불리언을 폴스면 대출 안된상태 트루면 대출 된상태 이즈 론등을 써서 라이브러리에서 리스를 폴스값(대여x)을 다 주고 시작
//메인에서 폴스 보여줌(보유책 목록과 대여 할때)그러고 트루값을 부여 반납 할때는 트루값이 주어진 값을 폴스로 변환
//상태값을 여러개 주는것이 이넘 (정확히는 상수값)