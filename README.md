# spring-module-base

---
1. 프로젝트에 사용할 **base** 모듈
2. 도메인에 국한하지 않고 service, repository 등에도 사용
3. 사용 프로젝트 : (wts, 홈페이지) 사용 예정
---

+ Entity : ID, 생성일, 생성자, 마지막 수정일 등 공통 속성 정의
+ Enum : 일단 getter 메소드를 인터페이스 안에 구현
+ Repository : SimpleJpaRepository -> Base 구현
+ Service : 기본적인 CRUD 로직
+ **Controller** : DTO와 entity 모두를 고려
+ H2 DB 활용하여 테스트
---
### Goal
1. DTO, Paging, Mapper 적용
2. 기반으로 Controller, Service, Repo 수정
3. Refactoring




