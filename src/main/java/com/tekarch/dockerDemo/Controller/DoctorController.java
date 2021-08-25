package com.tekarch.dockerDemo.Controller;

import com.tekarch.dockerDemo.Entity.Doctor;
import com.tekarch.dockerDemo.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {
    @Autowired
    private DoctorRepository doctorRepository;

    @GetMapping(value = "/doctors")
        private List<Doctor> getDoctor()
    {
        return doctorRepository.findAll();
    }
}
