
package com.login3.login3.security.service;

import com.login3.login3.security.entity.Rol;
import com.login3.login3.security.enums.RolNombre;
import com.login3.login3.security.repository.RolRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RolService {
   
    @Autowired RolRepository rolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }
    
}
