package com.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.taskmanager.model.entity.Task;

public interface TaskRepository extends JpaRepository<Task,Long> {

}
