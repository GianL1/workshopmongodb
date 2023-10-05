package com.gyanp.workshopmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gyanp.workshopmongodb.domain.User;
import com.gyanp.workshopmongodb.dto.UserDTO;
import com.gyanp.workshopmongodb.repository.UserRepository;
import com.gyanp.workshopmongodb.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) {
		User user = repo.findById(id).orElse(null);
		
		if(user == null) {
			throw new ObjectNotFoundException("Objeto não Encontrado");
		}
		
		return user;
	}
	
	public User insert(User obj) {
		
		return repo.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		
		repo.deleteById(id);
	}
	
	public User update(User obj) {
		User newObj = repo.findById(obj.getId()).orElse(null);
		updateData(newObj, obj);
		return repo.save(newObj);
	}
	
	private void updateData(User newObj, User obj) {
		newObj.setNome(obj.getNome());
		newObj.setEmail(obj.getEmail());
	}

	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getNome(), objDto.getEmail());
	}
}
