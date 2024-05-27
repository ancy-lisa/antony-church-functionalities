package com.example.st.antonyChurch.familyDataController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.st.antonyChurch.familyData.FamilyData;
import com.example.st.antonyChurch.familyDataService.FamilyDataService;

@RestController
@RequestMapping("/familyData")
@CrossOrigin(origins = "http://localhost:4200")
public class FamilyDataController {

	@Autowired
	public FamilyDataService familyDataService;

	@GetMapping("/{id}")
	public ResponseEntity<List<FamilyData>> getFamilyDataById(@PathVariable("id") Long id) {
		List<FamilyData> familyData = familyDataService.getFamilyDataById(id);
		
			return ResponseEntity.ok().body(familyData);
	}

}
