package yeonghwan.project.springmodulebase.service;

import yeonghwan.project.springmodulebase.repository.BaseRepository;

import java.util.List;

public interface BaseService<E, ID, RE extends BaseRepository<E, ID>> {
    E save(E entity);
    E update(E entity);
    void delete(E entity);
    void deleteAllById(List<ID> idList);
    E findById(ID id);
    List<E> findAll();

}
