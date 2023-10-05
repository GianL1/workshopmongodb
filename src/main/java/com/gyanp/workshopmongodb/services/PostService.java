package com.gyanp.workshopmongodb.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gyanp.workshopmongodb.domain.Post;
import com.gyanp.workshopmongodb.repository.PostRepository;
import com.gyanp.workshopmongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	
	public Post findById(String id) {
		Post post = repo.findById(id).orElse(null);
		
		if(post == null) {
			throw new ObjectNotFoundException("Objeto não Encontrado");
		}
		
		return post;
	}
	
	public List<Post> findByTitle(String title) {
		
		return repo.searchTitle(title);
	}
	
public List<Post> fullSearch(String text, Date minDate, Date maxDate) {
		
		maxDate = new Date(maxDate.getTime()+24 * 60 * 60 * 1000);
		
		return repo.fullSearch(text, minDate, maxDate);
	}
}
