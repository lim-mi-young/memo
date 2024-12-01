package com.momo.memo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
  
@SpringBootTest
class MemoApplicationTests {

	@Autowired
	private MemoRepository memoRepository;
	
	@Test
	void contextLoads() {
		/*
			Memo memo1 = new Memo();
			memo1.setContent("안녕하시렵니까?");			
			//memoRepository.save(memo1);
			
			Memo memo2 = new Memo();
			memo2.setContent("안녕하세요?");			
			//memoRepository.save(memo2);
			
			List<Memo> memo3 = memoRepository.findAll();
			//assertEquals(2, memo3.size());
			
			Memo memo = memo3.getLast();
			//assertEquals("안녕하세요?", memo.getContent());			
			
			Optional<Memo> memo4 = memoRepository.findById(1L);
			
			if(memo4.isPresent()) {
				Memo m = memo4.get();
				//assertEquals("안녕하시렵니까?", m.getContent());
				
			}
			
			//assertEquals(2, memoRepository.count());
			
			//memoRepository.deleteById(1L);
			
			//assertEquals(1, memoRepository.count());
						
			
			Memo memo5 = new Memo();
			memo5.setContent("스페이스씨엘, 안녕~");			
			//memoRepository.save(memo5);
			
			//assertEquals(2, memoRepository.findByContentContaining("안녕").size());
			//assertEquals(13, memoRepository.findByContentContaining("안녕").size());
			//assertEquals(13, memoRepository.findByIdContainingOrContentContaining("2", "a").size());
			//memoRepository.searchByIdOrContent(1l, "a").forEach(x -> System.out.println(x.getId() + " : " + x.getContent()));
			//memoRepository.searchByIdContainingOrContentContaining(0, "p").forEach(x -> System.out.println(x.getId() + " : " + x.getContent()));
	*/
	}

}
