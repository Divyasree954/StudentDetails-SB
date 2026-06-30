package org.ethnotech.studentdetailssb.Repo;

import org.ethnotech.studentdetailssb.Entity.StdEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StdRepo extends JpaRepository<StdEntity,Integer> {

    public List<StdEntity>findByIsEligible(boolean isEligible);
    public StdEntity findByrollno(int rollno);

}
