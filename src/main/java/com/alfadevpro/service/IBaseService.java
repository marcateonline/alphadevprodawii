package com.alfadevpro.service;

import java.io.Serializable;
import java.util.List;

import com.alfadevpro.entities.BaseEntity;

public interface IBaseService <E extends BaseEntity, ID extends Serializable>{
	public List<E> findAll() throws Exception;
	public E findById(ID id) throws Exception;
	public E save(E entity) throws Exception;
	public E update(ID id, E entity) throws Exception;
	public boolean delete (ID id) throws Exception;

}
