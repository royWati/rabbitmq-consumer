package com.eclectics.questiontwo.repository;

import com.eclectics.questiontwo.entities.Messages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Messages,Integer> {

}
