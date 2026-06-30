package org.ethnotech.studentdetailssb.Service;

import org.ethnotech.studentdetailssb.Entity.StdEntity;
import org.ethnotech.studentdetailssb.Repo.StdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StdService {

    @Autowired
    private StdRepo repo;

    public StdEntity storeData(StdEntity S){
        if(S.getAge()>0){
            S.setEligible(true);
            return repo.save(S);
        }
            return null;

    }

    public List<StdEntity> findAll() {
        return repo.findAll();
    }

    public List<StdEntity> getByEle(boolean isEligible) {
        return repo.findByIsEligible(isEligible);
    }


    public StdEntity getRoll(int i) {
        return repo.findByrollno(i);
    }
}
