package yeonghwan.project.springmodulebase.service;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import yeonghwan.project.springmodulebase.repository.BaseRepository;

import java.util.List;

@Transactional
@RequiredArgsConstructor
public class BaseServiceImpl<E, ID, RE extends BaseRepository<E,ID>> implements BaseService<E, ID, RE>{
    protected final RE repository;
    @Autowired
    protected EntityManager entityManager;

    @Autowired
    protected ModelMapper modelMapper;

    @Override
    public E save(E entity) {
        return repository.save(entity);
    }
    @Override
    public E update(E entity) {
        return repository.save(entity);
    }
    @Override
    public void delete(E entity) {
        repository.delete(entity);
    }
    @Override
    public void deleteAllById(List<ID> ids) {
        repository.deleteAllById(ids);
    }

    @Override
    public E findById(ID id) {
        return repository.findById(id).orElse(null);
    }
    @Override
    public List<E> findAll() {
        return repository.findAll();
    }
}
