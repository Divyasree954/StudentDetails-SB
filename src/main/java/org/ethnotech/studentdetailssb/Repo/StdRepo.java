package org.ethnotech.studentdetailssb.Repo;

import org.ethnotech.studentdetailssb.Entity.StdEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StdRepo extends JpaRepository<StdEntity,Integer> {
}
