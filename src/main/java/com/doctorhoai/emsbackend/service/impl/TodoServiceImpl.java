package com.doctorhoai.emsbackend.service.impl;

import com.doctorhoai.emsbackend.dto.TodoDTO;
import com.doctorhoai.emsbackend.entity.Todo;
import com.doctorhoai.emsbackend.repository.TodoRepository;
import com.doctorhoai.emsbackend.service.TodoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class TodoServiceImpl implements TodoService {
    private final TodoRepository todoRepo;
    private final ModelMapper modelMapper;
    @Override
    public TodoDTO addToDo(TodoDTO todoDTO) {
        Todo todo = modelMapper.map(todoDTO, Todo.class);
        Todo saveTodo = todoRepo.save(todo);
        TodoDTO savedTodoDto = modelMapper.map(saveTodo, TodoDTO.class);
        return savedTodoDto;
    }

    @Override
    public TodoDTO getTodo(Long id) {
        Todo todo = todoRepo.findById(id).get();
        return modelMapper.map(todo, TodoDTO.class);
    }
}
