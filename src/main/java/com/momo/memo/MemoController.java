package com.momo.memo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
  
@Controller
public class MemoController {
	
	private final MemoService memoService;
	
	public MemoController(MemoService memoService) {
		this.memoService = memoService;
	}

	@GetMapping("/save")
	public String getForm() {
		return "insert";
	}

	@PostMapping("/save")
	public String add(@ModelAttribute("memo") Memo memo, Model model) {
		memoService.saveMemo(memo);     
		//return "redirect:/list";				
		return "redirect:/list-page";
	}
	
	@GetMapping("/list")
	public String list(Model model) {

		List<Memo> memos = memoService.getMemos();
		model.addAttribute("memos", memos);
		
		return "list";
	}
	
	@GetMapping("/detail/{id}")
	public String detail(@PathVariable("id") Long id, Model model) {
		System.out.println();
		Optional<Memo> memo = memoService.getMemoById(id);
		
		if(memo.isPresent()) {
			model.addAttribute("memo", memo.get());
		}
		
		return "detail";
	}
	
	@PostMapping("/update")
	public String updateMemo(Memo memo) {
		memoService.updateMemo(memo);	
		//return "redirect:/list";
		return "redirect:/list-page";
	}
	
	@GetMapping("/delete")
	public String deleteMemo(@RequestParam("id") Long id, Model model) {
		memoService.deleteMemo(id);		
		//return "redirect:/list";
		return "redirect:/list-page";
	}
		
	
	
	/* 페이징 처리된 list*/
	/* 자동으로 셋팅되는 파라미터들 ?page=0&size=3&sort=id */
	@GetMapping("/list-page")
	public String paging(
			@PageableDefault(page = 0, size = 7, sort = "id", direction = Sort.Direction.DESC) Pageable pageable, 
			     Model model) {

		Page<Memo> paging = memoService.getMemos(pageable);
		model.addAttribute("paging", paging);
		
		return "list-page";
	}
	
}