package com.example.st.antonyChurch.familyDataService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.st.antonyChurch.familyData.FamilyData;
import com.example.st.antonyChurch.familyDataRepository.FamilyDataRepository;

@Service
public class FamilyDataService {

	@Autowired
		private FamilyDataRepository familyDataRepository;
	
	public List<FamilyData> getFamilyDataById(Long id) {
		return familyDataRepository.findByFamilyId(id);
		
	}

}
