package org.scu.db.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.scu.db.demo.model.Book;

import java.util.List;
import java.util.Map;

@Mapper
public interface BookMapper {
    List<Book> queryBook();

    List<Map> query_call_and_count();

    List<Integer> findAllBorrowedBooksId();

    int countCall123Book();

    List<String> findCountNotExceed2Callnumber();

    void insertBook(Book book);

    Book findBookById(Integer bookId);

    Boolean updateBook(Book book);

    void deleteBookById(Integer bookId);

}
