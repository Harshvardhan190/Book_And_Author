package com.sts.dao;

import org.springframework.data.repository.CrudRepository;

import com.sts.entities.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
public Book findById(int id);
}
