package com.example.easylo.service;

import com.example.easylo.modal.Admin;
import com.example.easylo.modal.Applications;
import com.example.easylo.repo.AdminRepo;
import com.example.easylo.repo.ApplicationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formservice {

    @Autowired
    private ApplicationRepo repo;
    @Autowired
    private AdminRepo adminRepo;
    public void submit(Applications application) {
         repo.save(application);
    }
BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder(12);
    public void add(Admin admin) {
        admin.setPassword(bCryptPasswordEncoder.encode(admin.getPassword()));
        adminRepo.save(admin);
    }

    public List<Applications> view() {
        return repo.findAll();
    }
}
