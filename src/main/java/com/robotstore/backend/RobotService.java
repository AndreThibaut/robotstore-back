package com.robotstore.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RobotService {

    @Autowired
    private RobotRepository robotRepository;

    public List<Robot> listRobots(){

        List<Robot> robotList = new ArrayList<>();
        robotRepository.findAll().forEach(robotList::add);
        return robotList;
    }

    public Optional<Robot> findRobot(Long id){

        return robotRepository.findById(id);
    }

    public void addRobot(Robot robot) {
        robotRepository.save(robot);
    }

    public void deleteRobot(Long id) {
        robotRepository.deleteById(id);
    }
}
