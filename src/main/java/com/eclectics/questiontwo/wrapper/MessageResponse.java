package com.eclectics.questiontwo.wrapper;

import com.eclectics.questiontwo.entities.Messages;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MessageResponse {

    List<Messages> messages;
}
