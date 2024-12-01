package com.momo.memo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MemoService {
	
	private final MemoRepository memoRepository;
	
	public MemoService(MemoRepository memoRepository) {
		this.memoRepository = memoRepository;
	}

	public Memo saveMemo(Memo memo) {
		return memoRepository.save(memo);
	}
	
	public List<Memo> getMemos() {	
		return memoRepository.findAll();
	}
	
	public Optional<Memo> getMemoById(long id) {
		return memoRepository.findById(id);
	}


	public Memo updateMemo(Memo memo) { 			
		return memoRepository.save(memo);
	}

	public void deleteMemo(Long id) {
		memoRepository.deleteById(id);
	}	
	
	public Page<Memo> getMemos(Pageable pageable) {
	    Page<Memo> paging = memoRepository.findAll(pageable);
	    return paging;

	}
	
	/*
	 * public List<Memo> search(String keyword){ return
	 * memoRepository.findByContentContaining(keyword); }
	 */
	
}
