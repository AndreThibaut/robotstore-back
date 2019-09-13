package com.robotstore.backend;

import com.robotstore.backend.Robot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RobotRepository extends CrudRepository<Robot, Long> {
}
