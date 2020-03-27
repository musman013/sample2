package com.nfinity.ll.testapp1.domain.irepository; 
 
import com.nfinity.ll.testapp1.domain.model.JwtEntity; 
import org.springframework.data.jpa.repository.JpaRepository; 
 
import java.util.List; 

public interface IJwtRepository extends JpaRepository<JwtEntity, Long> { 

    JwtEntity findByToken(String token); 
    
} 