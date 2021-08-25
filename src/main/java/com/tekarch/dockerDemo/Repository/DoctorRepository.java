package com.tekarch.dockerDemo.Repository;

import com.tekarch.dockerDemo.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor,Long>

{
}
