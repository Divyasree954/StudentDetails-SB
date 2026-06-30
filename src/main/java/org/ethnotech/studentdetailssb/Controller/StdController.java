package org.ethnotech.studentdetailssb.Controller;

import org.ethnotech.studentdetailssb.Entity.StdEntity;
import org.ethnotech.studentdetailssb.Service.StdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StdController {

    @Autowired
    private StdService service;

    @PostMapping("/add")
    public StdEntity add(@RequestBody StdEntity S) {
        return service.storeData(S);
    }
    @GetMapping("/findAll")
    public List<StdEntity> findAll(){
        return service.findAll();
    }
    @GetMapping("/getEle")
    public List<StdEntity>getEle(){
        return service.getByEle(false);
    }
    @GetMapping("/getRoll/{rollno}")
//    public StdEntity getRoll(){
//        return service.getRoll(4);
//    }
    public StdEntity getRoll(@PathVariable int rollno){
        return service.getRoll(rollno);
    }

}
