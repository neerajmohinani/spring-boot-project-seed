package com.company.project.service;



import java.util.List;

/**
 * Service Layer interface, Other services will implement this interface
 */
public interface Service<T> {
	
    T save(T model);
    List<T> save(List<T> models);
    void deleteById(Integer id);
    T findById(Long id);
    Iterable<T> findAll();
	
}
