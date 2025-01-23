package com.example.easylo.repo;

import com.example.easylo.modal.Applications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepo extends JpaRepository<Applications,Integer> {
}
