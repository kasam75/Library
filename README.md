
멤버쉽을 묻고 아이디 정도?(MyLibrary)

맴버쉽에 저장되어 있는 기록을 불러와서 빌린책과 반납기능 그리고 책 빌리기 기능 추가하고(맴버쉽안에서 처리를 해야겠다)

맴버쉽을 갱신(저장후 초기화 사용?)

빌릴수 있는 책 목록을 띄워주고 싶고 (제목,장르,저자정도)

맴버쉽을 등록하는 기능 삭제하는 기능을 추가 하고싶다(빌린 책이 있으면 삭제가 안되는 기능도 추가 아마 쓰로우?)

그 다음 나가는 기능도 만들어야 하고

기본 창 1번 책 목록  2번 대출  3번 나가기

1-1 책목록 

2-1 책 대출기능 2-2 반납기능

맴버의 대한 데이터 책에 대한 클래스

대출된 상태인지 아니인지 한책에 권수를 한 10권 정도로
book클래스 인스턴스 하나가 책한권 각각 물리적으로 다른 책으로 설정 (한권으로 하지 않으면 뭐가 대출인지 모르고 누가 반납 안했는지 모름)
ex 1번 해리포터 판타지 조엔케이롤링
ex 2번 해리포터 판타지 조엔케이롤링
ex 3번 비밀의방 판타지 조엔케이롤링
ex 4번 비밀의방 판타지 조엔케이롤링

Library() {
bookList add;
new Book(isbn);


    }
ListIterator<Book> bookIterator = bookList.iterator();
while (bookIterator.hasNext()) {
Book book = bookIterator.next();
if (book.isbn == inputIsbn) {
bookIterator.add(book);
rentBook.remove();