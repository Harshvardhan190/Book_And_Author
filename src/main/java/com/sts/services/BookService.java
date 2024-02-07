package com.sts.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.dao.BookRepository;
import com.sts.entities.Book;

@Service
public class BookService {
	@Autowired
 private BookRepository bookRepository;
	
	
	//Get All Books
	public List<Book> getAllBooks(){
		List<Book>list=(List<Book>)this.bookRepository.findAll();
		return list;
	}
 
	//Get Single Book By ID
	public Book getBookById(int id) {
		Book book=null;
		try {
			book=this.bookRepository.findById(id);
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
		return book;
}
	//Adding A Book
	public Book addBook(Book b) {
		Book result=bookRepository.save(b);
		return result;
	}
	//Delete A Book
	public void deleteBook(int bid) {
		bookRepository.deleteById(bid);
	}
	//Update The Book
	public void updateBook(Book book,int bookId) {
		book.setId(bookId);
		bookRepository.save(book);
	}
}
