package com.rh.constats.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rh.constats.api.data.MergeRequestRaw;
import com.rh.constats.api.data.repo.MergeRequestRawMyBatisRepository;

@RestController
public class MergeRequestController {
	
    @Autowired
    private MergeRequestRawMyBatisRepository mrRawRepository;

	@GetMapping("/mergerequests")
	public List<MergeRequestRaw> getAll() {
		return mrRawRepository.findAll();
	}
}
