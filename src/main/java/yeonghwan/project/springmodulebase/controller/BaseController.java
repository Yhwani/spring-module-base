package yeonghwan.project.springmodulebase.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import yeonghwan.project.springmodulebase.repository.BaseRepository;
import yeonghwan.project.springmodulebase.service.BaseService;

/**
 * controller 은 API 에 따라 다양할 수 있으므로 추상 클래스로 만든다
 * @param <E>   entity
 * @param <ID>  entity id
 * @param <S>   BaseService 다형성 위한 인터페이스 타입
 */
public abstract class BaseController<E, ID, RE, RQ, S extends BaseService<E, ID, ? extends BaseRepository<E, ID>>>{
    @Autowired
    protected S service;
    @Autowired
    protected ModelMapper mapper;
    RQ request;
    RE response;

}
