package com.robotstore.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RobotController {

    @Autowired
    RobotService robotService;

    @GetMapping("/robots")
    public List listRobots(){
        return robotService.listRobots();
    }

    @GetMapping("/robots/{id}")
    public Optional<Robot> findRobot(@PathVariable Long id){
        return robotService.findRobot(id);
    }

    @PostMapping("/robots")
    public void addRobot(@RequestBody Robot robot){
        robotService.addRobot(robot);
    }

    @DeleteMapping("/robots/{id}")
    public void deleteRobot(@PathVariable Long id){
        robotService.deleteRobot(id);
    }

}
