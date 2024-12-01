package com.momo.memo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<Memo, Long>{
	Page<Memo> findAll(Pageable pageable);   //페이지 처리	
	List<Memo> findByContentContaining(String keyword); // 되는거. 검색 처리 select ... like %:username%
	
	
	//List<Memo> findByContentContainingIgnoreCase(String keyword); //되는거. 검색 처리 select ... like %:username%
	
	//List<Memo> findByIdContainingOrContentContaining(long id, String content); //안되는거. 검색 처리 select ... like %:username%
	
	//List<Memo> searchByIdOrContent(long id, String content); //되는거임
	//List<Memo> searchByIdOrContentContaining(long id, String content); //되는거임
	//List<Memo> searchByIdContainingOrContentContaining(long id, String content); //String 타입만 like가 되는듯하다.
}
