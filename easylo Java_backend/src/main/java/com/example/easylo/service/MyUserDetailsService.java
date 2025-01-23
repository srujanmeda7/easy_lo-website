package com.example.easylo.service;

import com.example.easylo.modal.Admin;
import com.example.easylo.modal.AdminPrinciple;
import com.example.easylo.repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
@Autowired
private AdminRepo adminRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Admin admin=adminRepo.findByUsername(username);
        if(admin==null){
            throw new UsernameNotFoundException("USER NOT FOUND");
        }
        return new AdminPrinciple(admin);
    }
}
