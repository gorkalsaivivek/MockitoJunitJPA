package com.michelin.JavaMockito.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.michelin.JavaMockito.Entity.LearnerEntity;

@Repository
public interface LearnerRepository extends JpaRepository<LearnerEntity, Integer> {

}
