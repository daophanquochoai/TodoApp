package com.doctorhoai.emsbackend.service;

import com.doctorhoai.emsbackend.dto.TodoDTO;
import org.springframework.stereotype.Service;

public interface TodoService {
    TodoDTO addToDo( TodoDTO todoDTO);
    TodoDTO getTodo( Long id);
}
