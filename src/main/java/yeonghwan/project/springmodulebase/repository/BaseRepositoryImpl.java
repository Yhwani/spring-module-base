package yeonghwan.project.springmodulebase.repository;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.Querydsl;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;


// SimpleJpaRepo 로 jpaRepo 구현체 대체
public class BaseRepositoryImpl<E, ID> extends SimpleJpaRepository<E, ID> implements BaseRepository<E, ID> {
    private EntityManager entityManager;
    private Querydsl querydsl;
    public BaseRepositoryImpl(@Autowired JpaEntityInformation<E, ID> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.entityManager = entityManager;
    }

    @Override
    public Querydsl getQuerydsl() {
        return querydsl;
    }
}
