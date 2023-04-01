package com.example.library_pr.repositories;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library_pr.models.Book;
import com.example.library_pr.models.Feedback;
import com.example.library_pr.models.User;


public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
  List<Feedback> findByBookId(Long bookId);
  List<Feedback> findByUserAndBook(User user,Book book);
  @Transactional
  void deleteByBookId(long bookId);
}